/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

//junit 4
//import org.junit.jupiter.api.Test;
//junit 5
import org.junit.After;
import org.junit.Test;
//junit 4
//import static org.junit.jupiter.api.Assertions.*;
//junit 5
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author Rafael
 */
public class CalculadoraTest {

    /**
     *
     */
    @Before
    public void showTextBefore(){
         System.out.println("Estamos ejecutando la prueba");
    } 
    @After
    public void showTextAfter(){
         //System.out.println(resultado);
         System.out.println("Hemos hecho la prueba");
    } 
    @Test
    public void testSuma(){
         int resultado=Calculadora.suma(2,3);
         int esperado=5; // 2 + 3 = 5
         assertEquals(esperado,resultado);
             } 
    @Test
    public void testResta(){
         int resultado=Calculadora.resta(3,2);
         int esperado=1; // 3 - 2 = 1
         assertEquals(esperado,resultado);
    } 
    @Test
    public void testMultiplica(){
         int resultado=Calculadora.multiplica(3,2);
         int esperado=6; // 3 * 2 = 1
         assertEquals(esperado,resultado);
    } 
    
    @Test
    public void testDivide(){
         int resultado=Calculadora.divide(4,2);
         int esperado=2; // 3 / 2 = 1
         assertEquals(esperado,resultado);
    } 
}
    
