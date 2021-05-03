/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

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
import static testproject.DangKy.*;
import static testproject.DangNhap.*;

public class GioHang {
    
// Chưa đăng nhập mà đã test
    @BeforeClass
    //Chạy trước method test đầu tiên trong class hiện tại
    public static void setUpClass() throws Exception {
        // thiết lặp các đối tượng mặc định;

        System.out.println("Start");
        System.setProperty("webdriver.chrome.driver", "test\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.get("http://localhost/web2general/cart.php");
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(800, 600));
//        driver.manage().window().fullscreen();
    }
    @Test
    public static void check_chuaDangNhap() throws InterruptedException, Exception {
//        thiện viết gì viết ở đây nha, cái phần dưới là t viết rồi , 
//        cái dưới là sau khi đăng nhập , trong đây là chưa có đăng nhập , 
//        giỏ hàng này t ko có viết nữa, nên m xem t có viết thiếu gì hay say gì 
//        tự sửa nha , 


    }

    
    
    

// Đăng nhập rồi mới test
//    @Test
//    public static void check() throws InterruptedException, Exception {
//
//        LoginClientAndToPage("http://localhost/web2general/cart.php");
//
//    }
//
//    @Test
//    public void check_GioHang_trong() throws InterruptedException, Exception {
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/input")).click();
//        String al = driver.switchTo().alert().getText();
//        Assert.assertEquals(al, "Chưa có sản phẩm trong giỏ hàng");
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//
//    }
//
//    @Test
//    public void check_GioHang() throws InterruptedException, Exception {
//        driver.navigate().to("http://localhost/web2general/index.php");
//        driver.manage().window().fullscreen();
//
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[1]/a[1]/img")).click();
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
//        driver.navigate().to("http://localhost/web2general/cart.php");
//        WebElement element = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span"));
//        Assert.assertEquals(element.getText(), "1");
//
//    }

}
