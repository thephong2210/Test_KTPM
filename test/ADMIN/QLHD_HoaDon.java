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


public class QLHD_HoaDon {
    @Test
    public void HoaDon() throws InterruptedException, Exception{
        LoginAdminAndToPage("http://localhost/web2general/admin/pages/hoadonlist.php");
        Thread.sleep(3000);
        
        //tìm kiếm theo mã hóa đơn
        //khi không nhập ký tự --> Hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã hóa đơn");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        setUpMethod();
        
        //tìm kiếm Có trong cơ sở dữ liệu vd"18" --> Hiện danh sách Đúng
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã hóa đơn");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("18");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();     
        setUpMethod();
        
        //tìm kiếm Không có trong csdl vd"19999" hoặc ký tự đặc biệt hoặc blabla --> Hiện Aler "Không tìm thấy dữ liệu"
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã hóa đơn");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("19999");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        String errrorr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!" );
        Thread.sleep(3000); 
        driver.switchTo().alert().accept();
        setUpMethod();
        
        //tìm kiếm theo mã khách hàng
        //khi không nhập ký tự --> Hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã khách hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        setUpMethod();
        
         //tìm kiếm Có trong cơ sở dữ liệu vd"19" --> Hiện danh sách Đúng
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã khách hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("19");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        setUpMethod();
        
        //tìm kiếm Không có trong csdl vd"22222" hoặc ký tự đặc biệt hoặc blabla --> Hiện Aler "Không tìm thấy dữ liệu"
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã khách hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("22222");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        //String errrorrr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!" );
        Thread.sleep(2000); 
        driver.switchTo().alert().accept();
        setUpMethod();
        
        //tìm kiếm theo ngày lập hóa đơn
        
        //tìm kiếm khi không nhập ký tự --> Hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Ngày lập hóa đơn");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        setUpMethod();
        
        //tìm kiếm những đơn hàng Có năm lập hóa đơn là 2021 --> Hiện danh sách Đúng
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Ngày lập hóa đơn");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("2021");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        setUpMethod();
        
        //tìm kiếm Không có trong cơ sở dữ liệu --> Hiện Aler "Không tìm thấy dữ liệu"
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Ngày lập hóa đơn");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("2022");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!" );
        Thread.sleep(2000); 
        driver.switchTo().alert().accept();
        
        //tìm kiếm từ ngày đến ngày
        // khi không nhập ký tự nào --> Hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]")).click();
        
        //khi nhập Không đúng định dạng hoặc nhập Không có trong csdl ví dụ 30/02/2021 --> Hiện Element "No data available in table"
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("2022");
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("2023");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]")).click();
        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr/td"));
        Assert.assertEquals(lblerror.getText(), "No data available in table");
        Thread.sleep(3000);
        
        //khi nhập đúng thời gian có trong cơ sở dữ liệu --> Hiện danh sách Đúng
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("2020-04-16");
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("2020-11-20");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]")).click();
        Thread.sleep(3000);
        
        
        //khi click hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/a/input")).click();
        Thread.sleep(3000);
        
        //click xem chi tiết --> Hiện web site chi tiết
        driver.findElement(By.xpath("//*[@id=\"btnShow\"]")).click();
        //Thread.sleep(2000);
        driver.manage().window().fullscreen();
    }

    //@Test
    public static void check() throws InterruptedException, Exception {

        LoginAdminAndToPage("http://localhost/web2general/admin/pages/hoadonlist.php");

    }
    public void setUpMethod() throws Exception {
        Thread.sleep(3000);
        driver.navigate().refresh();
//        driver.manage().window().fullscreen();
        //clear input TimKiem
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
    }

}
