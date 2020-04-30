/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Rafael
 */
public class Calculadora {
    public static int suma(int a, int b){
        return a+b;
    }
    public static int resta(int a, int b){
        return a-b;
    }
    public static int multiplica(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
    public static void main(String args[]){
        int a=3;
        int b=2;
        int res = multiplica(a,b);
        System.out.println("3 x 2 = 6");
    }
}
