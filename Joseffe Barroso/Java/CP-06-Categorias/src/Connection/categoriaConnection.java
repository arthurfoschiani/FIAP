package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.Categoria;

public class categoriaConnection {
	
	public Connection ConexaoDB(){
	       
        Connection conn=null;
       
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
           
            conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "rm96525", "211203");


            if(conn!=null)
                System.out.println("Conexão estabelecida com sucesso!");
            else
                System.out.println("Falha na conexão com o Banco de Dados!");


        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return conn;
    }
   
    public void InserirCategoriaDB(String nome){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("insert into tb_categoria (nome) values('%s')", nome);
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro incluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ListarCategoriasDB(){
       
        Connection conn = ConexaoDB();
       
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

    public void AtualizarCategoriaDB(Categoria categoria){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("update tb_categoria set nome = '%s' where id = %s", categoria.getNome(), categoria.getId());
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro atualizado com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ExcluirCategoriaDB(int id){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("delete from tb_categoria where id = %s", id);
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro excluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public Categoria burcarPorId(int id){
        
        Connection conn = ConexaoDB();
       
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
