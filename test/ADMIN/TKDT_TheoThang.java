/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

/**
 *
 * @author theph
 */
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
import static Client.DangKy.driver;
import static ADMIN.DangNhapAdmin.*;

public class TKDT_TheoThang {

    @Test
    public static void check() throws InterruptedException, Exception {

        LoginAdminAndToPage("http://localhost/web2general/admin/pages/statistical_months.php");
        Thread.sleep(3000);
        
        //tìm kiếm từ ngày đến ngày
        // khi không nhập ký tự nào --> Hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input[3]")).click();
        Thread.sleep(3000);
        
        //khi nhập không đúng định dạng hoặc nhập sai ngày ví dụ 30/2/2021 --> Không hiện gì cả
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("2022");
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("2023");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input[3]")).click();
        Thread.sleep(3000);
        
        //khi nhập đúng thời gian có trong cơ sở dữ liệu --> Hiện danh sách đúng
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("2020-04-16");
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("2020-11-20");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input[3]")).click();
        Thread.sleep(3000);
        
        //nhấn Hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input")).click();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
    }
    public void setUpMethod() throws Exception {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }
}
