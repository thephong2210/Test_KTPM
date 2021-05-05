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
    WebElement product;
    
    @Test
    public static void check() throws InterruptedException, Exception {
        LoginClientAndToPage("http://localhost:8080/web2general/");
    }
    @Test
    public void checkXemHang() throws InterruptedException, Exception{
        checkProduct();
        driver.navigate().to("http://localhost:8080/web2general/");
        checkProduct2();
        driver.navigate().to("http://localhost:8080/web2general/");
        checkProduct3();
        driver.navigate().to("http://localhost:8080/web2general/");
        checkProduct4();
        driver.navigate().to("http://localhost:8080/web2general/");
        checkProduct5();
    }
    //Sản phẩm mới
    public void checkProduct()throws InterruptedException, Exception{
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/span")).getText();
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=64");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
    }
    // Sản phẩm KM
    public void checkProduct2()throws InterruptedException, Exception{
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/a")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/span")).getText();
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=64");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
    }
    public void checkProduct3()throws InterruptedException, Exception{
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/span")).getText();
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=64");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
    }
    public void checkProduct4()throws InterruptedException, Exception{
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/span")).getText();
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=64");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
    }
    public void checkProduct5()throws InterruptedException, Exception{
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/span")).getText();
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=64");
        checkname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        checkprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        Assert.assertEquals(testname, checkname);
        Assert.assertEquals(testprice,checkprice); 
    }
    
}
