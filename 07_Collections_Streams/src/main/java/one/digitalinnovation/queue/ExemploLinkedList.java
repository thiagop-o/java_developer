package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        String clienteASerAtendido = filaBanco.poll(); //pega e remove da fila

        System.out.println("apos o poll " +clienteASerAtendido);

        System.out.println(filaBanco);

//        filaBanco.clear();

        String primeiroCliente = filaBanco.peek(); //pega o elemento mas nao tira da fila

        System.out.println("Feito o peek " + primeiroCliente);

        System.out.println(filaBanco);

        String primeiroClienteOuErro = filaBanco.element(); //pega o elemento mas nao tira da fila porém retorna elemento

        System.out.println("Element: " + primeiroClienteOuErro);

        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("--->" + iteratorFilaBanco.next());
        }

        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        filaBanco.add("Wesley");

        System.out.println(filaBanco);

    }

}
