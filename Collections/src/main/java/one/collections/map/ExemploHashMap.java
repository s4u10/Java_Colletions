package one.collections.map;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {

        Map<String, Integer> compeoesMundialFifa = new HashMap<>();

        // Adiciona os camppeões mundias fila no mapa
        compeoesMundialFifa.put("Brazil",5);
        compeoesMundialFifa.put("Alemanha",4);
        compeoesMundialFifa.put("Itália",4);
        compeoesMundialFifa.put("Uruguai",2);
        compeoesMundialFifa.put("Argentina",2);
        compeoesMundialFifa.put("França",2);
        compeoesMundialFifa.put("Inglaterra",1);
        compeoesMundialFifa.put("Espanha",1);

        System.out.println(compeoesMundialFifa);

        // Atualizca o valor para a chave Brasil
        compeoesMundialFifa.put("Brazil", 6);

        System.out.println(compeoesMundialFifa);

        // Retorna a Argentina
        System.out.println(compeoesMundialFifa.get("Argentina"));

        // Retorna se existe ou não um campeão Franca
        System.out.println(compeoesMundialFifa.containsKey("França"));

        // Remove o campeão França
        compeoesMundialFifa.remove("França");

        //Retorna se existe ou não um campeão França
        System.out.println(compeoesMundialFifa.containsKey("França"));

        // Retorna se existe ou não alguma seleção hexa campeão
        System.out.println(compeoesMundialFifa.containsValue(6));

        // Retorna o tamanho do mapa
        System.out.println(compeoesMundialFifa.size());

        System.out.println(compeoesMundialFifa);

        // Nevega nos registro do mapa
        for (Map.Entry<String, Integer> entry : compeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
        for (String key : compeoesMundialFifa.keySet()) {
            System.out.println(key + " --" + compeoesMundialFifa.get(key));
        }

        System.out.println(compeoesMundialFifa);

        //Verifica se o mapa contem a chave Estados Unidos
        System.out.println(compeoesMundialFifa.containsKey("Estados Unidos"));

        // Verifica se o mapa contem o valor 5
        System.out.println(compeoesMundialFifa.containsValue(5));

        // verifica o tamanho antes e depois de limpar o mapa
        System.out.println(compeoesMundialFifa.size());
        compeoesMundialFifa.clear();
        System.out.println(compeoesMundialFifa.size());

    }
}
