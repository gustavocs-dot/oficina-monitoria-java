public class Aula5Percurso {
    
    public static void main(String[] args) {
        
        int[] v = {10,20,30,40,50};

        for (int i = 0; i < v.length; i++){
            System.out.println((i + ": " + v[i]));
            
        }

        for (int i : v) {
            System.out.println(i);
        }

    }
}
