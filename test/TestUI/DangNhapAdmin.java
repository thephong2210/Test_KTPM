/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

/**
 *
 * @author theph
 */
import ADMIN.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.junit.Assert;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import testproject.ReadCellExample;
import static testproject.DangKy.driver;

public class DangNhapAdmin {

    @BeforeClass
    //Chạy trước method test đầu tiên trong class hiện tại
    public static void setUpClass() throws Exception {
        // thiết lặp các đối tượng mặc định;

        System.out.println("Start");
        System.setProperty("webdriver.chrome.driver", "test\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.get("http://localhost/web2general/admin");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(800, 600));
        //driver.manage().window().fullscreen();
    }

    public static void check_LoginForm_success() throws InterruptedException, Exception {
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/fieldset/div[1]/input")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/fieldset/div[2]/input")).sendKeys("admin");
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/form/fieldset/input")).click();
        
        Thread.sleep(1000);
    }

    public static void setUpMethod() throws Exception {
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().fullscreen();
    }

    // Nhâp url các trang trong admin để được 1 vé đi mũi né nha =)))
    public static void LoginAdminAndToPage(String url) throws InterruptedException, Exception {
        setUpClass();
        check_LoginForm_success();
        driver.navigate().to(url);

    }
}
