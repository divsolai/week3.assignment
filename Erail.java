package selenium.assignments;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch https://erail.in/
		//Set the system property and Launch the URL
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		
		//Click the 'sort on date' checkbox
		driver.findElementById("chkSelectDateOnly").click();
		
		//Clear and type in the from station text field
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("MSB",Keys.ENTER);
		
		//Clear and type in the to station text field
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("DLI",Keys.ENTER);
		
		// Add a java sleep for 2 seconds
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Store all the train names in a list
		List<WebElement> eleTrainNames = driver.findElementsByXPath("((//table//tbody)[3])//td[2]");
		
		//Get the size of list
	    int listsize = eleTrainNames.size();
	    System.out.println(listsize);
	    
	    for (WebElement train : eleTrainNames) {
			System.out.println(train.getText());
		}
	    
	    //Add the list into a new Set
	    Set<WebElement> set = new LinkedHashSet<WebElement>();
	    set.addAll(eleTrainNames);
	    
	    //Get the size of set
	    int setsize = set.size();
	    System.out.println(setsize);
	    
	    // Compare the Size of list and Set to verify the names are unique
	    if(listsize == setsize)
	    {
	    	System.out.println("The names of the train are unique");
	    	
	    }
	    else
	    {
	    	System.out.println("duplicate train names are present");
	    }
	    
	    driver.close();	
	    }
	   
		
		}
	


