import java.util.Scanner;

public class maiorIdade {
    public static void main(String[] args) {
        int id1;
        
        Scanner scr = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        id1 = scr.nextInt();
        
        if (id1 >= 18){
            System.out.println("Maior de idade");}
        else{
            System.out.println("Menor de Idade");
        }
        

    }
}
