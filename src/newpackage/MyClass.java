package newpackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.PrintWriter;
import org.json.JSONObject;

public class MyClass
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\Eclipse_workspace\\chromedriver.exe");
		// tries to open chercher.tech page
		driver.get("http://timewatch.ma");

		List<WebElement> MarqueList = driver.findElements(By.xpath("//a[@href='http://timewatch.ma/categorie-produit/footwear/']//following-sibling::ul//following-sibling::li/a"));
		

	    //Create instance of JSONObject
	    JSONObject jObj = new JSONObject();
	      
		for (int i=0; i<MarqueList.size();i++){
		      System.out.println(MarqueList.get(i).getAttribute("textContent"));
		      System.out.println(MarqueList.get(i).getAttribute("href"));
		      
		      
		      //writing test data to the JSON by put method
		      jObj.put(MarqueList.get(i).getAttribute("textContent"), MarqueList.get(i).getAttribute("href"));
		      
		    }
		//Writing test data to the JSONWrite.json JSON file
	    PrintWriter pWriter = new PrintWriter("files/MARQUES.json");
	    pWriter.write(jObj.toString());
	      
	    pWriter.flush();
	    pWriter.close();
		driver.close();
	}
}

