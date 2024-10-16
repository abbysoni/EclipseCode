package helloWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass {

	public static void main(String[] args) {
		System.out.println("Hello world A!");
		
		WebDriver driver = (WebDriver) new ChromeDriver();
        
        System.out.println("none of you know what you're doing");

        driver.get("https://www.google.com");
        driver.quit();

        System.out.println("Finaaly its over");
	}

}


