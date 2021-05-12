/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADMIN;

import static ADMIN.DangNhapManager.LoginManagerAndToPage;
import org.testng.annotations.Test;
import static Client.DangKy.driver;
import org.openqa.selenium.By;
import org.testng.Assert;
//import org.junit.Test;

/**
 *
 * @author Asus
 */
public class QLND_Manager {
    public QLND_Manager(){}
    String check;
    @Test
    public static void check() throws InterruptedException, Exception {
        LoginManagerAndToPage("http://localhost/web2general/admin");
    }
    ////*[@id="side-menu"]/li[2]//*[@id="side-menu"]/li[3]//*[@id="side-menu"]/li[6]
    @Test
    public void checkManager()throws InterruptedException, Exception{
        for(int i=2;i<=6;i++){
            check=driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li["+i+"]")).getText();
            Assert.assertNotEquals(check, "Quản lý người dùng");
            Thread.sleep(1000);
        };
    }
}
