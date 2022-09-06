package org.pedrozart;

import java.io.IOException;
import java.util.Scanner;


public class App {


    public static int calculaMaior(int a, int b, int c){
        int maior = 0;

        if (a > b && a > c) {
            maior = a;
            System.out.println(maior+" eh o maior");

        } else if (b > a && b > c) {
            maior = b;
            System.out.println(maior+" eh o maior");

        }else{
            maior = c;
            System.out.println(maior+ " eh o maior");

        }

        return maior;

    }
    public static void main(String [] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        calculaMaior(a, b, c);
        /*
            calculaMaior(7,14,106);
            calculaMaior(217,14,6);

         */




    }

}
