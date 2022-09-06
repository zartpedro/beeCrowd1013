package org.pedrozart;

import java.io.IOException;
import java.util.List;


public class App {


    public static int calculaMaior(int a, int b, int c){
        int maior = 0;

        if (a > b && a > c) {
            maior = a;

        } else if (b > a && b > c) {
            maior = b;
        } else if (c > a && c > b){
            maior = c;
        }else{

        }

        return maior;

    }
    public static void main(String [] args) throws IOException {

        calculaMaior(7,14,106);
        calculaMaior(217,14,6);




    }

}
