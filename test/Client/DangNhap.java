/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author theph
 */
import static ADMIN.DangNhapAdmin.setUpClass;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.junit.Assert;
import org.openqa.selenium.Dimension;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testproject.ReadCellExample;
import static Client.DangKy.*;

public class DangNhap {

    String filepath = "exel\\TestcaseSignUp.xlsx";

    public DangNhap() {
    }
    ReadCellExample rc = new ReadCellExample();

    @BeforeClass
    //Chạy trước method test đầu tiên trong class hiện tại
    public static void setUpClass() throws Exception {
        // thiết lặp các đối tượng mặc định;

        System.out.println("Start");
        System.setProperty("webdriver.chrome.driver", "test\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.get("http://localhost/web2general/registration.php");
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(800, 600));
//        driver.manage().window().fullscreen();
    }

    @Test

    public void check_LoginForm_fail() throws InterruptedException, Exception {
        driver.findElement(By.id("loginname")).sendKeys("username_sai");
        driver.findElement(By.id("loginpassword")).sendKeys("password_sai");
        driver.findElement(By.id("signinCreate")).click();

        String al = driver.switchTo().alert().getText();
        Assert.assertEquals(al, "Tên đăng nhập không được chứa kí tự đặc biệt");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        setUpMethod();

        driver.findElement(By.id("loginname")).sendKeys("thephong1412");
        driver.findElement(By.id("loginpassword")).sendKeys("12345");
        Thread.sleep(2000);

        driver.findElement(By.id("signinCreate")).click();
        WebElement lberror = driver.findElement(By.id("thongbao"));
        Assert.assertEquals(lberror.getText(), "SAI THÔNG TIN ĐĂNG NHẬP!!!");

        setUpMethod();

        driver.findElement(By.id("loginname")).sendKeys("thephong1412");
        driver.findElement(By.id("signinCreate")).click();
        al = driver.switchTo().alert().getText();
        Assert.assertEquals(al, "Password không được để trống");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        setUpMethod();

        driver.findElement(By.id("signinCreate")).click();
        al = driver.switchTo().alert().getText();
        Assert.assertEquals(al, "Tên đăng nhập không được để trống");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        setUpMethod();
    }

    @Test
    public static void check_LoginForm_success() throws InterruptedException, Exception {
        driver.findElement(By.id("loginname")).sendKeys("thephong1412");
        driver.findElement(By.id("loginpassword")).sendKeys("123456");
        driver.findElement(By.id("signinCreate")).click();

        Thread.sleep(1000);
        //driver.quit();

    }


    public static void LoginClientAndToPage(String url) throws InterruptedException, Exception {
        setUpClass();
        check_LoginForm_success();
        driver.navigate().to(url);

    }
}
