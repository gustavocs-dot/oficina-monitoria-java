import java.util.Scanner;

public class aula4Classificacao {
    public static void main(String[] args) {
        Scanner scmns = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        String nota1String = scmns.nextLine();
        System.out.print("Digite a segunda nota: ");
        String nota2String = scmns.nextLine();

        double nota1 = Double.parseDouble(nota1String);
        double nota2 = Double.parseDouble(nota2String);

        System.out.println("A média das notas " + nota1 + " e " + nota2 + " é: " + media(nota1, nota2));
        if (aprovado(media(nota1, nota2))) {
            System.out.println("O aluno está aprovado? " + "Sim.");
        } else {
            System.out.println("O aluno está aprovado? " + "Não.");
        }
        
    }

    public static double media(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static boolean aprovado(double media) {
        boolean aprovado = media >= 6.0;

        return aprovado;
    }
}
