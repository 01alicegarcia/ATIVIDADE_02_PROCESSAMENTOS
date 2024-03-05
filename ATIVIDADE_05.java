import java.util.Scanner;

public class QuatroOperacoes {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o primeiro numero:");
        double numero1 = scanner.nextDouble();

        System.out.print("Informe o segundo numero:");
        double numero2 = scanner.nextDouble();

        
        scanner.close();


        double soma = numero1 + numero2;
        System.out.println("A soma dos dois numeros sera: " + soma);

        double subtracao = numero1 - numero2;
        System.out.println("A subtracao dos dois numeros sera: " + subtracao);

        
        double multiplicacao = numero1 * numero2;
        System.out.println("A multiplicacao dos dois numeros sera: " + multiplicacao);
            
        double divisao = numero1 / numero2;
        System.out.println("A divisao dos dois numeros sera: " + divisao);
         
        
         }
}
