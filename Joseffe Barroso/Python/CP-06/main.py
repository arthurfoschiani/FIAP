from fastapi import FastAPI, HTTPException, status
from fastapi.responses import JSONResponse
from fastapi.middleware.cors import CORSMiddleware

from Model.Categoria import Categoria
from Repository.categoriasRepository import categoriaRepository

from typing import Dict

app = FastAPI()

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_methods=["*"],
    allow_headers=["*"],
)

@app.post("/incluir_categoria", status_code=status.HTTP_201_CREATED)
def incluir_categoria(dados_categoria: Dict[str, str]):
    nome = dados_categoria.get("nome")
    try:
        categoriaRepository.incluirCategoria(nome)
        return {"message": "Usuário incluído com sucesso!"}
    except Exception as e:
        raise HTTPException(status_code=400, detail="Erro ao inserir usuário - " + str(e))
    
@app.put("/atualizar_categoria/{idCategoria}", status_code=status.HTTP_200_OK)
def incluir_categoria(categoria: Categoria, idCategoria):
    try:
        categoriaRepository.atualizarCategoria(categoria, idCategoria)
        return {"message": "Usuário atualizado com sucesso!"}
    except Exception as e:
        raise HTTPException(status_code=400, detail="Erro ao atualizar o usuário - " + str(e))
    
@app.delete("/excluir_categoria/{idCategoria}", status_code=status.HTTP_200_OK)
def excluir_categoria(idCategoria):
    try:
        categoriaRepository.excluirCategoria(idCategoria)
        return {"message": "Usuário excluido com sucesso!"}
    except Exception as e:
        raise HTTPException(status_code=400, detail="Erro ao excluir o usuário - " + str(e))
    
@app.get("/listar_categorias", status_code=status.HTTP_200_OK)
def listar_categorias():
    try:
        listaUsuarios = categoriaRepository.listarCategorias()
        return listaUsuarios
    except Exception as e:
        raise HTTPException(status_code=400, detail="Erro ao listar os usuários - " + str(e))
    
@app.get("/listar_categoria/{idCategoria}", status_code=status.HTTP_200_OK)
def listar_categoria(idCategoria):
    try:
        categoria = categoriaRepository.buscarCategoriaPorId(idCategoria)
        return categoria
    except Exception as e:
        raise HTTPException(status_code=400, detail="Erro ao mostrar categoria - " + str(e))