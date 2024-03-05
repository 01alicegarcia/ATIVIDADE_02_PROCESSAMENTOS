import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();

        
        scanner.close();

        
        double media = (nota1 + nota2) / 2;

        
        System.out.print("A media das duas notas e: " + media);
    }
}
