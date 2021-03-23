import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SampleTest {
    @Test(priority = 1)
    public void test1(){
        System.out.println("Everything is ok");
        /*WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.get("www.facebook.com");*/
    }

    @Test(dataProvider="test data")
    public void test22(String name){
        System.out.println("Everything is ok 2 "+name);
    }
    @BeforeMethod
    public void test2(){
        System.out.println("This must run first");
    }

    @AfterMethod
    public void test3(){
        System.out.println("This must run last");
    }

    @BeforeClass
    public void test4(){
        System.out.println("This must run before test 2");
    }

    @BeforeTest
    public void test5(){
        System.out.println("This must run before test 4");
    }

    @DataProvider (name="test data")
    public String dpmethod(){
        return "Rahul";
    }


}
