import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Qual nota você avalia o anime?");
            nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }

        }
        if (totalDeNotas > 0){
            System.out.println("Média do anime: " + media / totalDeNotas);
        }


    }
}
