package web.service;

import org.junit.Assert;
import org.junit.Test;

public class TestMathQuestionService {

    @Test
    public void testQ1Addition() {
        // Test addition with valid inputs
        Assert.assertEquals(3.0, MathQuestionService.q1Addition("1", "2"), 0);
        
        // Test addition with one zero
        Assert.assertEquals(5.0, MathQuestionService.q1Addition("5", "0"), 0);
        
        // Test addition with negative numbers
        Assert.assertEquals(-3.0, MathQuestionService.q1Addition("-1", "-2"), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQ1AdditionWithEmptyInput() {
        // Test addition with empty inputs
        MathQuestionService.q1Addition("", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQ1AdditionWithNullInput() {
        // Test addition with null inputs
        MathQuestionService.q1Addition(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQ1AdditionWithInvalidInput() {
        // Test addition with invalid inputs
        MathQuestionService.q1Addition("abc", "def");
    }



    @Test
    public void testQ2Subtraction() {
        // Test subtraction with valid inputs
        Assert.assertEquals(3.0, MathQuestionService.q2Subtraction("5", "2"), 0);
        
        // Test subtraction with negative result
        Assert.assertEquals(-3.0, MathQuestionService.q2Subtraction("2", "5"), 0);
        
        // Test subtraction with negative numbers
        Assert.assertEquals(-3.0, MathQuestionService.q2Subtraction("-1", "2"), 0);
        
       
    }

    @Test
    public void testQ3Multiplication() {
        // Test multiplication with valid inputs
        Assert.assertEquals(6.0, MathQuestionService.q3Multiplication("2", "3"), 0);
        
        // Test multiplication with one zero
        Assert.assertEquals(0.0, MathQuestionService.q3Multiplication("5", "0"), 0);
        
        // Test multiplication with negative numbers
        Assert.assertEquals(-6.0, MathQuestionService.q3Multiplication("-2", "3"), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQ3MultiplicationWithEmptyInput() {
        // Test multiplication with empty inputs
        MathQuestionService.q3Multiplication("", "");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQ3MultiplicationWithNullInput() {
        // Test multiplication with null inputs
        MathQuestionService.q3Multiplication(null, null);
    }

   
}
