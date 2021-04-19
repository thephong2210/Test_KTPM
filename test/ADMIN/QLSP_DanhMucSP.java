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

public class QLSP_DanhMucSP {
    public static WebDriver dri;
    String filepath = "exel\\TestcaseSignUp.xlsx";
    public QLSP_DanhMucSP(){
    }
    ReadCellExample rc = new ReadCellExample();
    
    @Test
    public void check_add() throws InterruptedException, Exception  { 
        ClickURL("http://localhost/web2general/admin/pages/category.php");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]")).sendKeys("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"addbtn\"]")).click();
        
        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/div"));
        Assert.assertEquals(lblerror.getText(), "Không được để trống!");
        setUpMethod();
        
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]")).sendKeys("USWE");
        driver.findElement(By.xpath("//*[@id=\"addbtn\"]")).click();

       lblerror = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/div"));
        Assert.assertEquals(lblerror.getText(), "Thêm danh mục thành công!");
        Thread.sleep(2000);

    }
    @Test
    public void check_edit() throws InterruptedException, Exception{ 
        driver.navigate().to("http://localhost/web2general/admin/pages/categoryedit.php?catid=15");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]")).click();
        
//        
        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div"));
        Assert.assertEquals(lblerror.getText(), "Không được để trống!");
        //setUpMethod();
  }
    //@Test    
}
