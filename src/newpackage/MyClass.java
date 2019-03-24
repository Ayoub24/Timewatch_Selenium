package newpackage;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Eclipse_workspace\\chromedriver.exe");
		// tries to open chercher.tech page
		driver.get("http://timewatch.ma");
		WebElement Marques = driver.findElement(By.xpath("//a[@href='http://timewatch.ma/categorie-produit/footwear/']//following-sibling::ul"));
		//Marques.getAttribute("innerHTML");
		//System.out.println(Marques.getAttribute("innerHTML"));
		List<WebElement> MarqueList = Marques.findElements(By.xpath("//following-sibling::li"));
		//System.out.println("hello "+ MarqueList);
		for (WebElement we:MarqueList)
        {
			System.out.println("hello");
			System.out.println(we.getAttribute("innerHTML"));
        } 
		driver.close();
	}
}

