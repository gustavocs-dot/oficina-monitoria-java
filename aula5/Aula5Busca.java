public class Aula5Busca {
    public static void main(String[] args) {

        int[] v = { 10, 20, 30, 40, 50 };

        int menor = v[0], maior = v[0];

        int alvo = 50;

        int posicaoAlvo = 0;

        boolean achou = false;

        for (int i = 0; i < v.length; i++) {
            if (v[i] < menor) {
                System.out.println("Menor: " + (menor = v[i]));
            }
            else if (v[i] > maior) {
                System.out.println("Maior: " + (maior = v[i]));
            }
            if (v[i] == alvo) {
                achou = true;
                posicaoAlvo = i;

            }

        }
    }
}
