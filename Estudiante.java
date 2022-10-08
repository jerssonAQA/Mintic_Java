public class Estudiante {
    
    protected String nombre;
    protected int edad;
    protected String programa;
    protected String tipo_etnia;

    public Estudiante(String nombre, int edad, String programa, String tipo_etnia) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipo_etnia = tipo_etnia;
    }

    @Override
    public String toString() {
        return "\tEstudiante Pregrado\n" + "\tNombre: " + nombre + "\n\tEdad: " + edad + "\n\tPrograma: " + programa + "\n\tEtnia" + tipo_etnia + '}';
    }
    
    
}