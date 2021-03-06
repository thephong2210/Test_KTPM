package Client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.concurrent.TimeUnit;
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
import testproject.ReadCellExample;

/**
 *
 * @author admin
 */
public class DangKy {

    public static WebDriver driver;
    String filepath = "exel\\TestcaseSignUp.xlsx";
     
    public DangKy() {
    }
    ReadCellExample rc = new ReadCellExample();

    @BeforeClass
    //Chạy trước method test đầu tiên trong class hiện tại
    public static void setUpClass() throws Exception {
        // thiết lặp các đối tượng mặc định;

        System.out.println("Start");
        System.setProperty("webdriver.chrome.driver", "test\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.get("http://localhost/web2general/checkout-registration.php");
        //driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(800, 600));
        driver.manage().window().fullscreen();
    }

   
    //@Test

    public void check_singupForm_fail() throws InterruptedException, Exception {
// Nhập thấp hơn kí tự tối thiểu         

//        WebElement txt_username = driver.findElement(By.id("hoTen_input"));
        driver.findElement(By.id("hoTen_input")).sendKeys(rc.ReadCellData(2, 2, filepath));
        driver.findElement(By.id("email_input")).sendKeys(rc.ReadCellData(2, 3, filepath));
        driver.findElement(By.name("ngaySinh_input")).sendKeys(rc.ReadCellData(2, 4, filepath));
        driver.findElement(By.id("firstname")).sendKeys(rc.ReadCellData(2, 0, filepath));
        driver.findElement(By.id("matKhau_input")).sendKeys(rc.ReadCellData(2, 1, filepath));
        driver.findElement(By.id("nhapLaiMatKhau_input")).sendKeys(rc.ReadCellData(2, 1, filepath));
        driver.findElement(By.id("SubmitCreate")).click();

        WebElement lblerror = driver.findElement(By.xpath("//*[@id=\"hoTen_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Họ Tên Tối Thiểu 6 Kí Tự");

        lblerror = driver.findElement(By.xpath("//*[@id=\"email_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Vui Lòng Nhập Đúng Định Dạng Email");

        lblerror = driver.findElement(By.xpath("//*[@id=\"firstname-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Tên Tài Khoản Tối Thiểu 6 Kí Tự");

        lblerror = driver.findElement(By.xpath("//*[@id=\"matKhau_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Mật Khẩu Tối Thiểu 6 Kí Tự");

        lblerror = driver.findElement(By.xpath("//*[@id=\"nhapLaiMatKhau_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Mật Khẩu Tối Thiểu 6 Kí Tự");

        setUpMethod();

// để trống không nhập gì cả 
        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);
        lblerror = driver.findElement(By.xpath("//*[@id=\"hoTen_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Vui Lòng Nhập Họ Tên");

        lblerror = driver.findElement(By.xpath("//*[@id=\"email_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Vui Lòng Nhập Email");

        lblerror = driver.findElement(By.xpath("//*[@id=\"ngaySinh_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Vui Lòng Chọn Ngày Sinh");

        lblerror = driver.findElement(By.xpath("//*[@id=\"firstname-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Vui Lòng Nhập Tên Tài Khoản");

        lblerror = driver.findElement(By.xpath("//*[@id=\"matKhau_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Vui Lòng Nhập Mật Khẩu");

        lblerror = driver.findElement(By.xpath("//*[@id=\"nhapLaiMatKhau_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Vui Lòng Nhập Lại Mật Khẩu");
         setUpMethod();
        
//        Nhập quá kí tự cho phép 
        driver.findElement(By.id("hoTen_input")).sendKeys(rc.ReadCellData(5, 2, filepath));
        driver.findElement(By.id("email_input")).sendKeys(rc.ReadCellData(5, 3, filepath));
        driver.findElement(By.name("ngaySinh_input")).sendKeys(rc.ReadCellData(5, 4, filepath));
        driver.findElement(By.id("firstname")).sendKeys(rc.ReadCellData(5, 0, filepath));
        driver.findElement(By.id("matKhau_input")).sendKeys(rc.ReadCellData(5, 1, filepath));
        driver.findElement(By.id("nhapLaiMatKhau_input")).sendKeys(rc.ReadCellData(5, 1, filepath));
        driver.findElement(By.id("SubmitCreate")).click();
        lblerror = driver.findElement(By.xpath("//*[@id=\"hoTen_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Họ Tên Tối Đa 20 Kí Tự");

        lblerror = driver.findElement(By.xpath("//*[@id=\"email_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Email Tối Đa 50 Kí Tự");

        lblerror = driver.findElement(By.xpath("//*[@id=\"firstname-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Tên Tài Khoản Tối Đa 20 Kí Tự");

        lblerror = driver.findElement(By.xpath("//*[@id=\"matKhau_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Mật Khẩu Tối Đa 15 Kí Tự");

        lblerror = driver.findElement(By.xpath("//*[@id=\"nhapLaiMatKhau_input-error\"]"));
        Assert.assertEquals(lblerror.getText(), "Mật Khẩu Tối Đa 15 Kí Tự");
        
        setUpMethod();

        
    }


    @Test
    // kiểm tra đăng nhập thành công.
   public void check_singupForm_success() throws InterruptedException, Exception {
        
        driver.findElement(By.id("hoTen_input")).sendKeys(rc.ReadCellData(1, 2, filepath));
        driver.findElement(By.id("email_input")).sendKeys(rc.ReadCellData(1, 3, filepath));
        driver.findElement(By.name("ngaySinh_input")).sendKeys(rc.ReadCellData(1, 4, filepath));
        driver.findElement(By.id("firstname")).sendKeys(rc.ReadCellData(1, 0, filepath));
        driver.findElement(By.id("matKhau_input")).sendKeys(rc.ReadCellData(1, 1, filepath));
        driver.findElement(By.id("nhapLaiMatKhau_input")).sendKeys(rc.ReadCellData(1, 1, filepath));
        driver.findElement(By.id("SubmitCreate")).click();
        
        
//        Thread.sleep(5000);
//        tearDownMethod();

    }
//     @Test
//     public void checkcolor()
//     {
//        
//        String buttonColor = driver.findElement(By.name("submit")).getCssValue("background-color");
//        String buttonTextColor = driver.findElement(By.name("submit")).getCssValue("color");
//        System.out.println("Button color: " + buttonColor);
//        System.out.println("Text color " + buttonTextColor);
//     }
//    @BeforeMethod
////    //Chạy trước mỗi method test
////    // cài đặt reset để tránh làm nhiễu các testcase
       public static void setUpMethod() throws Exception {
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
    }


    @AfterClass
    //Chạy trước tất cả method test trong class hiện tại
    public static void tearDownClass() throws Exception {

    }

//    @AfterMethod
    //Chạy sau mỗi method test
    // sử dụng cài đặt xử lỹ lỗi
    public void tearDownMethod() throws Exception {
        //giải phóng vùng nhớ sau khi xong. thường các kết nối đến database vì đối tượng đã được java giải phóng
        driver.quit();
        System.out.println("End");

    }
}
