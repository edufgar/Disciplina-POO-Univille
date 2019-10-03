import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	
	private static FabricaDeConexoes instance;

	private static String banco = "trabjdbc";
	private static String usuario = "root";
	private static String senha = "univille";
	
	private FabricaDeConexoes() {}

	public static FabricaDeConexoes getInstance() {
		if(instance == null) {
			instance = new FabricaDeConexoes();
		}
		return instance;
	}
	
	public Connection getConnection(){
		try {
		return DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/"+banco,usuario,senha);
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	

}
