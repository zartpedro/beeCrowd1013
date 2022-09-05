import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String [] args) throws IOException {
        System.out.println("Digite 3 numeros");

        Scanner leitor = new Scanner(System.in);
         int a = leitor.nextInt();
         int b = leitor.nextInt();
         int c = leitor.nextInt();


         if(  a >  b &&  a >  c) {
             System.out.println(a+" eh o maior");

             }else if( b > a && b > c){
             System.out.println(b+ " eh o maior");
            }
                else{
                    System.out.println(c+ " eh o maior");
            }


    }
}


