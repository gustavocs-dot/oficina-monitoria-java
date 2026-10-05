import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        
        Random random = new Random();

        int numeroSorteado = random.nextInt(4);
        System.out.println("Número sorteado: " + numeroSorteado);

        String [] participantes = {"Ana", "Bruno", "Carlos", "Diana"};
        System.out.println(participantes[numeroSorteado]);
    }
}
