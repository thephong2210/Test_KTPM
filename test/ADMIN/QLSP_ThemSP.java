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

public class QLSP_ThemSP {

    @Test
    public static void check() throws InterruptedException, Exception {

        LoginAdminAndToPage("http://localhost/web2general/admin/pages/productadd.php");

    }

    @Test
    //Thêm sản phẩm
    public void themSP() throws InterruptedException, Exception {
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("GiàyCuaPhong");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/select")).sendKeys("ADIDAS");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/select")).sendKeys("42");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("oooo");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("1000");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();

    }

}
