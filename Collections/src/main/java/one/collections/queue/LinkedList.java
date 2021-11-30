package one.collections.queue;

import java.util.Iterator;
import java.util.Queue;

public class LinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new java.util.LinkedList<>();

        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(clienteASerAtendido);
        System.out.println(filaBanco);

    //    filaBanco.clear();

        String primerioCliente = filaBanco.peek();
        System.out.println(primerioCliente);
        System.out.println(filaBanco);
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println(primeiroClienteOuErro);
        System.out.println(filaBanco);

        for (String client: filaBanco) {
            System.out.println(client);
        }
        Iterator<String> iteratorFilaBanco = filaBanco.iterator();

        while (iteratorFilaBanco.hasNext()) {
            System.out.println("---->" + iteratorFilaBanco.next());
        }
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
        filaBanco.add("Wesley");
        System.out.println(filaBanco);
    }
}
