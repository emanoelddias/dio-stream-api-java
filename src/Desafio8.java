
import java.util.Arrays;
import java.util.List;

/*Desafio 8 - Somar os dígitos de todos os números da lista:
Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.*/

public class Desafio8 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
                // Calcular a soma dos dígitos de todos os números da lista
                int somaDosDigitos = numeros.stream() // Cria um Stream de números
                .mapToInt(num -> { // Converte cada número em um int
                    return Integer.toString(num) // Converte o número para string
                            .chars() // Cria um IntStream de caracteres (códigos ASCII)
                            .map(c -> c - '0') // Converte o código ASCII de volta para dígito
                            .sum(); // Soma todos os dígitos
                })
                .sum(); // Soma todos os resultados dos números
        
        // Exibe o resultado
        System.out.println("A soma dos dígitos é: " + somaDosDigitos);
       
        
    }

}
