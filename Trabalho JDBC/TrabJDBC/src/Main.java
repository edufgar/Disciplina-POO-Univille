
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		try {
			//assim criar o banco colocar o nome no local 'nome_banco'
			String stringConexao = "jdbc:mysql://localhost:3306/trabjdbc?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String usuario = "root";
			String senha = "univille";
			Connection conn = DriverManager.getConnection(stringConexao, 
					usuario, 
					senha);
			
			String sql = "select id,nome,sobrenome from pessoa";
			
			// String sql = "insert into pessoa values(?,?)";
			
			PreparedStatement p = conn.prepareStatement(sql);
			
			ResultSet r = p.executeQuery();
			
			while(r.next()) {
				int id = r.getInt(1);
				String nome = r.getString(2);
				String sobrenome = r.getString(3);
				System.out.println(id + " " + nome + " " + sobrenome);
			}
			
			/*
			p.setString(1, "Leanderso");
			p.setString(2, "Andreé");
			p.execute();
			*/
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
