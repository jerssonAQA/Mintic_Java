

public class Posgrado extends Estudiante{
    
    private String modalidad;
    
    public Posgrado(String nombre, int edad, String programa, String tipo_etnia, String modalidad) {
        super(nombre, edad, programa, tipo_etnia);
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return "\n\tEstudiante Posgrado\n" + "\tNombre: " + nombre + "\n\tEdad: " + edad + " anios\n\tPrograma: " + programa + "\n\tEtnia: " + tipo_etnia + "\n\tModalidad: " + modalidad;
    }
    
    
}