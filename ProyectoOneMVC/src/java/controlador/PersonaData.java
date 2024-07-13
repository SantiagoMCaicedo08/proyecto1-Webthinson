package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

public class PersonaData {

    public static List<Persona> getPersonas() throws SQLException {
        List<Persona> personas = new ArrayList<>();
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement("SELECT * FROM persona");
            rs = ps.executeQuery();

            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId(rs.getInt("id"));
                persona.setNombres(rs.getString("nombres"));
                persona.setApellidos(rs.getString("apellidos"));
                persona.setIdtipodocumento(rs.getInt("idtipodocumento"));
                persona.setDocumento(rs.getString("documento"));
                persona.setLugarresidencia(rs.getInt("lugarresidencia"));
                persona.setFechanacimiento(rs.getString("fechanacimiento"));
                persona.setEmail(rs.getString("email"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setUsuario(rs.getString("usuario"));
                persona.setPassword(rs.getString("password"));
                personas.add(persona);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, ps, rs);
        }

        return personas;
    }

    public static Persona getPersonaById(int id) throws SQLException {
        Persona persona = null;
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = conn.prepareStatement("SELECT * FROM persona WHERE id = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                persona = new Persona();
                persona.setId(rs.getInt("id"));
                persona.setNombres(rs.getString("nombres"));
                persona.setApellidos(rs.getString("apellidos"));
                persona.setIdtipodocumento(rs.getInt("idtipodocumento"));
                persona.setDocumento(rs.getString("documento"));
                persona.setLugarresidencia(rs.getInt("lugarresidencia"));
                persona.setFechanacimiento(rs.getString("fechanacimiento"));
                persona.setEmail(rs.getString("email"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setUsuario(rs.getString("usuario"));
                persona.setPassword(rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, ps, rs);
        }

        return persona;
    }

    public static boolean addPersona(Persona persona) throws SQLException {
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement ps = null;
        boolean success = false;

        try {
            ps = conn.prepareStatement("INSERT INTO persona (nombres, apellidos, idtipodocumento, documento, lugarresidencia, fechanacimiento, email, telefono, usuario, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, persona.getNombres());
            ps.setString(2, persona.getApellidos());
            ps.setInt(3, persona.getIdtipodocumento());
            ps.setString(4, persona.getDocumento());
            ps.setInt(5, persona.getLugarresidencia());
            ps.setString(6,persona.getFechanacimiento());
            ps.setString(7, persona.getEmail());
            ps.setString(8, persona.getTelefono());
            ps.setString(9, persona.getUsuario());
            ps.setString(10, persona.getPassword());
            ps.executeUpdate();
            success = true;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources(conn, ps, null);
        }

        return success;
    }

    private static void closeResources(Connection conn, PreparedStatement ps, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
