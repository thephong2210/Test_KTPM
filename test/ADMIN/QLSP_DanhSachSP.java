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
import testproject.ReadCellExample;

public class QLSP_DanhSachSP {
    public static WebDriver dri;
    String filepath = "exel\\TestcaseSignUp.xlsx";
    public QLSP_DanhSachSP(){
    }
    ReadCellExample rc = new ReadCellExample();
    @Test
    public void check_search_product() throws InterruptedException, Exception{
        //tìm kiếm khi không nhập ký tự
        ClickURL("http://localhost/web2general/admin/pages/product.php");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]")).getAttribute("validationMessage");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]")).click();
        setUpMethod();
        
        //tìm kiếm khi nhập vào ký tự "Royal"
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]")).sendKeys("Royal");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]")).click();
        setUpMethod();
        
        //tìm kiếm khi nhập vào ký tụ "Rotylllllllllllllllllllll" không có trong csdl
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]")).sendKeys("Royallllllllll");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]")).click();
        setUpMethod();
        
        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/div[1]"));
        Assert.assertEquals(lblerror.getText(), "Không tìm thấy dữ liệu!");
        Thread.sleep(2000);
        
        //chọn hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/a[1]/input")).click();
        setUpMethod();
        
    }
    //@Test
    public static void check() throws InterruptedException, Exception {

        ClickURL("http://localhost/web2general/admin/pages/product.php");

    }

}
