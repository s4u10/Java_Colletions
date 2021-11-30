package one.collections.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreamAPI {

        public static void main(String[] args) {

            // Cria a coleção de estudantes
            List<String> estudantes = new ArrayList<>();

            // Adiciona 4 estudantes para a coleção
            estudantes.add("Pedro");
            estudantes.add("Thavse");
            estudantes.add("Marcelo");
            estudantes.add("Carla");
            estudantes.add("Juliana");
            estudantes.add("Thiago");
            estudantes.add("Rafael");

            //Retorna a contagem de elementos do stream
            System.out.println("Contagem: " + estudantes.stream().count());

            // Retorna o elemento com maior numero de letras
            System.out.println("Maior numero de letras" + estudantes.stream().max(Comparator.comparingInt(String::length)));

            // Retorna o elemmento com menor numero de letras
            System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));

            // Retorna os elementos que tem a letra R no nome
            System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante) ->
                    estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

            // Retorna uma nova coleção, com o snomes concatenados a quantidade de letras de cada nome
            System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map(estudante ->
                    estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

            // Exibe cada elemento no console sem retornar outra coleção
            System.out.println("Retorna os elementos novamente: ");
            estudantes.stream().forEach(System.out::println);

            // Retorna true se todos os elementos possuem a letra W no nome
            System.out.println("Todos os elementos tem W no nome? " + estudantes.stream().allMatch((elemento) -> elemento.contains("W")));

            // Retorna true se algum os elementos possuem a letra a minúscula no nome
            System.out.println("Tem algum elemento com a minúscula no nome?" + estudantes.stream().anyMatch((elemento) -> elemento.contains("a")));

            // Retorna true se nenhum elemento possue a letra a minúscula no nome
            System.out.println("Não tem nenhum elemento com a minúscula no nome?" + estudantes.stream().noneMatch((elemento) -> elemento.contains("a")));

            // Retorna o primeiroi elemento da coleção, se existir exibe no console
            System.out.print("Retorna o primeiro elemento da coleção:");
            estudantes.stream().findFirst().ifPresent(System.out::println);

            // Exemplo de operação encadeado
            System.out.print("Operação encadeada: ");
            System.out.println(estudantes.stream()
                .peek(System.out::println)
                    .map(estudante ->
                            estudante.concat(" - ").concat (String.valueOf(estudante.length())))
                   .peek(System.out::println)
                   .filter((estudante) ->
                           estudante.toLowerCase().contains("r"))
//                     .collect(Collectors.toList()))
 //                    .collecito(collectors.joining(",")));
 //                    .collect(Collectors.toSet()));
            .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-") + 1))));

        }
}