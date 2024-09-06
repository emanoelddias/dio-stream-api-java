
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */

public class Desafio14 {
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,11);        
        List<Integer> numerosPrimos = numeros.stream().filter(PrimeUtils::isPrime).collect(Collectors.toList());

        System.out.println("O maior numero primo da lista é: " + numerosPrimos.stream().max(Comparator.naturalOrder()));

    }
}

class PrimeUtils {

    public static boolean isPrime(int number) {
        if (number <= 1) return false; // Números menores ou iguais a 1 não são primos
        if (number == 2) return true; // 2 é o único número par que é primo
        if (number % 2 == 0) return false; // Outros números pares não são primos
        
        // Verificar divisibilidade de números ímpares até a raiz quadrada do número
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
