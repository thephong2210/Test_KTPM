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
public class Admin_QuanLyDanhMucSP {
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void Test_DanhSachDanhMucSP() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/category.php");
        
        //click đóng menu trước khi test header menu
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[4]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text "Danh mục sản phẩm", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Danh mục sản phẩm", "36px", "#333333");
        
        //3. text "DANH MỤC SẢN PHẨM", size 14px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/span", "DANH MỤC SẢN PHẨM", "14px", "#333333");
        
        //4. Button "Thêm", size 14px, color #ffffff, background-color #5cb85c
        HamDungChung.Test_AttributeHTML("//*[@id=\"addbtn\"]", "value", "Thêm");
        HamDungChung.Test_FontSize("//*[@id=\"addbtn\"]", "14px");
        HamDungChung.Test_Color("//*[@id=\"addbtn\"]", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"addbtn\"]", "#5cb85c");
        
        //5. Input thêm danh mục (height 34px, background-color #ffffff)
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]", "#ffffff");
        
        //6. Các thuộc tính bao gồm: (size 14px, color #333333) "STT", "Tên danh mục"
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[1]", "STT", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[2]", "Tên danh mục", "14px", "#333333");
        
        //- Button ""Sửa"": size 14px, color #ffffff, background-color #5bc0de
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[3]/a[1]/button", "Sửa", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[3]/a[1]/button", "#5bc0de");
        
        //- Button "Xóa": size 14px, color #ffffff, background-color #D9534F
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[3]/a[2]/button", "Xóa", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[3]/a[2]/button", "#d9534f");
      
    }
    
}
