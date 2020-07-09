package p1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class login extends first {
  @Test
  public void Registerpage() {
	  
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("email")).sendKeys("malathi_shanmugam@yahoo.co.in");
	  driver.findElement(By.name("pass")).sendKeys("breakingdawntwilight");
	  driver.findElement(By.id("u_0_b")).click();
	  
  }
}
