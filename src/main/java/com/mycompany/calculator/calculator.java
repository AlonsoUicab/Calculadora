package com.mycompany.calculator;
public class calculator {
    public static void main(String[] args) {
        operaciones operaciones1 = new operaciones();
        System.out.println("La suma es     : " + operaciones1.suma(5, 3));
        System.out.println("La resta es    : " + operaciones1.resta(5, 3));    
        System.out.println("La multiplicacion es     : " + operaciones1.multiplicacion(5, 3));
        System.out.println("La division es     : " + operaciones1.division(5, 3));
        System.out.println("La Potencia es     : " + operaciones1.exponenciacion(5, 3));
    }
    
}
