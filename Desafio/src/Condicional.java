public class Condicional {
    public static void main(String[] args) {
        int ano = 2022;
        boolean inclusoNoPlano = true;
        double notaDoAnime = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022){
            System.out.println("Lançamento!");
        } else {
            System.out.println("Anime de outra temporada!");
        }

        if (inclusoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Anime disponível!");
        }else {
            System.out.println("Você pode alugar este anime por apenas R$19,99");
        }
    }
}
