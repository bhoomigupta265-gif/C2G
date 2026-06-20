import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.next();
        if(l=="Red"){
            System.out.println("Stop");
        }else if(l=="Yellow"){
            System.out.println("Wait");
        }else if(l=="Green"){
            System.out.println("Go");
        }else{
            System.out.println("inavlid clr");
        }
        
    }
}