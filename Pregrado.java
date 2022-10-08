public class Pregrado extends Estudiante{
    
    private int cantidad_creditos;

    public Pregrado(String nombre, int edad, String programa, String tipo_etnia, int cantidad_creditos) {
        super(nombre, edad, programa, tipo_etnia);
        this.cantidad_creditos = cantidad_creditos;
    }

    @Override
    public String toString() {
        return "\n\tEstudiante Pregrado\n" + "\tNombre: " + nombre + "\n\tEdad: " + edad + " anios\n\tPrograma: " + programa + "\n\tEtnia: " + tipo_etnia + "\n\tCreditos aprobados: " + cantidad_creditos;
    }

    
    
}