package Client;

/**
 *
 * @author theph
 */
import static ADMIN.DangNhapAdmin.setUpClass;
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
import static Client.DangKy.*;
import static Client.DangNhap.*;

public class GioHang {
   
    // đăng nhập rồi
    @Test
    public static void check() throws InterruptedException, Exception {
        LoginClientAndToPage("http://localhost/web2general/index.php");
       
        //click để chọn sản phẩm thêm vào giỏ hàng
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[1]/a/img")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
        Thread.sleep(3000);
        //Lúc này sản phẩm đã đươc thêm vào giỏ hàng, chúng ta tiếp tục đến trang giỏ hàng để thực hiện các bước còn lại
        driver.navigate().to("http://localhost/web2general/cart.php");
        //khi có sản phẩm trong giỏ hàng bắt đầu tiến hành đơn hàng
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/a/input")).click();
        //tiến hành các trường hợp testCaes
        
//        //chỉ chọn thành phố không chọn hoặc nhập vào các phần input khác
        //driver.findElement(By.xpath("//*[@id=\"address_tinh\"]")).sendKeys("Thành phố Hà Nội");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input")).click();
        String errrorrr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrorrr,"Vui lòng chọn địa chỉ giao hàng" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
//        
//        //chọn huyện
        driver.findElement(By.xpath("//*[@id=\"address_tinh\"]")).sendKeys("Thành phố Hà Nội");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Quận Ba Đình");
        driver.findElement(By.xpath("//*[@id=\"deli-address\"]")).sendKeys("Phường Phúc Xá");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input")).click();
        String errror = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errror,"Tên người nhận không được để trống" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
//        
//        //chọn địa chỉ
        driver.findElement(By.xpath("//*[@id=\"address_tinh\"]")).sendKeys("Thành phố Hà Nội");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Quận Ba Đình");
        driver.findElement(By.xpath("//*[@id=\"deli-address\"]")).sendKeys("Phường Phúc Xá");
        driver.findElement(By.xpath("//*[@id=\"diachinh\"]")).sendKeys("273 an dương vương");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input")).click();
        Assert.assertEquals(errror,"Tên người nhận không được để trống" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
        
//        //trường hợp tên người nhận quá ngắn
        driver.findElement(By.xpath("//*[@id=\"address_tinh\"]")).sendKeys("Thành phố Hà Nội");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Quận Ba Đình");
        driver.findElement(By.xpath("//*[@id=\"deli-address\"]")).sendKeys("Phường Phúc Xá");
        driver.findElement(By.xpath("//*[@id=\"diachinh\"]")).sendKeys("273 an dương vương");
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("an");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input")).click();
        String errr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errr,"Tên người nhận không được quá ngắn" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
//        
//        //trường hợp tên người dùng phù hợp nhưng để trống sdt
        driver.findElement(By.xpath("//*[@id=\"address_tinh\"]")).sendKeys("Thành phố Hà Nội");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Quận Ba Đình");
        driver.findElement(By.xpath("//*[@id=\"deli-address\"]")).sendKeys("Phường Phúc Xá");
        driver.findElement(By.xpath("//*[@id=\"diachinh\"]")).sendKeys("273 an dương vương");
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Vương");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input")).click();
        String errrr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrr,"Số điện thoại không được để trống" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
//        
//        //nhập đầy đủ thông tin
        driver.findElement(By.xpath("//*[@id=\"diachinh\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"address_tinh\"]")).sendKeys("Thành phố Hà Nội");
        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Quận Ba Đình");
        driver.findElement(By.xpath("//*[@id=\"deli-address\"]")).sendKeys("Phường Phúc Xá");
        driver.findElement(By.xpath("//*[@id=\"diachinh\"]")).sendKeys("273 an dương vương");
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Vương");
        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("1234567890");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input")).click();
        Thread.sleep(2000);
//        
//        //chọn phương thức vận chuyển
        driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div/div[1]/div[2]/div/div[1]/table/tbody/tr/td[1]/div/span/input")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div/div[1]/div[3]/div/label/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/div/div[2]/a")).click();
        
        //tiến hành đặt hàng
        driver.findElement(By.xpath("/html/body/section[2]/div/form/div[2]/div[4]/div/input")).click();
        String errrrtr = driver.switchTo().alert().getText() ;
        Assert.assertEquals(errrrtr,"Đặt hàng thành công" );
        Thread.sleep(2000); driver.switchTo().alert().accept();
        
        //xem chi tiết đơn hàng khi đã đặt hàng thành công
        //driver.findElement(By.xpath("//*[@id=\"btnShow\"]")).click();
    }
     // Chưa đăng nhập 
    @Test
    public void check_GioHang() throws InterruptedException, Exception {
        driver.navigate().to("http://localhost/web2general/index.php");
        //driver.manage().window().fullscreen();
        //phải đăng xuất ra
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/nav/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[4]/div/ul/form/input")).click();
        Thread.sleep(2000);
        //đăng xuất ra rồi mới tiến hành chọn sp
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[1]/a/img")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();Thread.sleep(2000);
        //chọn sản phẩm xong vào giỏ hàng để mua
        driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a")).click();Thread.sleep(2000);
        //click mua nhưng quên chưa đăng nhập
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/a/input")).click();Thread.sleep(2000);
        // đến lúc đăng nhập rồi
        driver.findElement(By.xpath("//*[@id=\"loginname\"]")).sendKeys("thephong1412");
        driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"signinCreate\"]")).click();Thread.sleep(2000);
        //đăng nhập nhưng không đưa vào trang giỏ hàng đành phải click thêm lần nữa
        driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a")).click();
    }
    
    
//
//    //@Test
//    public void check_GioHang_trong() throws InterruptedException, Exception {
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/input")).click();
//        String al = driver.switchTo().alert().getText();
//        Assert.assertEquals(al, "Chưa có sản phẩm trong giỏ hàng");
//        Thread.sleep(2000);
//        driver.switchTo().alert().accept();
//
//    }
//
//    //@Test
//    public void check_GioHang() throws InterruptedException, Exception {
//        driver.navigate().to("http://localhost/web2general/index.php");
//        driver.manage().window().fullscreen();
//
//        
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[1]/a[1]/img")).click();
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
//        driver.navigate().to("http://localhost/web2general/cart.php");
//        WebElement element= driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span"));
//        Assert.assertEquals(element.getText(), "1");
//        
//    }

}
