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
    int cartnum, selectednum, testcartnum, testamount, checkcartnum, price, amount, cash, totalcash;
    String testname, testprice, tfprice, tfcash, tfamount;
    String checkname, checkprice;
    String error;

    @Test
    public static void check() throws InterruptedException, Exception {
        LoginClientAndToPage("http://localhost/web2general/");
    }

    @Test
    public void checkDatHang() throws InterruptedException, Exception {
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=64");
        CheckChonHang_Fail();
        CheckChonHang();
        CheckChonHang_2();
        CheckChonHang_3();
        checkCashCart();
        driver.quit();
    }

    public void CheckChonHang_Fail() throws InterruptedException, Exception {
        //chọn số lượng đặt =0
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=64");
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[1]")).click();//Bấm -1 xuống 0
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();//Bấm button đặt hàng
        error= driver.switchTo().alert().getText();
        Assert.assertEquals(error, "Số lượng không hợp lệ!");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        //Chọn số lượng đặt > số lượng có sẵn (đang có 7)
        for(int i=0;i<7;i++){
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();//Bấm +1 lên 8
        }
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();//Bấm button đặt hàng
        error= driver.switchTo().alert().getText();
        Assert.assertEquals(error, "Số lượng không hợp lệ!");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.navigate().to("http://localhost/web2general/");
    }
    
    public void CheckChonHang() throws InterruptedException, Exception {
        cartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số trc khi bấm chọn,đang là 0
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=64");
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        //Giá trị trên web mặc định là 0 nên phải nhập số lượng muốn chọn vào
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();//Bấm + ==> 2
//        testamount = Integer.parseInt(driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/input")).getAttribute("Value"));
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
        testcartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số sau khi bấm
        checkcartnum = cartnum + 3;
        Assert.assertEquals(testcartnum, checkcartnum);
        driver.navigate().to("http://localhost/web2general/cart.php");
        checkname = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[2]/p/a")).getText();
        checkname = checkname.toUpperCase();
        checkprice = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText();
        System.out.println(testname);
        System.out.println(checkname);
        Assert.assertEquals(checkname, testname);
        Assert.assertEquals(checkprice, testprice);
        tfprice = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText();
        tfprice = getNum(tfprice);
//        System.out.println(tfprice);
        price = Integer.parseInt(tfprice);
//        System.out.println(price);
        amount = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[5]/input")).getAttribute("Value"));
        System.out.println(amount);
        tfcash = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[7]/span")).getText();
        tfcash = getNum(tfcash);
        cash = Integer.parseInt(tfcash);
        Assert.assertEquals(price * amount, cash);
    }

    public void CheckChonHang_2() throws InterruptedException, Exception {
        cartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số trc khi bấm chọn,đang là 0
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=34");
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        //Giá trị trên web mặc định là 0 nên phải nhập số lượng muốn chọn vào
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();//Bấm + ==> 2
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
        testcartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số sau khi bấm
        checkcartnum = cartnum + 2;
        Assert.assertEquals(testcartnum, checkcartnum);
        driver.navigate().to("http://localhost/web2general/cart.php");
        checkname = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[2]/p/a")).getText();
        checkname = checkname.toUpperCase();
        checkprice = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText();
        System.out.println(testname);
        System.out.println(checkname);
        Assert.assertEquals(checkname, testname);
        Assert.assertEquals(checkprice, testprice);
        tfprice = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText();
        tfprice = getNum(tfprice);
//        System.out.println(tfprice);
        price = Integer.parseInt(tfprice);
//        System.out.println(price);
        amount = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[5]/input")).getAttribute("Value"));
        System.out.println(amount);
        tfcash = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[7]/span")).getText();
        tfcash = getNum(tfcash);
        cash = Integer.parseInt(tfcash);
        Assert.assertEquals(price * amount, cash);
    }

    public void CheckChonHang_3() throws InterruptedException, Exception {
        cartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số trc khi bấm chọn,đang là 0
        driver.navigate().to("http://localhost/web2general/single-product.php?maSanPham=7");
        testname = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2")).getText();
        testprice = driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2")).getText();
        //Giá trị trên web mặc định là 0 nên phải nhập số lượng muốn chọn vào
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/div/div/div[2]")).click();//Bấm + ==> 2
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input")).click();
        testcartnum = Integer.parseInt(driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/a/span")).getText());//lấy số sau khi bấm
        checkcartnum = cartnum + 5;
        Assert.assertEquals(testcartnum, checkcartnum);
        driver.navigate().to("http://localhost/web2general/cart.php");
        checkname = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[2]/p/a")).getText();
        checkname = checkname.toUpperCase();
        checkprice = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText();
        System.out.println(testname);
        System.out.println(checkname);
        Assert.assertEquals(checkname, testname);
        Assert.assertEquals(checkprice, testprice);
        tfprice = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[4]/ul/li")).getText();
        tfprice = getNum(tfprice);
//        System.out.println(tfprice);
        price = Integer.parseInt(tfprice);
//        System.out.println(price);
        amount = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[5]/input")).getAttribute("Value"));
        System.out.println(amount);
        tfcash = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr/td[7]/span")).getText();
        tfcash = getNum(tfcash);
        cash = Integer.parseInt(tfcash);
        Assert.assertEquals(price * amount, cash);

    }

    public void checkCashCart() throws InterruptedException, Exception {
        int cash1, cash2, cash3;
        driver.navigate().to("http://localhost/web2general/cart.php");
        //sp1
        tfcash = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr[1]/td[7]/span")).getText();
        tfcash = getNum(tfcash);
        cash1 = Integer.parseInt(tfcash);
        System.out.println(cash1);
        //sp2
        tfcash = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr[2]/td[7]/span")).getText();
        tfcash = getNum(tfcash);
        cash2 = Integer.parseInt(tfcash);
        System.out.println(cash2);
        //sp3
        tfcash = driver.findElement(By.xpath("//*[@id=\"cart-summary\"]/tbody/tr[3]/td[7]/span")).getText();
        tfcash = getNum(tfcash);
        cash3 = Integer.parseInt(tfcash);
        System.out.println(cash3);
        //total cash all product
        cash=cash1+cash2+cash3;
        System.out.println(cash);
        //total cash cart
        tfcash = driver.findElement(By.xpath("//*[@id=\"total_product\"]")).getText();
        tfcash = getNum(tfcash);
        totalcash = Integer.parseInt(tfcash);
        System.out.println(totalcash);
        Assert.assertEquals(totalcash,cash);
        Thread.sleep(1000);
    }

    public String removeChar(String str, char c) {
        return str.replaceAll(Character.toString(c), "");
    }

    public String getNum(String str) {
        str = str.replaceAll(",", "");
        str = str.replaceAll("VNĐ", "");
        str = str.trim();
        return str;
    }

}
