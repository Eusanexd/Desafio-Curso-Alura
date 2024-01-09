import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        int escolha = 0;
        double saldo = 2500.00;
        double trans = 0;

        System.out.println("""
                Tipo de conta:      Corrente
                Saldo inicial:      R$ 2500,00
                **************************************
                """);
        Scanner banco = new Scanner(System.in);

        while (escolha != 4) {
            System.out.println("""
                    Operações
                                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    """);
            escolha = banco.nextInt();
            if (escolha == 1){
                System.out.println("Seu saldo atual é de: " + saldo);
            } else if (escolha == 2) {
                System.out.println("Quanto deseja receber?");
                saldo = saldo + banco.nextDouble();
            } else if (escolha == 3) {
                System.out.println("Quanto deseja transferir?");
                trans = banco.nextDouble();
                if (trans > saldo) {
                    System.out.println("Saldo insuficiente para transferir.");
                }else saldo = saldo - trans;
            }
        }
    }
}
