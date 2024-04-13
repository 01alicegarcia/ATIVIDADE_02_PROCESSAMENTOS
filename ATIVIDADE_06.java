import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        
        
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        
        
        System.out.print("Digite o preco do produto: ");
        String precoInput = scanner.next();
        double precoProduto = Double.parseDouble(precoInput.replace(',', '.')); 
        
    
        System.out.print("Digite o percentual de desconto (0-100): ");
        double percentualDesconto = scanner.nextDouble();
        
    
        double novoPreco = precoProduto - (precoProduto * (percentualDesconto / 100));
        
        
        System.out.println("\nNome do produto: " + nomeProduto);
        System.out.println("Novo preco com desconto: R$" + novoPreco);
        
        scanner.close();
    }
}
