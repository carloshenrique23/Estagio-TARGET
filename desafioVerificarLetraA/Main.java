package desafioVerificarLetraA;

import java.util.Scanner;

public class Main {

    public static int countLetterA(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma string para verificar a presença da letra 'a': ");
            String input = scanner.nextLine();
            
            int count = countLetterA(input);
            System.out.println("A letra 'a' ocorre " + count + " vez(es) na string.");
        }
    }
}
