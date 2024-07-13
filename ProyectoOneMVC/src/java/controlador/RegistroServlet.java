package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;

@WebServlet(name = "RegistroServlet", urlPatterns = {"/RegistroServlet"})
public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String nombres = request.getParameter("nombres");
            String apellidos = request.getParameter("apellidos");
            int idtipodocumento = Integer.parseInt(request.getParameter("idtipodocumento"));
            String documento = request.getParameter("documento");
            int lugarresidencia = Integer.parseInt(request.getParameter("lugarresidencia"));
            String fechanacimiento = request.getParameter("fechanacimiento");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");
            String usuario = request.getParameter("usuario");
            String password = request.getParameter("password");

            Persona persona = new Persona();
            persona.setNombres(nombres);
            persona.setApellidos(apellidos);
            persona.setIdtipodocumento(idtipodocumento);
            persona.setDocumento(documento);
            persona.setLugarresidencia(lugarresidencia);
            persona.setFechanacimiento((fechanacimiento));
            persona.setEmail(email);
            persona.setTelefono(telefono);
            persona.setUsuario(usuario);
            persona.setPassword(password);

            boolean success = PersonaData.addPersona(persona);

            if (success) {
                response.sendRedirect("personas.jsp");
            } else {
                out.println("<h1>Error al registrar la persona</h1>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException("Error al registrar la persona: " + e.getMessage());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "RegistroServlet";
    }
}
