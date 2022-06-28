import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Maquina m = new Maquina();
        Scanner sc = new Scanner(System.in);

        int opcao, res;
        float valor;

        do {
            System.out.println(m.mostraInfo());
            System.out.println("Digite 99 para inserir credito");
            System.out.println("Digite -1 para sair");
            System.out.println("Ou digite o numero do refri para comprar (0-4)");
            opcao = sc.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                    res = m.comprar(opcao);
                    if (res == 0) {
                        System.out.println("Enjoy!");
                    } else if (res == -1) {
                        System.out.println("Saldo insuficiente. Insira mais $$");
                    } else {
                        System.out.println("Refrigerante em falta");
                    }
                    break;

                case 99:
                    System.out.println("Digite o valor: ");
                    valor = sc.nextFloat();
                    m.inserirCredito(valor);
                    break;
                case -1:
                    System.out.println("Obrigado por utilizar a maquina");
                    System.out.println("Receba seu troco: " + m.solicitarTroco());
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;

            }
        } while (opcao != -1);
    }
}
//