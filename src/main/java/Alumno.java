

public class Alumno {

    private int id;
    private String nombre;
    private String apellidos;
    private int anioNacimiento;
    private String direccion;
    private String curso;
    private String tutor;

    public Alumno(int id, String nombre, String apellidos, int anioNacimiento,
                  String direccion, String curso, String tutor) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioNacimiento = anioNacimiento;
        this.direccion = direccion;
        this.curso = curso;
        this.tutor = tutor;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getAnioNacimiento() { return anioNacimiento; }
    public String getDireccion() { return direccion; }
    public String getCurso() { return curso; }
    public String getTutor() { return tutor; }
}
