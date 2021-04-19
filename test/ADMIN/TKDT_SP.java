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
import static testproject.DangKy.driver;
import static ADMIN.DangNhapAdmin.*;

public class TKDT_SP {

    @Test
    public void check() throws InterruptedException, Exception {
        LoginAdminAndToPage("http://localhost/web2general/admin/pages/statistical_product.php");
        Thread.sleep(3000);
        
        //Kiểm tra tăng dần --> Sắp xếp SLSP đã bán tăng dần
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[1]")).sendKeys("Số lượng sản phẩm đã bán");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[2]")).sendKeys("Tăng dần");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input")).click();
        setUpMethod();
        
        //Kiểm tra giảm dần --> Sắp xếp SLSP đã bán giảm dần
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[1]")).sendKeys("Số lượng sản phẩm đã bán");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[2]")).sendKeys("Giảm dần");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input")).click();
        setUpMethod();
        
        //Hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input")).click();
        setUpMethod();
        driver.manage().window().fullscreen();
    }
    
    public void setUpMethod() throws Exception {
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

}
