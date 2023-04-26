package java_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoDBOracle {
	
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
   
    public void InserirAlunoDB(Aluno aluno){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("insert into tb_aluno (id,nome,ra,curso) values(%s,'%s', %s, '%s')", aluno.getId(), aluno.getNome(), aluno.getRa(), aluno.getCurso());
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro incluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ListarUsuarioDB(){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        ResultSet rs=null;
       
        try {
            String query= "select * from tb_aluno";
           
            statement=conn.createStatement();
           
            rs=statement.executeQuery(query);
            
            if (!rs.next()) {
                System.out.println("Não há alunos registrados.");
            } else {
                do {
                	System.out.println("ID: " + rs.getString("id"));
                    System.out.println("Nome: " + rs.getString("nome"));
                    System.out.println("RA: " + rs.getString("ra"));
                    System.out.println("Curso: " + rs.getString("curso"));
                    System.out.println();
                } while (rs.next());
            }


        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void AtualizarUsuarioDB(Aluno aluno){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("update tb_aluno set nome = '%s', curso = '%s' where id = %s", aluno.getNome(), aluno.getCurso(), aluno.getId());
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro atualizado com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
    public void ExcluirUsuarioDB(int id){
       
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        try {
            String query = String.format("delete from tb_aluno where id = %s", id);
           
            statement = conn.createStatement();
           
            statement.executeUpdate(query);
           
            System.out.println("Registro excluído com sucesso!");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public Aluno burcarPorId(int id){
        
        Connection conn = ConexaoDB();
       
        Statement statement;
       
        ResultSet rs=null;
       
        try {
            String query = String.format("select * from tb_aluno where id = %s", id);
           
            statement = conn.createStatement();
           
            rs=statement.executeQuery(query);
           
            if(rs.next()){
            	Aluno aluno = new Aluno(Integer.parseInt(rs.getString("id")), rs.getString("nome"), Integer.parseInt(rs.getString("ra")), rs.getString("curso"));
            	return aluno;
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
