package programa;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) {
		
		// Altere "nome_do_seu_banco" para o nome real do seu banco de dados
        String url = "jdbc:postgresql://localhost:5432/postgres"; // "jdbc:postgresql://localhost:5432/nome_do_seu_banco";
        String usuario = "postgres"; 
        String senha = "123"; 

        String sql = "SELECT * FROM pessoas";

        // Uso do try-with-resources para garantir o fechamento automático das conexões
        try (Connection conn = DriverManager.getConnection(url, usuario, senha);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("Conexão efetuada com sucesso!\n");

            // Iterando pelos resultados da tabela pessoas
            while (rs.next()) {
                // Modifique os parâmetros abaixo de acordo com as colunas da sua tabela
                int idade = rs.getInt("idade");
                String nome = rs.getString("nome");
                
                System.out.println("Idade: " + idade + " | Nome: " + nome);
            }

        }
        catch (SQLException e) {
            System.err.println("Erro ao conectar ou consultar o banco de dados.");
            e.printStackTrace();
        }

	}

}

/*







*/



