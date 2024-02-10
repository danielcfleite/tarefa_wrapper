import java.util.Scanner;
import java.util.InputMismatchException;

class TarefaWrapper { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInteger = 0;
        boolean validInput = false;

        // Keep prompting the user until valid input is provided
        while (!validInput) {
            try {
                System.out.print("Digite um númmero inteiro: ");
                
                userInteger = scanner.nextInt();
                
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input inválido, por favor tente novammente");
                
                scanner.nextLine();
            }
        }

        System.out.println("int: " + userInteger);

        Integer userIntegerWrapper = userInteger;

        System.out.println("Integer (wrapper): " + userIntegerWrapper);

        scanner.close();
    }
    }
