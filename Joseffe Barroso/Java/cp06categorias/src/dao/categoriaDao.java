package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.connectionFactory;
import model.Categoria;

public class categoriaDao {
   
    public void InserirCategoriaDB(String nome) throws SQLException {
       
    	Connection conn = connectionFactory.getConnection();
       
        Statement statement;
       
        try {
            String query = String.format("insert into tb_categoria (nome) values('%s')", nome);
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ListarCategoriasDB() throws SQLException {
       
        Connection conn = connectionFactory.getConnection();
       
        Statement statement;
       
        ResultSet rs=null;
       
        try {
            String query= "select * from tb_categoria order by id";
           
            statement=conn.createStatement();
           
            rs=statement.executeQuery(query);
            
            if (!rs.next()) {
                System.out.println("Não há categorias registradas.");
            } else {
                do {
                	System.out.println("ID: " + rs.getString("id"));
                    System.out.println("Nome: " + rs.getString("nome"));
                    System.out.println();
                } while (rs.next());
            }


        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void AtualizarCategoriaDB(Categoria categoria) throws SQLException {
       
        Connection conn = connectionFactory.getConnection();
       
        Statement statement;
       
        try {
            String query = String.format("update tb_categoria set nome = '%s' where id = %s", categoria.getNome(), categoria.getId());
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ExcluirCategoriaDB(int id) throws SQLException {
       
        Connection conn = connectionFactory.getConnection();
       
        Statement statement;
       
        try {
            String query = String.format("delete from tb_categoria where id = %s", id);
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public Categoria burcarPorId(int id) throws SQLException {
        
        Connection conn = connectionFactory.getConnection();
       
        Statement statement;
       
        ResultSet rs=null;
       
        try {
            String query = String.format("select * from tb_categoria where id = %s", id);
           
            statement = conn.createStatement();
           
            rs=statement.executeQuery(query);
           
            if(rs.next()){
            	Categoria categoria = new Categoria(Integer.parseInt(rs.getString("id")), rs.getString("nome"));
            	return categoria;
            } else {
            	return null;
            }
            
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
