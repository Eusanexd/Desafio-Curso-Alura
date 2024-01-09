import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu anime favorito:");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano do anime?");
        int ano = leitura.nextInt();
        System.out.println(ano);
        System.out.println("Qual nota você avalia o anime?");
        double nota = leitura.nextDouble();
        System.out.println(nota);
    }
}
