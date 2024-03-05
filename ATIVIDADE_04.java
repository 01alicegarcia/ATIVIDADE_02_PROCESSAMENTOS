import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.print("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.print("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();

        System.out.print("Informe a quarta nota:");
        double nota4 = scanner.nextDouble();

        
        scanner.close();


        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        
        System.out.println("A media das quatro notas sera: " + media);
    }
}
