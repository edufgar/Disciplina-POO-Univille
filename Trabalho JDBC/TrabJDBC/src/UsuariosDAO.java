import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuariosDAO extends BasicoDAO{

	public void insert(Usuarios usuario) {

		String sql = " insert into usuario(codigousuario, usuario) values(?,?)";
		
		try (Connection conn = getConnection();
			 PreparedStatement statement = conn.prepareStatement(sql)){
			statement.setInt(1, usuario.getCodigousuario());
			statement.setString(2, usuario.getUsuario());
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public void delete(Usuarios usuario) {
		
		String sql = " delete from usuario where codigousuario = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setInt(1, usuario.getCodigousuario());
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(Usuarios usuario) {
		String sql = " update usuario set codigousuario = ?, usuario = ? where codigousuario = ?";
		
		try (Connection conn = getConnection();
			 PreparedStatement statement = conn.prepareStatement(sql)){
			statement.setInt(1, usuario.getCodigousuario());
			statement.setString(2, usuario.getUsuario());
			statement.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Usuarios getByCodigousuario(int codigousuario) {
		Usuarios usuario = null;
		String sql = " select codigousuario, usuario from usuario where codigousuario = ?";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			statement.setInt(1, codigousuario);
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				usuario = new Usuarios();
				usuario.setCodigousuario(resultSet.getInt(1));
				usuario.setUsuario(resultSet.getString(2));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	public List<Usuarios> getAll(){
		List<Usuarios> list = new ArrayList<>();
		String sql = " select codigousuario, usuario from usuario order by usuario";
		
		try(Connection conn = getConnection();
			PreparedStatement statement = conn.prepareStatement(sql)) {
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Usuarios usuario = new Usuarios();
				usuario.setCodigousuario(resultSet.getInt(1));
				usuario.setUsuario(resultSet.getString(2));
				
				
				list.add(usuario);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
