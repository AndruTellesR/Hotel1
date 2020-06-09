
package servicio;

import java.sql.*;

/**
 *
 * @author ANDRU
 */
public class UsuarioServicios {

    public void guardar(Connection conexion, modelo.Usuario usuario) throws SQLException {
        try {
            
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("INSERT INTO usuario (id,identificacion,nombre,edad)" + " VALUES(?,?,?,?)");
            consulta.setString(1, usuario.getId());
            consulta.setString(2, usuario.getIdentificacion());
            consulta.setString(3, usuario.getNombre());
            consulta.setInt(4, usuario.getEdad());
            consulta.executeUpdate();
            /*
            consulta = conexion.prepareStatement("INSERT INTO alquiler(idusuario, idhabitacion,cantidad,fecha)" + "VALUES(?,?,?,?)");
            consulta.setInt(1, alquiler.getId());
            consulta.setInt(2, alquiler.getCantidad());
            consulta.setDate(3, alquiler.getFecha());
            consulta.executeUpdate();
            */
            
        } catch (SQLException ex) {
            throw new SQLDataException(ex);
        }
    }
}
