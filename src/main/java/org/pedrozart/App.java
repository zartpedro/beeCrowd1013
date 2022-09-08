package org.pedrozart;

import java.io.IOException;
import java.util.Scanner;


public class App {


    public static int calculaMaior(int a, int b, int c){
        int maior = 0;

        if (a > b && a > c) {
            maior = a;


        } else if (b > a && b > c) {
            maior = b;


        }else{
            maior = c;


        }

        return maior;

    }
    public static void main(String [] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();


        System.out.println(calculaMaior(a, b, c)+" eh o maior");





    }

}
