import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arya\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://affiliate1-qa-member.mpoweredhealth.com/login");
        driver.manage().window().maximize();
        Thread.sleep(7000);
        WebElement loginField=driver.findElement(By.xpath("//input[@name='email']"));
        WebElement passwordField=driver.findElement(By.xpath("//input[@name='password']"));
        loginField.sendKeys("1234567890");
        passwordField.sendKeys("Abcde@1996");
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();
        Thread.sleep(6000);
        
        
       //Dashboard
        
        WebElement vita=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/a/div/div[2]/div"));
        vita.click();
        
        WebElement home=driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/div/div/ul/a[1]/div[2]"));
        home.click();
        
        WebElement medication=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[2]"));
        medication.click();
        
        WebElement home1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/nav/div/div/div/ul/a[1]/div[2]/span"));
        home1.click();
        
        
        
       
       
	}

}
