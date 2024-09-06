/*Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console. */


import java.util.Arrays;
import java.util.List;

public class Desafio9 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int qtdNumeros = numeros.size();
        long qtdNumerosDistintos = numeros.stream().distinct().count();

        if(qtdNumeros == qtdNumerosDistintos){
            System.out.println("Os números não se repetem");
        } else{
            System.out.println("Os números se repetem");
        }

    }
    
}
