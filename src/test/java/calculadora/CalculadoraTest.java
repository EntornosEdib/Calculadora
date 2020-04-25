/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Rafael
 */
public class CalculadoraTest {

    /**
     *
     */
   @Test
    public void testSuma(){
         int resultado=Calculadora.suma(2,3);
         int esperado=5; // 2 + 3 = 5
         assertEquals(esperado,resultado);
    } 
    @Test
    public void testResta(){
         int resultado=Calculadora.resta(3,2);
         int esperado=2; // 3 - 2 = 1
         assertEquals(esperado,resultado);
    } 
}
    
