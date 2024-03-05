import java.util.Scanner;

public class ProcessoDeSubtracao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        
        scanner.close();

        
        double subtracao = valor1 - valor2;

        
        System.out.print("A subtracao dos dois valores sera: " + subtracao);
    }
}
