package framesdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InternetHerokupAppDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		
		//WebElement paraText = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		WebElement tinyMCEEditorBox = driver.findElement(By.id("tinymce"));
		tinyMCEEditorBox.clear();
		tinyMCEEditorBox.sendKeys("Arun Motoori QAFox ");
	}

}
