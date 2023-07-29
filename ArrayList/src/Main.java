import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList paises = new ArrayList();

        paises.add("Ecuador");
        paises.add("Colombia");
        paises.add("Peru");
        paises.add("Mexico");
        paises.add(0, "Argentina");
        paises.add("Colombia");

        for (int i = 0; i < paises.size(); i++){
            System.out.println((i+1) + ". " + paises.get(i));
        }

        System.out.println("********************************");

        paises.remove("Colombia");

        for (int i = 0; i < paises.size(); i++){
            System.out.println((i+1) + ". " + paises.get(i));
        }

        System.out.println("********************************");
        paises.remove(2);

        for (int i = 0; i < paises.size(); i++){
            System.out.println((i+1) + ". " + paises.get(i));
        }

        System.out.println("********************************");
        paises.removeAll(paises);

        for (int i = 0; i < paises.size(); i++){
            System.out.println((i+1) + ". " + paises.get(i));
        }

        System.out.println("tamanio: " + paises.size());

        //ArrayList<Medico> medicos = new Medico();


    }
}