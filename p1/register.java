package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class register extends first{
  @Test
  public void f1() {
	  driver.get("http://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.name("firstname")).sendKeys("Malathi");
	  driver.findElement(By.name("lastname")).sendKeys("Jayakumar");
	  driver.findElement(By.name("reg_email__")).sendKeys("malathi_shanmugam@yahoo.co.in");
	  driver.findElement(By.name("reg_email_confirmation__")).sendKeys("malathi_shanmugam@yahoo.co.in");
	  driver.findElement(By.name("reg_passwd__")).sendKeys("malathi@1818");
	  driver.findElement(By.name("birthday_day")).sendKeys("18");
	  driver.findElement(By.name("birthday_month")).sendKeys("Dec");
	  driver.findElement(By.name("birthday_year")).sendKeys("1989");
	  WebElement radio1 = driver.findElement(By.name("sex"));
	  radio1.click();	
	  driver.findElement(By.name("websubmit")).click();
	  
  }
}
