package one.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Maria");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("João");
        nomes.add("Carlo");
        nomes.add("Niara");
        nomes.add("Ana");

        nomes.set(2, "Carlo");

        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");

        System.out.println(nomes);

        nomes.remove(4);

        System.out.println(nomes);

        String nome = nomes.get(3);
        int posicao = nomes.indexOf("Juliana");
        System.out.println(posicao);

        System.out.println(nome);
        int tamanho = nomes.size();
        System.out.println(tamanho);
        nomes.remove("Carlo");
        tamanho = nomes.size();
        System.out.println(tamanho);
        boolean temNiara = nomes.contains("Niara");
        System.out.println(temNiara);
        boolean temFernando = nomes.contains("Fernado");
        System.out.println(temFernando);
        boolean listaEstaVazia = nome.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem: nomes ) {
            System.out.println("-->" + nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()) {
            System.out.println("----->" + iterator.next());
        }

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
    }
}
