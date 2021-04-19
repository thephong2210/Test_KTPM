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
import java.util.HashSet;

public class QLHD_DonHang {

    @Test
<<<<<<< HEAD
    public static void check_donhang() throws InterruptedException, Exception {
        ClickURL("http://localhost/web2general/admin/pages/orders.php");
        //tìm kiếm theo mã đơn hàng
        //khi không nhập ký tự
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã đơn hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm khi nhập thông tin nằm trong cơ sở dữ liệu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã đơn hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("19");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm khi nhập thông tin không nằm trong cở sở dữ liệu( hoặc tìm kiếm có nhập ký tự đặc biệt)
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã đơn hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("20");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        String errrorr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!" );
        Thread.sleep(2000); 
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        
        //tìm kiếm theo mã khách hàng
        //khi không nhập ký tự
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã khách hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm mã khách hàng khi nhập thông tin nằm trong cơ sở dữ liệu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã khách hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("9");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm khi nhập thông tin không nằm trong cở sở dữ liệu( hoặc tìm kiếm có nhập ký tự đặc biệt)
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Mã khách hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("15");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!" );
        Thread.sleep(2000); 
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
=======
    public static void check() throws InterruptedException, Exception {

        LoginAdminAndToPage("http://localhost/web2general/admin/pages/orders.php");
>>>>>>> aaf1b3bfe3308cf547a4d4b32bfe7e722831514c

        //tìm kiếm theo trạng thái
        //khi không nhập ký tự
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Trạng thái");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm trạng thái "Chưa giao"
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Trạng thái");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("Chưa giao");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm trạng thái "Đã hoàn thành"
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Trạng thái");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("đã hoàn thành");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm trạng thái khi nhập dữ liệu không có trong csdl
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Trạng thái");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("#$%%$%");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!" );
        Thread.sleep(2000); 
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        
        //tìm kiếm theo ngày lập đơn hàng
        //khi không nhập ký tự nào
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Ngày lập đơn hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //khi nhập đúng định dạng ngày và nằm trong csdl
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Ngày lập đơn hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("2020-11");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Thread.sleep(3000);
        
        //tìm kiếm sai định dạng hoặc những thứ không nằm trong cơ sở dữ liệu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).sendKeys("Ngày lập đơn hàng");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).sendKeys("2020-11-11-11-11");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]")).click();
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!" );
        Thread.sleep(2000); 
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        
        //click hiện tất cả
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]")).clear();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/a/input")).click();
        
        //click hiện lọc
        //khi không nhập vào ngày tháng
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]")).click();
        Thread.sleep(3000);
        
        //khi nhập đúng định dạng nằm trong csdl để trả về kết quả đúng
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("2020-09-16");
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("2020-12-02");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]")).click();
        Thread.sleep(3000);
        
        //khi nhập sai định trạng sẽ không trả về kết quả
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).sendKeys("2020-09-16");
        driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).sendKeys("2020-12-02");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]")).click();
        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr/td"));
        Assert.assertEquals(lblerror.getText(), "No data available in table");
        Thread.sleep(2000);
        
        
    }
    @Test
    public static void check_thongtin() throws InterruptedException, Exception {
        driver.navigate().to("http://localhost/web2general/admin/pages/chitietdonhang.php?maDonHang=12");
        //ClickURL("http://localhost/web2general/admin/pages/orders.php");
    }
}
