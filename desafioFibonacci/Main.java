package desafioFibonacci;
import java.util.Scanner;

public class Main {

    public static boolean isFibonacci(int number) {
        int a = 0, b = 1;
        if (number == a || number == b) {
            return true;
        }
        int next = a + b;
        while (next <= number) {
            if (next == number) {
                return true;
            }
            a = b;
            b = next;
            next = a + b;
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            int number = scanner.nextInt();
            
            if (isFibonacci(number)) {
                System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + number + " Não pertence à sequência de Fibonacci.");
            }
        }
    }
}
