package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioLista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("Joao");

        for (String nomesListas : nomes){
            System.out.println("nomes na lista > "+nomesListas);
        }

        nomes.set(2, "Roberto");
        System.out.println("apos substituir" +nomes);

        System.out.println(nomes.get(1));

        nomes.remove(4);

        System.out.println(nomes.size());

        System.out.println(nomes.contains("Juliano"));

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        nomes.addAll(nomes2);
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println(nomes.isEmpty());


    }
}
