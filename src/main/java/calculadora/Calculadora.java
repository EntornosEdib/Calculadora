/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package calculadora;

/**
 *
 * @author Rafael
 */
public class Calculadora {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
public static final String newLine = System.getProperty("line.separator");
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
        int res = suma(a,b);
        int esperado=5;
        if (res == esperado){
            System.out.print(ANSI_GREEN+"Este programa está bien hecho"+ANSI_RESET+newLine);
            System.out.println("3 + 2 = 5");
        } else {
            System.out.print(ANSI_RED+"Este programa está mal hecho"+ANSI_RESET+newLine);
            System.out.println("3 + 2 NO ES 5");
        }
        
    }
}
