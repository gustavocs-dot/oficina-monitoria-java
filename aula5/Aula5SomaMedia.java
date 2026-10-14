public class Aula5SomaMedia {
    public static void main(String[] args) {
         
        int[] v = {10,20,30,40,50};
        double soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];                            //soma += v[i] --> soma = soma + v[i]
        }

        System.out.println("Soma: " + soma);

        double media = soma / v.length;

        System.out.println("Média: " + media);

    }
}
