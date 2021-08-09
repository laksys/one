package in.laksys;

import static org.junit.Assert.*;
import org.junit.Test;

//testing class
public class AppTest {
    @Test
    public void firstTest()  {
    	assertEquals("testing gcd",  4, App.gcd(12, 28));
    }
    @Test
    public void secondTest(){
    	assertTrue( App.isEven(12));
    }
    @Test
    public void thirdTest() {
    	assertTrue( App.isOdd(11));
    }
    @Test
    public void fourthTest(){
    	assertFalse(App.isEven2(19));
    }
    @Test
    public void fifthTest(){
        assertEquals(12, App.add(3,9));
    }
    @Test
    public void test1(){
        assertFalse( App.isEven(9));
    }
    @Test
    public void test2(){
        assertFalse(App.isOdd(10));
    }
}
