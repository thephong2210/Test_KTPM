/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static testproject.DangKy.driver;
import static testproject.DangNhap.LoginClientAndToPage;

/**
 *
 * @author Asus
 */
public class XemHang {
    public XemHang(){}
    String testname,testprice;
    String checkname,checkprice;
    String testbrandname,brandname;
    WebElement product;
    
    @Test
    public static void check() throws InterruptedException, Exception {
        LoginClientAndToPage("http://localhost/web2general/");
    }
    @Test
    public void checkXemHang() throws InterruptedException, Exception{
        checkProduct();
        checkProduct2();
        checkProduct3();
        checkProduct4();
        //---------- Check brandname
        checkBrand();
        checkBrand2();
        checkBrand3();
        checkBrand4();
    }
    //Sản phẩm mới
    public void checkProduct()throws InterruptedException, Exception{
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/span")).getText();
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=64");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
        Thread.sleep(1000);
    }
    // Sản phẩm KM
    public void checkProduct2()throws InterruptedException, Exception{
        driver.navigate().to("http://localhost/web2general/");
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/a")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/span")).getText();
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=0");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
        Thread.sleep(1000);
    }
    //Sản phẩm nổi bật
    public void checkProduct3()throws InterruptedException, Exception{
        driver.navigate().to("http://localhost/web2general/");
//        driver.findElement(By.xpath("/html/body/section[2]/div/div[4]/div/div[2]/div/div/div[2]/div/div[1]/i")).click();//click mũi tên <-
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[4]/div/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/a/span")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[4]/div/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/div[2]/span")).getText();
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=5");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
        Thread.sleep(1000);
    }
    //Sản phẩm Nike
    public void checkProduct4()throws InterruptedException, Exception{
        driver.navigate().to("http://localhost/web2general/");
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[6]/div[1]/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/a/span")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[6]/div[1]/div[2]/div/div/div[1]/div/div[4]/div/div/div[2]/div[2]/span")).getText();
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=32");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice);
        Thread.sleep(1000);
    }
    //---------------------------------------------------------------------------
    //Check BRANDNAME
    public void checkBrand() throws InterruptedException, Exception{
        driver.navigate().to("http://localhost/web2general/index.php");
        brandname = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/nav/ul/li[2]/a")).getText();
        driver.navigate().to("http://localhost/web2general/shop-gird.php?maLoai=2");
        testbrandname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[2]/h1/span[1]")).getText();
        Assert.assertEquals(testbrandname,brandname); 
        Thread.sleep(1000);
    }
    public void checkBrand2() throws InterruptedException, Exception{
        driver.navigate().to("http://localhost/web2general/index.php");
        brandname = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/nav/ul/li[3]/a")).getText();
        driver.navigate().to("http://localhost/web2general/shop-gird.php?maLoai=3");
        testbrandname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[2]/h1/span[1]")).getText();
        Assert.assertEquals(testbrandname,brandname); 
        Thread.sleep(1000);
    }
    public void checkBrand3() throws InterruptedException, Exception{
        driver.navigate().to("http://localhost/web2general/index.php");
        brandname = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/nav/ul/li[4]/a")).getText();
        driver.navigate().to("http://localhost/web2general/shop-gird.php?maLoai=4");
        testbrandname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[2]/h1/span[1]")).getText();
        Assert.assertEquals(testbrandname,brandname); 
        Thread.sleep(1000);
    }
    public void checkBrand4() throws InterruptedException, Exception{
        driver.navigate().to("http://localhost/web2general/index.php");
        brandname = driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/nav/ul/li[5]/a")).getText();
        driver.navigate().to("http://localhost/web2general/shop-gird.php?maLoai=6");
        testbrandname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[2]/h1/span[1]")).getText();
        Assert.assertEquals(testbrandname,brandname); 
        Thread.sleep(1000);
    }
    
}
