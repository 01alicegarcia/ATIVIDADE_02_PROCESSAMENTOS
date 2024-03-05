import java.util.Scanner;

public class SomaDeValores {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.print("Informe o segundo valor:");
        double valor2 = scanner.nextDouble();

        System.out.print("Informe o terceiro valor:");
        double valor3 = scanner.nextDouble();

        
        scanner.close();

        
        double soma = valor1 + valor2 + valor3;

        
        System.out.print("A soma dos tres valores sera: " + soma);
    }
}

