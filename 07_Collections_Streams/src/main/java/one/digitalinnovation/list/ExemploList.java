package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class  ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos"); //adiciona um nome na lista
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa"); //coloca na posição 2 o nome Larissa

        System.out.println(nomes);

        Collections.sort(nomes); //ordena a lista

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4); //remove o elemento da posicao 4

        System.out.println(nomes);

        nomes.remove("Wesley"); //remove o wesley da lista

        System.out.println(nomes);

        String nome = nomes.get(3); //pega o elemento na posicao 3

        System.out.println(nome);

        int posicao = nomes.indexOf("Wesley"); //posicao do wesley

        System.out.println(posicao);

        int tamanho = nomes.size(); //tamanho da lista

        System.out.println(tamanho);

        nomes.remove("Larissa"); //remove larissa

        tamanho = nomes.size(); //tamanho

        System.out.println(tamanho);

        boolean temAnderson = nomes.contains("Anderson"); //tem anderson na lista?

        System.out.println(temAnderson);

        boolean temFernando = nomes.contains("Fernando");

        System.out.println(temFernando);

        boolean listaEstaVazia = nomes.isEmpty(); //esta vazia

        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes) {

            System.out.println("-->" + nomeDoItem); //for each percorrendo os elementos da lsita

        }

        Iterator<String> iterator = nomes.iterator(); //usado para navegar na lista

        while (iterator.hasNext()) { //tem um proximo item, se sim continue

            System.out.println("---->" + iterator.next()); //mostra o item atual e muda para o proximo

        }

        nomes.clear(); //limpa a lista

        listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

    }

}
