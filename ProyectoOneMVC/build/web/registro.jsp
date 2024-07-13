<!DOCTYPE html>
<html>
<head>
    <title>Registro de Usuario</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <div class="container">
        <h1>Registro de Usuario</h1>
        <form action="RegistroServlet" method="post">
            <table>
                <tr>
                    <td>Nombres:</td>
                    <td><input type="text" name="nombres" required></td>
                </tr>
                <tr>
                    <td>Apellidos:</td>
                    <td><input type="text" name="apellidos" required></td>
                </tr>
                <tr>
                    <td>Tipo de Documento:</td>
                    <td>
                        <select name="idtipodocumento" required>
                            <option value="1">Cédula de Ciudadanía</option>
                            <option value="2">Pasaporte</option>
                            <option value="3">Tarjeta de Identidad</option>
                            <option value="4">Licencia de Conducir</option>
                            <option value="5">Cédula de Extranjería</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Documento:</td>
                    <td><input type="text" name="documento" required></td>
                </tr>
                <tr>
                    <td>Lugar de Residencia:</td>
                    <td>
                        <select name="lugarresidencia" required>
                            <option value="1">Bogotá</option>
                            <option value="2">Medellín</option>
                            <option value="3">Cali</option>
                            <option value="4">Barranquilla</option>
                            <option value="5">Cartagena</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Fecha de Nacimiento:</td>
                    <td><input type="date" name="fechanacimiento" required></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" required></td>
                </tr>
                <tr>
                    <td>Teléfono:</td>
                    <td><input type="text" name="telefono" required></td>
                </tr>
                <tr>
                    <td>Usuario:</td>
                    <td><input type="text" name="usuario" required></td>
                </tr>
                <tr>
                    <td>Contraseña:</td>
                    <td><input type="password" name="password" required></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Registrar"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
