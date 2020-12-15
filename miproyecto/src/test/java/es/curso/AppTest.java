package es.curso;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
   
    @Test
    public void pruebaDoblar(){
    int resultado = App.doblar(5);
    
       Assert.assertEquals( resultado, 10) );

     }
         @Test
    public void pruebaDoblar(){
    int resultado = App.doblar(0);
       Assert.assertEquals( resultado, 0) );
     }
    
    @Test
    public void pruebaDoblar(){
    int resultado = App.doblar(-5);
       Assert.assertEquals( resultado, -10) );
     }
    
    @Test
    public void pruebaDoblar(){
    int resultado = App.mayor(10,5);
       Assert.assertEquals( resultado, 10) );
     }
     
    @Test
    public void pruebaDoblar(){
    int resultado = App.mayor(5,10);
       Assert.assertEquals( resultado, 10) );
     }
     
    @Test
    public void pruebaDoblar(){
    int resultado = App.mayor(5,-10);
       Assert.assertEquals( resultado, 5) );
     }
}
