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

public class QLND_QTV {

    public QLND_QTV() {
    }

    String filepath = "exel\\Administrator.xlsx";
    String adduser = "http://localhost:8080/web2general/admin/pages/useradd.php";
    String edituser = "http://localhost:8080/web2general/admin/pages/useredit.php?username=giangthephong";
    String error;
    ReadCellExample rc = new ReadCellExample();
    WebElement name, mail, accountname, password, confirmpass, accounttype, buttonadd;

    @Test
    public static void check() throws InterruptedException, Exception {
        LoginAdminAndToPage("http://localhost:8080/web2general/admin/pages/userlist.php");
    }

//    @Test
    public void check_AddUser() throws InterruptedException, Exception {
        driver.navigate().to(adduser);//Chuyển đến trang thêm admin
        
//        AddUser_Empty();
//        AddUser_Fail();
//        AddUser();
    }

    public void AddUser_Empty() throws InterruptedException, Exception {
        name = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        password = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        accounttype = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
        //Để trống họ tên
//        name.sendKeys("");
//        //Click button
        buttonadd.click();
        error = name.getAttribute(("validationMessage"));
        Assert.assertEquals(error, "Please fill out this field.");
        
        //Để trống Email
        name.sendKeys(rc.ReadCellData(8, 0, filepath));
//        mail.sendKeys("");
        buttonadd.click();
        error = mail.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");

        //Để trống TenDangNhap
        mail.sendKeys(rc.ReadCellData(8, 1, filepath));
        buttonadd.click();
        error = accountname.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");

//        //Để trống MatKhau
        accountname.sendKeys(rc.ReadCellData(8, 2, filepath));
//        password.sendKeys("");
        buttonadd.click();
        error = password.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");

        //Để trống NhapLaiMatKhau
        password.sendKeys(rc.ReadCellData(8, 3, filepath));
//        confirmpass.sendKeys("");
        buttonadd.click();
        error = confirmpass.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");

        //Để trống LoaiTaiKhoan
        confirmpass.sendKeys(rc.ReadCellData(8, 4, filepath));
//        accounttype.sendKeys("");
        buttonadd.click();
        error = driver.switchTo().alert().getText();
        Assert.assertEquals(error, "Chưa chọn loại tài khoản!");
        driver.switchTo().alert().accept();
        setUpMethod();
    }

    public void AddUser_Fail() throws InterruptedException, Exception {
        name=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        password =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        accounttype =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
        //Hoten
        name.sendKeys(rc.ReadCellData(4, 0, filepath));
        //Email
        mail.sendKeys(rc.ReadCellData(4, 1, filepath));
        String mailtest = rc.ReadCellData(4, 1, filepath);
        //TenDangNhap
        accountname.sendKeys(rc.ReadCellData(4, 2, filepath));
        //MatKhau
        password.sendKeys(rc.ReadCellData(4, 3, filepath));
        //NhapLaiMatKhau
        confirmpass.sendKeys(rc.ReadCellData(4, 4, filepath));
        //LoaiTaiKhoan
        accounttype.sendKeys(rc.ReadCellData(4, 5, filepath));
        //Click button
        buttonadd.click();
        
        error=mail.getAttribute("validationMessage");
//        Assert.assertEquals(error, "Please include an '@' in the email address. '" +mailtest+"' is missing an '@'.");// Sai định dạng mail
        setUpMethod();
        //Hoten
        name=driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        password =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        accounttype =driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
        name.sendKeys(rc.ReadCellData(3, 0, filepath));
        //Email
        mail.sendKeys(rc.ReadCellData(3, 1, filepath));
        //TenDangNhap
        accountname.sendKeys(rc.ReadCellData(3, 2, filepath));
        //MatKhau
        password.sendKeys(rc.ReadCellData(3, 3, filepath));
        //NhapLaiMatKhau
        confirmpass.sendKeys(rc.ReadCellData(3, 4, filepath));
        //LoaiTaiKhoan
        accounttype.sendKeys(rc.ReadCellData(3, 5, filepath));
        //Click button
        buttonadd.click();
        error= driver.switchTo().alert().getText();
        Assert.assertEquals(error, "Mật khẩu không giống nhau! Mời nhập lại!");
        driver.switchTo().alert().accept();
        setUpMethod();
    }

    public void AddUser() throws Exception {

        name = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        password = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        accounttype = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/select"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
        //Hoten
        name.sendKeys(rc.ReadCellData(8, 0, filepath));
        //Email
        mail.sendKeys(rc.ReadCellData(8, 1, filepath));
        //TenDangNhap
        accountname.sendKeys(rc.ReadCellData(8, 2, filepath));
        //MatKhau
        password.sendKeys(rc.ReadCellData(8, 3, filepath));
        //NhapLaiMatKhau
        confirmpass.sendKeys(rc.ReadCellData(8, 4, filepath));
        //LoaiTaiKhoan
        accounttype.sendKeys(rc.ReadCellData(8, 5, filepath));
        //Click button
        buttonadd.click();
        
        setUpMethod();
    }
    @Test
    public void checkEditUser() throws Exception{
        driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[7]/a[1]/button")).click();
        driver.getWindowHandle();
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Lâm");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input")).click();
//        setUpMethod();
    }

    public void setUpMethod() throws Exception {
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().fullscreen();
    }

}
