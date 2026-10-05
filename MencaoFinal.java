import java.util.Scanner;

public class MencaoFinal {
    public static void main(String[] args) {
        double N1;
        
    Scanner n1sc = new Scanner(System.in);   
    
    System.out.println("Informe sua nota: ");
    N1 = n1sc.nextInt();

    if (N1 <= 2.9){
        System.out.println("Sua menção é II");}
    else if (N1 >= 3 && N1 <= 4.9){
        System.out.println("Sua menção é: MI");}
    else if (N1 >= 5 && N1 <= 6.9){
        System.out.println("Sua menção é: MM");}
    else if (N1 >= 7 && N1 <= 8.9){
        System.out.println("Sua menção é: MS");}
    else {
        System.out.println("Sua menção é: SS");}

    }
}
