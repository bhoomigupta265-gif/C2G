import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd=sc.nextInt();
        int npd=sc.nextInt();
        if(cd>2){
            System.out.println(npd+2);
        }else if(cd<=2){
            System.out.println(cd+npd);
         }



        
    }
}