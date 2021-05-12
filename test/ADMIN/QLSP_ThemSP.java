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
import static java.awt.PageAttributes.MediaType.C;
import java.util.Set;

public class QLSP_ThemSP {
    String error="";

    // để trống tên sản phẩm khi thêm
    @Test
    public static void Add_Product() throws InterruptedException, Exception{
        // để trống tên sản phẩm khi thêm
        LoginAdminAndToPage("http://localhost/web2general/admin/pages/productadd.php");
        String errorr =  driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).getAttribute("validationMessage");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
        // lấy đoạn thông báo từ cái thằng input tên sản phẩm
//        Assert.assertEquals(errorr, "Please fill out this field.");
//        Thread.sleep(2000);
//        setUpMethod();
//        
//        //để trống số lượng sản phẩm khi thêm
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Giầy");
//        String error =  driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).getAttribute("validationMessage");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
//        // lấy đoạn thông báo từ cái thằng input số lượng
//        Assert.assertEquals(error, "Please fill out this field.");
//        Thread.sleep(2000);
//        setUpMethod();
//        
//        //để trống miêu tả sản phẩm khi thêm
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Giầy");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("2");
//        String errorrr =  driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea")).getAttribute("validationMessage");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
//        // lấy đoạn thông báo từ cái thằng input miêu tả
//        Assert.assertEquals(errorrr, "Please fill out this field.");
//        Thread.sleep(2000);
//        setUpMethod();
//        
//        //để trống giá sản phẩm khi thêm
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Giầy");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("2");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("nhẹ bền,...");
//        String errorrrr =  driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).getAttribute("validationMessage");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
//        // lấy đoạn thông báo từ cái thằng input giá
//        Assert.assertEquals(errorrrr, "Please fill out this field.");
//        Thread.sleep(2000);
//        setUpMethod();
//        
//        //để trống hình ảnh sản phẩm khi thêm
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Giầy");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("2");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("nhẹ bền,...");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("1500000");
//        String errorrrrr =  driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")).getAttribute("validationMessage");
//        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
        // lấy đoạn thông báo từ cái thằng input hình ảnh
//        Assert.assertEquals(errorrrrr, "Please select a file.");
//        Thread.sleep(2000);
//        setUpMethod();
        
        //không chọn danh mục 
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Giầy");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("nhe ben");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("1500000");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("D:/Projects/NetBeansProjects/KTPM/hinh/balenciaga.jpg");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
        String errrorr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrorr,"Chưa chọn danh mục sản phẩm!" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
        setUpMethod();
        
        //không chọn size sản phẩm
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Giầy");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("nhe ben");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("1500000");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("D:/Projects/NetBeansProjects/KTPM/hinh/balenciaga.jpg");//duong dan file hinh
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/select")).sendKeys("ADIDAS");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
        String errrorrr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrorrr,"Chưa chọn size sản phẩm!" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
        setUpMethod();
        
        //thêm sản phẩm thành công
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Giầy");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("nhe ben");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys("1500000");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys("D:/Projects/NetBeansProjects/KTPM/hinh/balenciaga.jpg");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/select")).sendKeys("ADIDAS");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/select")).sendKeys("37");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div"));
        Assert.assertEquals(lblerror.getText(), "Thêm sản phẩm thành công!");
        Thread.sleep(2000);
        setUpMethod();
        
        
    }
    //@Test
    public static void edit_Product() throws InterruptedException, Exception {
        //sửa sản phẩm khi không nhập tên sản phẩm
        driver.navigate().to("http://localhost/web2general/admin/pages/productedit.php?productid=2");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).clear();
        String error =  driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).getAttribute("validationMessage");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
        Assert.assertEquals(error, "Please fill out this field.");
        Thread.sleep(2000);
        setUpMethod();
        
    }
    //@Test
    public static void Del_product()throws InterruptedException, Exception {
        LoginAdminAndToPage("http://localhost/web2general/admin/pages/product.php?hideid=0");
       // driver.navigate().to("http://localhost/web2general/admin/pages/product.php?hideid=0");
        String errrorrr = driver.switchTo().alert().getText();
        Assert.assertEquals(errrorrr,"Bạn có chắc muốn ẩn sản phẩm này không?" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div[1]"));
        Assert.assertEquals(lblerror.getText(), "Ẩn sản phẩm thành công!");
        Thread.sleep(2000);
        setUpMethod();
        
    }
    
}
