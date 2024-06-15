package com.mycompany.taller1suma;

import java.util.Scanner;

public class Taller1Suma {
    public static int sumar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa el número 1");
        int a = lector.nextInt();
        System.out.println("Ingresa el número 2");
        int b = lector.nextInt();
        int suma = sumar(a, b);
        System.out.println("La suma es " + suma);
    }
}
