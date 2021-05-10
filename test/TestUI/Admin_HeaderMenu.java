/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

import java.net.URL;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import static testproject.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class Admin_HeaderMenu {
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ADMIN.DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin");
    }
    
    //Xóa static để chỉ test mỗi header và menu
    @Test
    public static void TestHeader() throws Exception{
        
        //- Tiêu đề trang ""ADMIN B.STORE""
        HamDungChung.Test_Title("ADMIN B.STORE");
     
        //- Background color #222222
        HamDungChung.Test_BackgroundColor("//*[@id=\"wrapper\"]/nav", "#222222");
        
        //- text ""Admin"", size 18px, color #9D9D9D
        HamDungChung.Test_TextSizeColor("//*[@id=\"wrapper\"]/nav/div[1]/a", "Admin", "18px", "#9d9d9d");
        
        //- text ""<i class=""fa fa-home fa-fw""></i> Trang chủ B.STORE"", size 14px, color #9D9D9D
        HamDungChung.Test_Icon("//*[@id=\"wrapper\"]/nav/ul[1]/li/a/i", "fa fa-home fa-fw");
        HamDungChung.Test_TextSizeColor("//*[@id=\"wrapper\"]/nav/ul[1]/li/a", "Trang chủ B.STORE", "14px", "#9d9d9d");
        
        //- icon ""<i class=""fa fa-bell fa-fw""></i>"", size 14px, color #999999
        HamDungChung.Test_Icon("//*[@id=\"wrapper\"]/nav/ul[2]/li[1]/a/i", "fa fa-bell fa-fw");
        HamDungChung.Test_FontSize("//*[@id=\"wrapper\"]/nav/ul[2]/li[1]/a", "14px");
        HamDungChung.Test_Color("//*[@id=\"wrapper\"]/nav/ul[2]/li[1]/a", "#999999");
        
        
        //- dropdown ""<i class=""fa fa-user fa-fw""></i> Admin"", size 14px, color #999999
        HamDungChung.Test_Icon("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/a/i", "fa fa-user fa-fw");
        HamDungChung.Test_TextSizeColor("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/a", "Admin", "14px", "#999999");
        
        //Click dropdown
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/a")).click();
        //+ item 1: ""<i class=""fa fa-user fa-fw""></i> Thông tin nguời dùng"", size 14px, color #3333333 
        HamDungChung.Test_Icon("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/ul/li[1]/a/i", "fa fa-user fa-fw");
        HamDungChung.Test_TextSizeColor("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/ul/li[1]/a", "Thông tin nguời dùng", "14px", "#333333");
        
        //+ item 2: ""<i class=""fa fa-gear fa-fw""></i> Cài đặt"", size 14px, color #333333
        HamDungChung.Test_Icon("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/ul/li[2]/a/i", "fa fa-gear fa-fw");
        HamDungChung.Test_TextSizeColor("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/ul/li[2]/a", "Cài đặt", "14px", "#333333");
       
        //+ item 3: ""<i class=""fa fa-sign-out fa-fw""></i> Đăng xuất"", size 14px, color #333333
        HamDungChung.Test_Icon("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/ul/li[4]/a/i", "fa fa-sign-out fa-fw");
        HamDungChung.Test_TextSizeColor("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/ul/li[4]/a", "Đăng xuất", "14px", "#333333");
        
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/nav/ul[2]/li[2]/a")).click();
        
        Thread.sleep(500);
    }
     
    @Test
    public static void TestMenu() throws Exception{
        
        //"Menu bao gồm: (tất cả đều size 14px) 
        //- ""<i class=""fa fa-dashboard fa-fw""></i> Trang chủ""
        HamDungChung.Test_Icon("//*[@id=\"side-menu\"]/li[2]/a/i", "fa fa-dashboard fa-fw");
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[2]/a", "Trang chủ");
        HamDungChung.Test_FontSize("//*[@id=\"side-menu\"]/li[2]/a", "14px");
        
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
        //- ""<i class=""fa fa-users""></i> Quản lý người dùng""
        HamDungChung.Test_Icon("//*[@id=\"side-menu\"]/li[3]/a/i", "fa fa-users");
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[3]/a", "Quản lý người dùng");
        HamDungChung.Test_FontSize("//*[@id=\"side-menu\"]/li[3]/a", "14px");
        
        //+ text ""Danh sách quản trị viên""
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a", "Danh sách quản trị viên");
        
        //+ text ""Danh sách khách hàng""
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[3]/ul/li[2]/a", "Danh sách khách hàng");
       
        //- ""<i class=""fa fa-product-hunt""></i> Quản lý sản phẩm""
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/ul/li[2]/a")).click();
        
        HamDungChung.Test_Icon("//*[@id=\"side-menu\"]/li[4]/a/i", "fa fa-product-hunt");
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[4]/a", "Quản lý sản phẩm");
        HamDungChung.Test_FontSize("//*[@id=\"side-menu\"]/li[4]/a", "14px");
        
        //+ text ""Danh mục sản phẩm""
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[4]/ul/li[1]/a", "Danh mục sản phẩm");
       
        //+ text ""Sản phẩm""
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[4]/ul/li[2]/a", "Sản phẩm");
       
        //++ text ""Danh sách sản phẩm""
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[4]/ul/li[2]/ul/li[1]/a", "Danh sách sản phẩm");
      
        //++ text ""Thêm sản phẩm"" 
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[4]/ul/li[2]/ul/li[2]/a", "Thêm sản phẩm");

        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a")).click();
        //- ""<i class=""fa fa-archive""></i> Quản lý hóa đơn""
        HamDungChung.Test_Icon("//*[@id=\"side-menu\"]/li[5]/a/i", "fa fa-archive");
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[5]/a", "Quản lý hóa đơn");
        HamDungChung.Test_FontSize("//*[@id=\"side-menu\"]/li[5]/a", "14px");
        
        //+ text ""<span class=""fa fa-cart-plus""></span> Quản lý đơn hàng""
        HamDungChung.Test_Icon("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a/span[2]", "fa fa-cart-plus");
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a", "Quản lý đơn hàng");
        HamDungChung.Test_FontSize("//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a", "14px");
        
        //+ text ""<span class=""fa fa-archive""></span> Quản lý hóa đơn"" 
        HamDungChung.Test_Icon("//*[@id=\"side-menu\"]/li[5]/ul/li[2]/a/span[2]", "fa fa-archive");
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[5]/ul/li[2]/a", "Quản lý hóa đơn");
        HamDungChung.Test_FontSize("//*[@id=\"side-menu\"]/li[5]/ul/li[2]/a", "14px");
        
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a")).click();
        //- ""<i class=""fa fa-pie-chart""></i> Thống kê doanh thu""
        HamDungChung.Test_Icon("//*[@id=\"side-menu\"]/li[6]/a/i", "fa fa-pie-chart");
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[6]/a", "Thống kê doanh thu");
        HamDungChung.Test_FontSize("//*[@id=\"side-menu\"]/li[6]/a", "14px");
       
        //+ text ""Thống kê theo sản phẩm""
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[6]/ul/li[1]/a", "Thống kê theo sản phẩm");
        
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a")).click();
        //+ text ""Thống kê doanh thu theo tháng"""
        HamDungChung.Test_Text("//*[@id=\"side-menu\"]/li[6]/ul/li[2]/a", "Thống kê doanh thu theo tháng");
  
        Thread.sleep(500);
    }
     
     
}
