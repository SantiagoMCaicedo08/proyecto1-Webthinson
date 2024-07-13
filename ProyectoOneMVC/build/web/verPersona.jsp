<%@ page import="controlador.PersonaData" %>
<%@ page import="modelo.Persona" %>
<%
    int id = Integer.parseInt(request.getParameter("id"));
    Persona persona = PersonaData.getPersonaById(id);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Detalles de Persona</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <h1>Detalles de Persona</h1>
    <p>Nombres: <%= persona.getNombres() %></p>
    <p>Apellidos: <%= persona.getApellidos() %></p>
    <p>Tipo de Documento: <%= persona.getIdtipodocumento() %></p>
    <p>Documento: <%= persona.getDocumento() %></p>
    <p>Lugar de Nacimiento: <%= persona.getLugarnacimiento() %></p>
    <p>Fecha de Nacimiento: <%= persona.getFechanacimiento() %></p>
    <p>Email: <%= persona.getEmail() %></p>
    <p>Teléfono: <%= persona.getTelefono() %></p>
    <p>Usuario: <%= persona.getUsuario() %></p>
    <p>Lugar de Residencia: <%= persona.getLugarresidencia() %></p>
    <a href="personas.jsp">Volver a la lista de personas</a>
</body>
</html>
