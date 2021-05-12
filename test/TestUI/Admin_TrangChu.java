/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import static Client.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class Admin_TrangChu {
    
    @BeforeClass
    public static void setUpClass() throws Exception{
        ADMIN.DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/index.php");
    }
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void TestTrangChu() throws Exception{
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. - text ""Trang chủ"": size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1","Trang chủ","36px","#333333");
        
        //- panel sản phẩm: background-color: #337ab7;
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div", "#337ab7");
        
        //+ icon class ""fa fa-product-hunt""
        HamDungChung.Test_Icon("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div/div/div[1]/i", "fa fa-product-hunt");
        
        //+ text ""Sản phẩm!"": size 14px, color #ffffff
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div/div/div[2]/div[2]","Sản phẩm!","14px","#ffffff");
        
        //- panel đơn hàng đã giao: background-color: #5cb85c;
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/div", "#5cb85c");
        
        //+ icon class ""fa fa-area-chart""
        HamDungChung.Test_Icon("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/div/div/div[1]/i", "fa fa-area-chart");
       
        //+ text ""Đơn hàng đã giao!"": size 14px, color #ffffff
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/div/div/div/div[2]/div[2]","Đơn hàng đã giao!","14px","#ffffff");
        
        //- panel đơn hàng chưa giao: background-color: #f0ad4e;
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[3]/div/div", "#f0ad4e");
       
        //+ icon class ""fa fa-shopping-cart""
        HamDungChung.Test_Icon("//*[@id=\"page-wrapper\"]/div/div[2]/div[3]/div/div/div/div[1]/i", "fa fa-shopping-cart");
        
        //+ text ""Đơn hàng chưa giao!"": size 14px, color #ffffff
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[3]/div/div/div/div[2]/div[2]","Đơn hàng chưa giao!","14px","#ffffff");
        
        //- panel người dùng: background-color: #d9534f;
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[4]/div/div", "#d9534f");
        
        //+ icon class ""fa fa-users""
        HamDungChung.Test_Icon("//*[@id=\"page-wrapper\"]/div/div[2]/div[4]/div/div/div/div[1]/i", "fa fa-users");
        
        //+ text ""Người dùng!"": size 14px, color #ffffff
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[4]/div/div/div/div[2]/div[2]","Người dùng!","14px","#ffffff");
     
    }
    
    
}
