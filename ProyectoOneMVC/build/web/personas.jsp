<%@page import="java.util.List"%>
<%@page import="modelo.Persona"%>
<%@page import="controlador.PersonaData"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Personas</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Lista de Personas</h1>
        <table>
            <tr>
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Acciones</th>
            </tr>
            <% 
                List<Persona> personas = PersonaData.getPersonas();
                for(Persona persona : personas) { 
            %>
            <tr>
                <td><%= persona.getNombres() %></td>
                <td><%= persona.getApellidos() %></td>
                <td><a href="DetallePersonaServlet?id=<%= persona.getId() %>">Ver Detalles</a></td>
            </tr>
            <% } %>
        </table>
        <a href="registro.jsp">Registrar nueva persona</a>
    </div>
</body>
</html>
