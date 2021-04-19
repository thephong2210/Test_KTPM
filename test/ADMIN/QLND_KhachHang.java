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

public class QLND_KhachHang {
    String filepath = "exel\\Customer.xlsx";
    ReadCellExample rc = new ReadCellExample();
    String addcustomer = "http://localhost:8080/web2general/admin/pages/customeradd.php";
    String check ;
    @Test
    public static void check() throws InterruptedException, Exception {

        LoginAdminAndToPage("http://localhost:8080/web2general/admin/pages/customerlist.php");
        
    }
    @Test
    public void check_Customer() throws Exception{
        driver.navigate().to(addcustomer);//chuyển tiếp đến trang thêm khách hàng
        driver.manage().window().fullscreen();
        check_AddCustomerFail();
        setUpMethod();
        check_AddCustomerSuccess();
        Thread.sleep(3000);
        driver.close();
    }
    public void check_AddCustomerFail() throws Exception{
        //Họ tên
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys(rc.ReadCellData(1, 0, filepath));
        //Email
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys(rc.ReadCellData(1, 1, filepath));
        //Số điện thoại
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys(rc.ReadCellData(1, 2, filepath));
        //Địa chỉ
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys(rc.ReadCellData(1, 3, filepath));
        //Địa chỉ giao hàng
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys(rc.ReadCellData(1, 4, filepath));
        //Tên đăng nhập
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys(rc.ReadCellData(1, 5, filepath));
        //Mật khẩu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys(rc.ReadCellData(1, 6, filepath));
        //Nhập lại mật khẩu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys(rc.ReadCellData(1, 7, filepath));
        //Click button
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
        //Check
        check = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).getAttribute("validationMessage");
        
        
    }
    public void check_AddCustomerSuccess() throws Exception{
        //Họ tên   //Họ tên
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys(rc.ReadCellData(6, 0, filepath));
        //Email
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys(rc.ReadCellData(6, 1, filepath));
        //Số điện thoại
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input")).sendKeys(rc.ReadCellData(6, 2, filepath));
        //Địa chỉ
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")).sendKeys(rc.ReadCellData(6, 3, filepath));
        //Địa chỉ giao hàng
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input")).sendKeys(rc.ReadCellData(6, 4, filepath));
        //Tên đăng nhập
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input")).sendKeys(rc.ReadCellData(6, 5, filepath));
        //Mật khẩu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input")).sendKeys(rc.ReadCellData(6, 6, filepath));
        //Nhập lại mật khẩu
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys(rc.ReadCellData(6, 7, filepath));
        //Click button
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
    }
     public void setUpMethod() throws Exception {
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().fullscreen();

    }
    

}
