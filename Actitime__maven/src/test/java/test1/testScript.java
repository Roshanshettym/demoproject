package test1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import generic.Baseclass;

public class testScript extends Baseclass{
	public WebDriver driver;
	@Test
	public void test()
	{
		String text = driver.getTitle();
		System.out.println("title:"+text);
	}

}
