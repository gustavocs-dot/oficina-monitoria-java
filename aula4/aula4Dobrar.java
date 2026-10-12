import java.util.Scanner;

public class aula4Dobrar {
    public static void main(String[] args) {

        Scanner scd = new Scanner(System.in);
        System.out.print("Digite um número para dobrar: ");
        int numero = scd.nextInt();
        int n = numero;
        
        System.out.println("o dobro do número " + n + " é: " + dobrar(numero));
    }
    
    public static int dobrar(int numero) {
        return numero * 2;
        
    }
   

}   
