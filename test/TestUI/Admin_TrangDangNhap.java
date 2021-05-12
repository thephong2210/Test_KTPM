/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import static Client.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class Admin_TrangDangNhap {
    String xPathTenDangNhap = "/html/body/div/div/div/div/div[2]/form/fieldset/div[1]/input";
    String xPathMatKhau = "/html/body/div/div/div/div/div[2]/form/fieldset/div[2]/input";
    String buttonDangNhap = "/html/body/div/div/div/div/div[2]/form/fieldset/input";
    
    @BeforeClass
    public static void setUpClass() throws Exception{
        System.setProperty("webdriver.chrome.driver", "test\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.get("http://localhost/web2general/admin");
    }
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void TestTrangDangNhap() throws Exception{
        //- Tiêu đề (title) đầu trang ""LOGIN TRANG QUẢN TRỊ B.STORE""
        HamDungChung.Test_Title("LOGIN TRANG QUẢN TRỊ B.STORE");
        
        //- text ""LOGIN TRANG QUẢN TRỊ B.STORE"", size 16px, color #333333, background-color #F5F5F5
        HamDungChung.Test_TextSizeColor("/html/body/div/div/div/div/div[1]/h3", "LOGIN TRANG QUẢN TRỊ B.STORE", "16px", "#333333");
        HamDungChung.Test_BackgroundColor("/html/body/div/div/div/div/div[1]", "#f5f5f5");
        
        //- input ""tenDangNhap"", placeholder ""Tên đăng nhập"", height 34px, background-color #FFFFFF
        HamDungChung.Test_AttributeHTML(xPathTenDangNhap, "name", "tenDangNhap");
        HamDungChung.Test_AttributeHTML(xPathTenDangNhap, "placeholder", "Tên đăng nhập");
        HamDungChung.Test_CSSValue(xPathTenDangNhap, "height", "34px");
        HamDungChung.Test_BackgroundColor(xPathTenDangNhap, "#ffffff");
        
        //- input ""matKhau"", placeholder ""Mật khẩu"", height 34px, background-color #FFFFFF
        HamDungChung.Test_AttributeHTML(xPathMatKhau, "name", "matKhau");
        HamDungChung.Test_AttributeHTML(xPathMatKhau, "placeholder", "Mật khẩu");
        HamDungChung.Test_CSSValue(xPathMatKhau, "height", "34px");
        HamDungChung.Test_BackgroundColor(xPathMatKhau, "#ffffff");
        
        //- button ""Đăng nhập"", height 46px, color #FFFFFF ,background-color #5CB85C
        HamDungChung.Test_AttributeHTML(buttonDangNhap, "value", "Đăng nhập");
        HamDungChung.Test_Color(buttonDangNhap, "#ffffff");
        HamDungChung.Test_CSSValue(buttonDangNhap, "height", "46px");
        HamDungChung.Test_BackgroundColor(buttonDangNhap, "#5cb85c");
        
    }
    
    
}
