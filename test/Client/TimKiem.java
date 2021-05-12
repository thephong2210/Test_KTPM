/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static Client.DangKy.driver;
import static Client.DangNhap.LoginClientAndToPage;
/**
 *
 * @author ACER
 */
@Test
public class TimKiem {
    public void TimKiemSanPham() throws InterruptedException, Exception{
        LoginClientAndToPage("http://localhost/web2general/");
        Thread.sleep(3000);
        
        //tìm kiếm để trống
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]")).sendKeys("");
        driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
        WebElement lblerror = driver.findElement(By.xpath("/html/body/section[2]/div/h2"));
        Assert.assertEquals(lblerror.getText(), "Không tìm thấy trang bạn yêu cầu!");
        setUpMethod();

        //tìm kiếm không có trong csdl
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
        String errrorr = driver.switchTo().alert().getText();
        Assert.assertEquals(errrorr,"Không tìm thấy dữ liệu!");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        setUpMethod();

        //tìm kiếm có trong csdl
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]")).sendKeys("Nike");
        driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
        setUpMethod();

        driver.manage().window().fullscreen();
    } 
    
    public void setUpMethod() throws Exception{
        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]")).clear();
    }
    
}
