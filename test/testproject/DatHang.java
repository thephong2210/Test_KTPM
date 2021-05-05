/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static testproject.DangKy.driver;
import static testproject.DangNhap.LoginClientAndToPage;

/**
 *
 * @author Asus
 */
public class DatHang {

    public DatHang() {
    }
    int cartnum, selectednum, testcartnum, checkcartnum,price,amount,cash,totalcash;
    String testname, testprice;
    String checkname, checkprice;

    @Test
    public static void check() throws InterruptedException, Exception {
        LoginClientAndToPage("http://localhost:8080/web2general/");
    }

    @Test
    public void checkDatHang() throws InterruptedException, Exception {
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=64");
        CheckChonHang();
//        CheckChonHang_2();
    }

    public void CheckChonHang() throws InterruptedException, Exception {
        cartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số trc khi bấm chọn,đang là 0
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=64");
        testname= driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        //Giá trị trên web mặc định là 0 nên phải nhập số lượng muốn chọn vào
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();//Bấm + ==> 2
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
        testcartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số sau khi bấm
        checkcartnum = cartnum + 3;
        Assert.assertEquals(testcartnum, checkcartnum);
        driver.navigate().to("http://localhost:8080/web2general/cart.php");
        checkname = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[2]/p/a")).getText();
        checkname=checkname.toUpperCase();
        checkprice = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText();
        System.out.println(testname);
        System.out.println(checkname);
        Assert.assertEquals(checkname, testname);
        Assert.assertEquals(checkprice, testprice);
        price = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText());
        amount= Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[5]/input")).getText());
        cash= Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[7]/span")).getText());
        Assert.assertEquals(price*amount, cash);
    }

    public void CheckChonHang_2() throws InterruptedException, Exception {
        cartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số trc khi bấm chọn,đang là 0
        driver.navigate().to("http://localhost:8080/web2general/single-product.php?maSanPham=5");
        //Giá trị trên web mặc định là 0 nên phải nhập số lượng muốn chọn vào
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();//Bấm + ==> 2
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
        testcartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số sau khi bấm
        checkcartnum = cartnum + 3;
        Assert.assertEquals(testcartnum, checkcartnum);
    }
}
