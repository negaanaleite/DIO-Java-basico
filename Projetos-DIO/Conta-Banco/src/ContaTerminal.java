//Primeiro projeto da DIO - Java Basico. 
// Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
//Dentro do projeto:  crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.
//** Pré-Requisitos:  */
 //* TODO: Conhecer e importar a classe Scanner  
//* Exibir as mensagens para o nosso Usuário 
//* Obter pela classe scanner os valores digitados no terminal
// * Exibir a mensagem conta criada
    
 import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa: \"Por favor, digite o número da Agência !\"");
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

        System.out.print("Nome Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}

