/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreachjava6java8lambda;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Huilton Willian
 */
public class ForeachJava6Java8Lambda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> itens = Arrays.asList(1, 3, 4, 6, 8);

        //Foreach Java 6
        for (Integer iten : itens) {
            System.out.println("Java 6: " + iten);
        }

        //Foreach Java 8 - Reference Method
        itens.forEach(System.out::println);

        //Foreach Java 8 - Mensagem com texto
        itens.forEach(iten -> System.out.println("Java 8: " + iten));

        //Foreach Java 8 - Mensagem com texto e Filtro com Lambda
        itens.stream().filter(iten -> iten > 3).forEach(iten -> System.out.println("Java 8 Filtro com Lambda: " + iten));
    }
}
