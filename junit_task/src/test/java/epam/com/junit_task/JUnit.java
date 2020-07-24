package epam.com.junit_task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JUnit {  
	
    @Test  
    public void testEmptyString(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("",checkA.remove(""));
    }  
    
    @Test  
    public void testBChar(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("B",checkA.remove("B"));
    }
    
    @Test  
    public void testAChar(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("",checkA.remove("A"));
    }
    
    @Test  
    public void testABChar(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("B",checkA.remove("AB"));
    }	
    
    @Test  
    public void testBAChar(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("B",checkA.remove("BA"));
    }
    
    @Test  
    public void testNChar(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("BBCD",checkA.remove("BBCD"));
    }

    @Test  
    public void testN1Char(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("CD",checkA.remove("AACD"));
    }

    @Test  
    public void testN2Char(){
    	RemoveA checkA = new RemoveA();
    	assertEquals("BCD",checkA.remove("ABCD"));
    }
    
    
}  