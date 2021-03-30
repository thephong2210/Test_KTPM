package testproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/**
 *
 * @author admin
 */
public class DangKy {
    static WebDriver driver;
    String filepath="C:\\Users\\theph\\Desktop\\KTPM.xlsx";
    public DangKy() {
    }
    ReadCellExample rc = new ReadCellExample(); 
    
        

   
    @BeforeClass
    //Chạy trước method test đầu tiên trong class hiện tại
    public static void setUpClass() throws Exception {
        // thiết lặp các đối tượng mặc định;
        
        System.out.println("Start");
        System.setProperty("webdriver.chrome.driver","test\\lib\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.get("http://localhost/web2general/checkout-registration.php");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(800, 600));
        driver.manage().window().fullscreen();
    }
     
     // Xây dựng các testcae để check test 
     /*
      B1. Xác định control nhập dữ liệu
      B2. Nhập dữ liệu vào username không tồn tại
      B3. Click vào login
      B4. Chờ thông báo.
      B5. Kiểm tra message.
     */
     @Test
     // Xây dựng các testcae để check test 
     /*
      B1. Xác định control nhập dữ liệu
      B2. Nhập dữ liệu vào username không tồn tại
      B3. Click vào login
      B4. Chờ thông báo.
      B5. Kiểm tra message.
     */
     public void check_singupForm() throws InterruptedException {
        //find username
        WebElement txt_username= driver.findElement(By.id("firstname"));
        // fill username in text username
        txt_username.sendKeys(rc.ReadCellData(2, 4, filepath));
        driver.findElement(By.id("name")).sendKeys("sbdjbsdjbf");
        driver.findElement(By.id("email")).sendKeys("mdsd111en@gmail.com");
        driver.findElement(By.id("password")).sendKeys("kid1111euoanh123");
        driver.findElement(By.id("d-b-day")).sendKeys("1");
        driver.findElement(By.id("d-b-month")).sendKeys("1");
        driver.findElement(By.id("d-b-year")).sendKeys("2000");
        driver.findElement(By.id("SubmitCreate")).click();
//        WebElement lblerror= driver.findElement(By.className("alert-error"));
//       assertEquals(lblerror.getText(),"Login and/or password are wrong.");
        // hoặc viết cách khác
        //driver.findElements(By.xpath("//input[@value='Sign in' and @type='submit']"));
        //WebElement btnsubmit = driver.findElement(By.xpath("//input[@type='submit' and @value='Sign in']"));
        //System.out.println("duong dan:"+btnsubmit);
        
        // chờ thông báo khi submit
        //Thread.sleep(1000);
       
     }
//     @Test
//     public void checkcolor()
//     {
//        
//        String buttonColor = driver.findElement(By.name("submit")).getCssValue("background-color");
//        String buttonTextColor = driver.findElement(By.name("submit")).getCssValue("color");
//        System.out.println("Button color: " + buttonColor);
//        System.out.println("Text color " + buttonTextColor);
//     }
//    @BeforeMethod
//    //Chạy trước mỗi method test
//    // cài đặt reset để tránh làm nhiễu các testcase
//    public void setUpMethod() throws Exception {
//       driver.navigate().refresh();
//        
//    }
//    @Test
//    // kiểm tra đăng nhập thành công.
//    public void test2()
//    {
//        WebElement txt_username= driver.findElement(By.id("user_login"));
//        // fill username in text username
//        txt_username.sendKeys("username");
//        driver.findElement(By.name("user_password")).sendKeys("password");
//        driver.findElement(By.name("submit")).click();
//        driver.findElement(By.id("details-button")).click();
//        driver.findElement(By.id("proceed-link")).click();
//        
//        String expected_title="Zero Bank";
//        WebElement actual_title=driver.findElement(By.className("brand"));
//        Assert.assertEquals(expected_title,actual_title.getText());
//        //driver.findElement(By.linkText("Account Activity")).click();
//    }
//    @Test
//    // Kiểm tra độ rộng của cotrol
//    public void test3()
//    {   
//        driver.findElement(By.className("icon-user")).click();
//        driver.findElement(By.id("logout_link")).click();
//        driver.findElement(By.id("signin_button")).click();
//        WebElement txt_user= driver.findElement(By.id("user_login"));
//        int width_user =220;
//        int height_user=30;
//        System.out.println("Size sang:"+txt_user.getSize().width);
//        Assert.assertEquals(width_user, txt_user.getSize().width);
//        Assert.assertEquals(height_user, txt_user.getSize().height);
//      
//    }
    @AfterClass
     //Chạy trước tất cả method test trong class hiện tại
    public static void tearDownClass() throws Exception {
       
    }

    @AfterMethod
    //Chạy sau mỗi method test
    // sử dụng cài đặt xử lỹ lỗi
    public void tearDownMethod() throws Exception {
        //giải phóng vùng nhớ sau khi xong. thường các kết nối đến database vì đối tượng đã được java giải phóng
        //driver.quit();
        System.out.println("End");
        
    }
} 
