import React, { useState, useEffect, useCallback, useMemo } from "react";

import axios from 'axios';
import './Categorias.css';

import Modal from '../../Components/Modal/Modal'

export default function Categorias() {
  const [isModalOpenAtualizar, setIsModalOpenAtualizar] = useState(false);
  const [isModalOpenErro, setIsModalOpenErro] = useState(false);
  const [categorias, setCategorias] = useState([]);
  const [novaCategoria, setNovaCategoria] = useState({ nome: '' });
  const [categoriaSelecionada, setCategoriaSelecionada] = useState(null);
  const [erro, setErro] = useState(null);
  const [isLoading, setIsLoading] = useState(false);

  useEffect(() => {
    carregarCategorias();
  }, []);

  const carregarCategorias = useCallback(async () => {
    setIsLoading(true);
    setCategorias([]);
    try {
      const response = await axios.get('http://127.0.0.1:8000/listar_categorias');
      setCategorias(response.data);
    } catch (error) {
      setErro({ status: error.response.status, message: error.response.statusText })
      openModalErro()
    } finally {
      setIsLoading(false);
    }
  }, []);

  async function adicionarCategoria() {
    setIsLoading(true);
    try {
      const data = novaCategoria;
      if (data.nome !== '') {
        await axios.post('http://127.0.0.1:8000/incluir_categoria', data);
        setNovaCategoria({ nome: '' });
        carregarCategorias();
      }
    } catch (error) {
      setErro({ status: error.response.status, message: error.response.statusText })
      openModalErro()

    } finally {
      setIsLoading(false);
    }
  }

  async function atualizarCategoria() {
    setIsLoading(true);
    try {
      closeModalAtualizar();
      const data = { id: categoriaSelecionada.id, nome: categoriaSelecionada.nome };
      await axios.put(`http://127.0.0.1:8000/atualizar_categoria/${categoriaSelecionada.id}`, data);
      setCategoriaSelecionada(null);
      carregarCategorias();
    } catch (error) {
      setErro({ status: error.response.status, message: error.response.statusText })
      openModalErro()

    } finally {
      setIsLoading(false);
    }
  }

  async function deletarCategoria(categoriaId) {
    setIsLoading(true);
    try {
      await axios.delete(`http://127.0.0.1:8000/excluir_categoria/${categoriaId}`);
      carregarCategorias();
    } catch (error) {
      setErro({ status: error.response.status, message: error.response.statusText })
      openModalErro()
    } finally {
      setIsLoading(false);
    }
  }

  const closeModalAtualizar = useCallback(() => {
    setIsModalOpenAtualizar(false);
  }, []);

  const openModalAtualizar = useCallback(() => {
    setIsModalOpenAtualizar(true);
  }, []);

  const closeModalErro = useCallback(() => {
    setIsModalOpenErro(false);
    setErro({ status: '', message: '' })
  }, []);

  const openModalErro = useCallback(() => {
    setIsModalOpenErro(true);
  }, []);

  const categoriasMemo = useMemo(() => categorias, [categorias]);

  return (
    <>
      <div className='Categorias'>
        <h1>Gerenciamento de categorias</h1>
        <div className="addCategoria">
          <input value={novaCategoria.nome} onChange={event => setNovaCategoria({ nome: event.target.value })} type="text" maxLength={30} placeholder="Adicione um categoria"></input>
          <button className="btn_addCategoria" onClick={adicionarCategoria}><img src="https://img.icons8.com/ios-glyphs/30/FFFFFF/plus-math.png" alt="plus-math" /></button>
        </div>
        {isLoading ? (<div className="loader"></div>) : (
          categorias ? (
            <table className="table">
              <thead>
                <tr>
                  <th className="td_id">#</th>
                  <th className="td_nome">Nome</th>
                  <th className="td_button"></th>
                  <th className="td_button"></th>
                </tr>
              </thead>
              <tbody>
                {
                  categoriasMemo.map(categoria =>
                    <tr key={categoria.id}>
                      <td className="td_id">{categoria.id}</td>
                      <td className='td_nome'>{categoria.nome}</td>
                      <td className="td_button"><button className="editar" onClick={() => { setCategoriaSelecionada(categoria); openModalAtualizar() }}><img src="https://img.icons8.com/material-outlined/384/4141e6/refresh--v1.png" alt="refresh--v1" /></button></td>
                      <td className="td_button"><button onClick={() => deletarCategoria(categoria.id)}><img src="https://img.icons8.com/ios-glyphs/480/4141e6/trash--v1.png" alt="trash--v1" /></button></td>
                    </tr>
                  )}
              </tbody>
            </table>
          ) : (
            <p className="SemCategorias">Não há categorias cadastradas</p>
          ))}
      </div>
      {isModalOpenAtualizar && (
        <Modal onClose={closeModalAtualizar}>
          <h2>Atualize a categoria</h2>
          <div className="attCategoria">
            <input value={categoriaSelecionada.nome} onChange={event => setCategoriaSelecionada({ ...categoriaSelecionada, nome: event.target.value })} maxLength={30}></input>
            <button className="btn_attCategoria" onClick={atualizarCategoria}><img src="https://img.icons8.com/material-outlined/384/FFFFFF/refresh--v1.png" alt="refresh--v1" /></button>
          </div>
        </Modal>
      )}
      {isModalOpenErro && (
        <Modal onClose={closeModalErro}>
          <h2 className="tituloErro">Poxa... Deu erro!</h2>
          <p className="statusErro">{erro.status}</p>
          <p className="messageErro">{erro.message}</p>
        </Modal>
      )}
    </>
  )
}