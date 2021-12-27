import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            int opcao;
            float saque;
            float deposito;

            ContaCorrente cc = new ContaCorrente();
            Scanner scan = new Scanner(System.in);
            Scanner digiteSaque = new Scanner(System.in);
            Scanner digiteDeposito = new Scanner(System.in);


            opcao = 0;
            while (opcao != 6) {
                System.out.println("SELECIONE UMA DAS OPÇÕES ABAIXO");
                System.out.println("1 - Depositar\n2 - Sacar\n3 - Ver extrato\n4 - Investir\n5 - Investir na bolsa\n6 - sair");
                opcao = scan.nextInt();

                switch (opcao) {
                    case 1: {
                        System.out.println("Digite o valor que deseja depositar:");
                        deposito = digiteDeposito.nextFloat();
                        cc.depositar(deposito);
                        System.out.println("taxa de deposito foi cobrada");
                        System.out.println("===============================================");
                        break;

                    }
                    case 2: {
                        System.out.println("Digite o valor que desaja sacar: ");
                        saque = digiteSaque.nextFloat();
                        cc.sacar(saque);
                        cc.taxaConta();
                        System.out.println("Taxa conta e taxa de sacar foram cobradas");
                        System.out.println("===============================================");
                        break;
                    }
                    case 3: {
                        cc.extrato();
                        System.out.println("===============================================");
                        break;

                    }

                    case 4: {

                        cc.investimentos();
                        System.out.println("===============================================");
                        break;
                    }
                    case 5: {
                        cc.investirBolsa();
                        System.out.println("===============================================");
                        break;
                    }

                    case 6: {
                        System.out.println("Finalizando sistema....");
                    }

                    default:
                        System.out.println("Insira uma opção valida");
                        System.out.println("===============================================");


                }

            }


        }
    }

