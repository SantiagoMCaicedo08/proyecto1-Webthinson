package modelo;

public class Persona {
    private int id;
    private String nombres;
    private String apellidos;
    private int idtipodocumento;
    private String documento;
    private String fechanacimiento;
    private String email;
    private String telefono;
    private String usuario;
    private String password;
    private int lugarresidencia;

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public int getIdtipodocumento() { return idtipodocumento; }
    public void setIdtipodocumento(int idtipodocumento) { this.idtipodocumento = idtipodocumento; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getFechanacimiento() { return fechanacimiento; }
    public void setFechanacimiento(String fechanacimiento) { this.fechanacimiento = fechanacimiento; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getLugarresidencia() { return lugarresidencia; }
    public void setLugarresidencia(int lugarresidencia) { this.lugarresidencia = lugarresidencia; }
}
