import java.util.Scanner;

// Exceção personalizada ParametrosInvalidosException
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite um Nº");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo Nº");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo numero deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm + 1; // +1 para incluir o último número
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
