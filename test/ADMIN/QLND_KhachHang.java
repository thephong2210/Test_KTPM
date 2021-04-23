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
import java.util.Iterator;
import java.util.Set;
import static testproject.DangKy.driver;
import testproject.ReadCellExample;

public class QLND_KhachHang {

    String filepath = "exel\\Customer.xlsx";
    ReadCellExample rc = new ReadCellExample();
    String addcustomer = "http://localhost:8080/web2general/admin/pages/customeradd.php";
    String error;
    WebElement name, mail, accountname, pass, confirmpass, buttonadd;
    String customer = "http://localhost:8080/web2general/admin/pages/customerlist.php";

    @Test
    public static void check() throws InterruptedException, Exception {

        LoginAdminAndToPage("http://localhost:8080/web2general/admin/pages/customerlist.php");
    }

    @Test
    public void check_Customer() throws InterruptedException, Exception {
        driver.navigate().to(addcustomer);//chuyển tiếp đến trang thêm khách hàng
        driver.manage().window().fullscreen();
        AddCustomer_Empty();
        AddCustomer_Fail();
        AddCustomer();
        driver.navigate().to(customer);
        BlockCustomer();
        BlockCustomer();
        EditCustomer_Empty();
        EditCustomer_Fail();
        EditCustomer();
    }

    public void AddCustomer_Empty() throws InterruptedException, Exception {
        name = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        pass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));

        //Bỏ trống toàn bộ
        buttonadd.click();
        error = name.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");
        Thread.sleep(500);

        //Nhập tên
        name.sendKeys(rc.ReadCellData(6, 0, filepath));
        buttonadd.click();
        error = mail.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");
        Thread.sleep(500);

        //Nhập thêm mail
        mail.sendKeys(rc.ReadCellData(6, 1, filepath));
        buttonadd.click();
        error = pass.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");
        Thread.sleep(500);

        //Nhập pass
        pass.sendKeys(rc.ReadCellData(6, 6, filepath));
        buttonadd.click();
        error = confirmpass.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please fill out this field.");
        setUpMethod();
        
    }

    public void AddCustomer_Fail() throws InterruptedException, Exception {
        name = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        pass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
//TH1: Sai định dạng mail
        //Họ tên
        name.sendKeys(rc.ReadCellData(2, 0, filepath));
        //Email
        mail.sendKeys(rc.ReadCellData(2, 1, filepath));
       //Tên đăng nhập
        accountname.sendKeys(rc.ReadCellData(2, 5, filepath));
        //Mật khẩu
        pass.sendKeys(rc.ReadCellData(2, 6, filepath));
        //Nhập lại mật khẩu
        confirmpass.sendKeys(rc.ReadCellData(2, 7, filepath));
        //Click button
        buttonadd.click();
        error = mail.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please include an '@' in the email address. '" + rc.ReadCellData(2, 1, filepath) + "' is missing an '@'.");
        setUpMethod();

        //TH2: Pass k khớp
        name = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        pass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));

        //Họ tên
        name.sendKeys(rc.ReadCellData(1, 0, filepath));
        //Email
        mail.sendKeys(rc.ReadCellData(1, 1, filepath));
        //Tên đăng nhập
        accountname.sendKeys(rc.ReadCellData(1, 5, filepath));
        //Mật khẩu
        pass.sendKeys(rc.ReadCellData(1, 6, filepath));
        //Nhập lại mật khẩu
        confirmpass.sendKeys(rc.ReadCellData(1, 7, filepath));
        //Click button
        buttonadd.click();
        error = driver.switchTo().alert().getText();
        Assert.assertEquals(error, "Mật khẩu không giống nhau! Mời nhập lại!");
        driver.switchTo().alert().accept();
        setUpMethod();
    }

    public void AddCustomer() throws InterruptedException, Exception {
        name = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));
        mail = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));
        accountname = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));
        pass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));
        confirmpass = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));
        buttonadd = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
//Họ tên
        name.sendKeys(rc.ReadCellData(6, 0, filepath));
        //Email
        mail.sendKeys(rc.ReadCellData(6, 1, filepath));
        //Tên đăng nhập
        accountname.sendKeys(rc.ReadCellData(6, 5, filepath));
        //Mật khẩu
        pass.sendKeys(rc.ReadCellData(6, 6, filepath));
        //Nhập lại mật khẩu
        confirmpass.sendKeys(rc.ReadCellData(6, 7, filepath));
        //Click button
        buttonadd.click();
    }

    public void BlockCustomer() throws InterruptedException, Exception {

        String state = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div[1]")).getText();

        driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[6]/a[2]/button")).click();
        error = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div[1]")).getText();
        if (state == "Hoạt động") {
            Assert.assertEquals(error, "Khóa người dùng thành công!");
        } else if (state == "Khóa") {
            Assert.assertEquals(error, "Mở khóa người dùng thành công!");
        }
        setUpMethod();
    }

    public void EditCustomer_Empty() throws InterruptedException, Exception {
        String parent = driver.getWindowHandle();// It will return the parent window name as a String
        driver.findElement(By.xpath("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[6]/a[1]/button")).click();
        Set<String> s = driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()) {

            String child_window = I1.next();

            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);

                WebElement nameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));//Họ tên
                WebElement mailedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));//Email
                WebElement accountnameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));//Tên đăng nhập
                WebElement passedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));//Mật khẩu
                WebElement confirmpassedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));//Nhập lại mật khẩu
                WebElement buttonedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
                nameedit.clear();
                mailedit.clear();
                accountnameedit.clear();
                passedit.clear();
                confirmpassedit.clear();
                buttonedit.click();
                error = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div")).getText();
                Assert.assertEquals(error, "Không được để trống!");
                Thread.sleep(1000);
            }
        }
    }

    public void EditCustomer_Fail() throws InterruptedException, Exception {

        //TH1: email sai định dạng
        WebElement nameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));//Họ tên
        WebElement buttonedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));

        nameedit.clear();
        nameedit.sendKeys(rc.ReadCellData(2, 0, filepath));
        WebElement mailedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));//Email
        mailedit.clear();
        mailedit.sendKeys(rc.ReadCellData(2, 1, filepath));
        buttonedit.click();
        error = mailedit.getAttribute("validationMessage");
        Assert.assertEquals(error, "Please include an '@' in the email address. '" + rc.ReadCellData(2, 1, filepath) + "' is missing an '@'.");
        Thread.sleep(1000);
        
        mailedit.clear();
        mailedit.sendKeys(rc.ReadCellData(1, 1, filepath));
        WebElement accountnameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));//Tên đăng nhập
        accountnameedit.clear();
        accountnameedit.sendKeys(rc.ReadCellData(2, 5, filepath));
        WebElement passedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));//Mật khẩu
        passedit.clear();
        passedit.sendKeys(rc.ReadCellData(1, 6, filepath));
        WebElement confirmpassedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));//Nhập lại mật khẩu
        confirmpassedit.clear();
        confirmpassedit.sendKeys(rc.ReadCellData(1, 7, filepath));
        buttonedit.click();
        error = driver.switchTo().alert().getText();
        Assert.assertEquals(error, "Mật khẩu không giống nhau! Mời nhập lại!");
        driver.switchTo().alert().accept();

        setUpMethod();

        //TH2: Pass k khớp
//        nameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));//Họ tên
//        mailedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));//Email
//        phonenumedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));//Số điện thoại
//        addressedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input")); //Địa chỉ
//        deliveryaddressedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));//Địa chỉ giao hàng
//        accountnameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input"));//Tên đăng nhập
//        passedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input"));//Mật khẩu
//        confirmpassedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[8]/td[2]/input"));//Nhập lại mật khẩu
//        buttonedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
    }

    public void EditCustomer() throws Exception {
        WebElement nameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input"));//Họ tên
        WebElement mailedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input"));//Email
        WebElement accountnameedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input"));//Tên đăng nhập
        WebElement passedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input"));//Mật khẩu
        WebElement confirmpassedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input"));//Nhập lại mật khẩu
        WebElement buttonedit = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input"));
        nameedit.clear();
        nameedit.sendKeys(rc.ReadCellData(6, 0, filepath));
        mailedit.clear();
        mailedit.sendKeys(rc.ReadCellData(6, 1, filepath));
        accountnameedit.clear();
        accountnameedit.sendKeys(rc.ReadCellData(6, 5, filepath));
        passedit.clear();
        passedit.sendKeys(rc.ReadCellData(6, 6, filepath));
        confirmpassedit.clear();
        confirmpassedit.sendKeys(rc.ReadCellData(6, 7, filepath));
        buttonedit.click();
        Thread.sleep(1000);
        driver.close();
    }

    public void setUpMethod() throws Exception {
        Thread.sleep(1500);
        driver.navigate().refresh();
        driver.manage().window().fullscreen();

    }

}
