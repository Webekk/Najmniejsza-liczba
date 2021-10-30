package com.company;

import java.util.Scanner;

public class Main {

    static void najmniejsza() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        int a = scan.nextInt();
        System.out.println("Podaj druga liczbe");
        int b = scan.nextInt();
        System.out.println("Podaj trzecia liczbe");
        int c = scan.nextInt();

        if (a < b) {
            if(a<c){
                System.out.println("Najmniejsza liczba to: " + a);
            }
        }
        if(b<a){
            if(b<c){
                System.out.println("Najmniejsza liczba to: " +b);
            }
        }
        if(c<a){
            if(c<b){
                System.out.println("Najmniejsza liczba to: " + c);
            }
        }
    }
    public static void main(String[] args) {
        najmniejsza();
    }
}
