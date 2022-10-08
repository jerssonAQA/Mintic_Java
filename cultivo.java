import java.util.ArrayList;
import java.util.List;


public class Cultivo {

    ArrayList<String> lista = new ArrayList();
    ArrayList<Integer> posh = new ArrayList();
    ArrayList<Integer> lista1 = new ArrayList();
    ArrayList<String> lista_opcional = new ArrayList();

//    public Cultivo() {
//        
//    }
    public ArrayList<String> obtenerCultivos(ArrayList<String> lista) {
        this.lista = lista;
        lista_opcional.clear();
        for (String parcela : this.lista) {
            if (!lista_opcional.contains(parcela)) {
                lista_opcional.add(parcela);
            }
        }
        return lista_opcional;
    }

    public ArrayList<String> obtenerCultivosPendientes(ArrayList<Integer> posh,ArrayList<String> lista,String cultivo) {
        //ArrayList<Object> lista = new ArrayList<Object>();
        this.lista_opcional.clear();
        this.lista =lista;
        this.posh = posh;
        String a= cultivo;
        ArrayList<String> cultivos = new ArrayList();
        for (int i = 0; i < this.posh.size(); i++) {
            if (this.lista.get(this.posh.get(i)).equals(a)) {
                cultivos.add(Integer.toString(i));
            }
        }
        return cultivos;
    }


    public ArrayList<String> obtenerFaltantes(ArrayList<String> l_otrafinca, ArrayList<String> l_fincamartha) {
        ArrayList<String> otra = new ArrayList();
        lista_opcional.clear();
        otra = l_otrafinca;
        this.lista = l_fincamartha;
        for (String a : otra) {
            if (!lista.contains(a)) {
                lista_opcional.add(a);
            }
        }
        return lista_opcional;
    }

    public Integer obtenerExcedentesIntercambiables(ArrayList<String> l_otrafinca, ArrayList<String> l_fincamartha) {
        ArrayList<String> otra = new ArrayList();
        ArrayList<String> lista2 = new ArrayList();
        Integer num=0;
        lista_opcional.clear();
        otra = l_otrafinca;
        this.lista = l_fincamartha;
        for (String a : otra) {
            if (!lista.contains(a)) {
                lista_opcional.add(a);
            }
        }
        for (String b : lista) {
            if (!otra.contains(b)) {
                lista2.add(b);
            }
            if (lista_opcional.size()<=lista2.size()) {
                num=lista_opcional.size();
            } else {
                num=lista2.size();
            }
        }
        return num;
    }
}