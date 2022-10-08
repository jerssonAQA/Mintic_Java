import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

    private ArrayList<Estudiante> estudiantes = new ArrayList();
    private Scanner leer = new Scanner(System.in);

    // 
    public static void main(String[] args) {

        Registro r = new Registro();
        r.procesarComandos();

    }

    public void agregarEstudiante(String entrada) {
        String[] datos = entrada.split("&");
        Estudiante e = null;
        if (datos[1].equals("Pregrado")) {
            e = new Pregrado(datos[2], Integer.parseInt(datos[3]), datos[4], datos[5], Integer.parseInt(datos[6]));
        } else if (datos[1].equals("Posgrado")) {
            e = new Posgrado(datos[2], Integer.parseInt(datos[3]), datos[4], datos[5], datos[6]);
        }
        this.estudiantes.add(e);
    }

    public void listarEstudiante() {
        System.out.print("***Listado de estudiantes***");
        for (Estudiante e : estudiantes) { // (Estudiante e): es la referencia que va almancenar cada uno de los objetos del arraylist segun la iteracion,(: estudiantes): hace referencia al arraylist que se esta recorriendo
            if (e instanceof Pregrado) {
                System.out.print(e.toString());

            } else if (e instanceof Posgrado) {
                System.out.print(e.toString());
            }

        }
        System.out.println("");
    }
    

    public void procesarComandos() {

        String entrada = this.leer.nextLine();
        String opt = "" + entrada.toCharArray()[0];

        switch (opt) {
            case "1":
                agregarEstudiante(entrada);
                procesarComandos();
                break;
            case "2":
                listarEstudiante();
                procesarComandos();
                break;
            case "3":

                break;
            default:
                System.out.println("Error de entrada, ingrese un parametro valido");
                procesarComandos();
                break;
        }

    }

}
