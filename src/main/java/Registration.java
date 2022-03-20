import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arya\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://affiliate1-qa-member.mpoweredhealth.com/signup");
        driver.manage().window().maximize();
        Thread.sleep(7000);
        WebElement groupnumberField=driver.findElement(By.xpath("//input[@name='groupnumber']"));
        WebElement firstnameField=driver.findElement(By.xpath("//input[@name='firstname']"));
        WebElement lastnameField=driver.findElement(By.xpath("//input[@name='lastname']"));
        WebElement date=driver.findElement(By.xpath("//input[@name='date']"));
        WebElement ssnfield=driver.findElement(By.xpath("//input[@name='ssn']"));
        groupnumberField.sendKeys("123456789");
        firstnameField.sendKeys("Thomas");
        lastnameField.sendKeys("Paul");
        date.sendKeys("12/22/1992");
        ssnfield.sendKeys("123456798");
        WebElement proceed=driver.findElement(By.xpath("//button[@type='submit']"));
        proceed.click();
        
        // second page of registration
        Thread.sleep(6000);
        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
        WebElement phonenumber=driver.findElement(By.xpath("//input[@name='phonenumber']"));
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        WebElement confirmpassword=driver.findElement(By.xpath("//input[@name='confirmpassword']"));
        WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));
        email.sendKeys("reg5@gmail.com");
        phonenumber.sendKeys("8593925553");
        password.sendKeys("Achu@123");
        confirmpassword.sendKeys("Achu@123");
        check.click();
        WebElement create=driver.findElement(By.xpath("//button[@type='submit']"));
        create.click();
        
        //third page of registration
        
        Thread.sleep(6000); 
        WebElement otp=driver.findElement(By.xpath("//input[@name='otp']"));
        otp.sendKeys("1234");
        WebElement verify=driver.findElement(By.xpath("//button[@type='button']"));
        verify.click();
        Thread.sleep(6000);
        
        // login page 
        
        
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
        WebElement vita=driver.findElement(By.xpath("//div[@class='MuiBox-root css-y8xuao']"));
        vita.click();
        
        
        
	}

}
