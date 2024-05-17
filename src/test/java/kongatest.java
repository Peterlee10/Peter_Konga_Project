import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

//@BeforeTest
public class kongatest {
    private WebDriver driver;

    //@BeforeClass
    //@BeforeMethod

    //@AfterClass
    //@AfterMethod
    //@AfterTest

    @Test
    public void start() {
        //locate the chrome driver
        System.setProperty("webdriver.chrome.driver", "resources");

        //open my chrome browser
        driver = new ChromeDriver();

        //Input my konga Url
        driver.get("https://www.konga.com/");
        //Thread.sleep("1000);

        //maximize the page
        driver.manage().window().maximize();

        //click on the signup button
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]")).click();

        //
        driver.findElement(By.id("username")).sendKeys("//*[@id=\"username\"]");

        //locate password
        driver.findElement(By.id("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]")).sendKeys("admin");

        //click on login button
        driver.findElement(By.id("Login")).click();
        //Thread.sleep(10000);

        //FromtheCategories,clickonthe“ComputersandAccessories”
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();

        //Click on theLaptop SubCategory
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li[4]/a/label/span")).click();

        //Click on the Apple MacBooks
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[3]/section/div/section/div[2]/div[2]/ul/li/a/ul/li[1]/a/label/span")).click();

        //Add an item to the cart
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]")).click();

        //Select Address
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div[2]/div/div[1]/div/h4")).click();

        //Select a Card Payment Method
        driver.findElement(By.className("payment-option-content")).click();

        //Input invalid card details
        driver.findElement(By.xpath("//*[@id=\"validateCardForm\"]")).click();

        //Print Out the error message: Invalid card number


        //Close the iFrame that displays the input card Modal

        //logout
        driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/div/ul/li[7]/a")).click();
    }
        @AfterTest
    public void closedBrowser(){
          //Quit the browser
          driver.quit();
    }

}
