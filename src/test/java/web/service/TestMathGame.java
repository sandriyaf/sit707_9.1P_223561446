package web.service;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class TestMathGame {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/sandr/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/");
    }

    @Test
    public void testWelcomePage() {
        assertEquals("http://localhost:8080/", driver.getCurrentUrl());
        assertTrue(driver.getPageSource().contains("Server is running..."));
        driver.close();
    }

    @Test
    public void testLoginPage() {
        driver.findElement(By.linkText("Login")).click();
        assertEquals("http://localhost:8080/login", driver.getCurrentUrl());
        //assertTrue(driver.getPageSource().contains("Please log in"));
        driver.close();
    }

    @Test
    public void testLoginSuccess() {
        login("ahsan", "ahsan_pass", "1990-01-01");
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        assertEquals("http://localhost:8080/q1", driver.getCurrentUrl());
       
        
    }

    @Test
    public void testQ1Page() {
    	driver.findElement(By.id("number1")).sendKeys("2");
        driver.findElement(By.id("number2")).sendKeys("3");
        driver.findElement(By.id("result")).sendKeys("5");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        assertEquals("http://localhost:8080/q2", driver.getCurrentUrl());
        
        
    }

    @Test
    public void testQ2Page() {
        login("ahsan", "ahsan_pass", "1990-01-01");
        driver.findElement(By.id("number1")).sendKeys("3");
        driver.findElement(By.id("number2")).sendKeys("3");
        driver.findElement(By.id("result")).sendKeys("6");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //goToNextQuestion("http://localhost:8080/q3");
        assertEquals("http://localhost:8080/q2", driver.getCurrentUrl());
        //assertTrue(driver.getPageSource().contains("Q2"));
    }

    @Test
    public void testQ3Page() {
        login("ahsan", "ahsan_pass", "1990-01-01");
        driver.findElement(By.id("number1")).sendKeys("2");
        driver.findElement(By.id("number2")).sendKeys("2");
        driver.findElement(By.id("result")).sendKeys("4");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        assertEquals("http://localhost:8080/q3", driver.getCurrentUrl());
        assertTrue(driver.getPageSource().contains("Thank you for completing the math questions!"));
        
    }

    private void login(String username, String password, String dob) {
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("passwd")).sendKeys(password);
        driver.findElement(By.name("dob")).sendKeys(dob);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        
    }
   
}

