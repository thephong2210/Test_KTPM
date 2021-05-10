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
import static testproject.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class Admin_QuanLyKhachHang {
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void Test_DanhSachKhachHang() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/customerlist.php");
        
        //click đóng menu trước khi test header menu
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. Tiêu đề trang là ""Quản lý người dùng"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Quản lý người dùng", "36px", "#333333");
        
        //3. Tiêu đề danh sách khách hàng là ""DANH SÁCH KHÁCH HÀNG"", size 15px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/span", "DANH SÁCH KHÁCH HÀNG", "15px", "#333333");
        
        //4. Button ""Thêm khách hàng"", size 14px, color #ffffff, background-color #5cb85c
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/a/button", "Thêm khách hàng", "14px", "#ffffff");
        
        //5. Input tìm kiếm (height 34px, background-color #ffffff), 
        //button tìm kiếm (value ""Tìm kiếm"", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/input[1]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/input[1]", "#ffffff");
        
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/input[2]", "value", "Tìm kiếm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/input[2]", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/input[2]", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/input[2]", "#ffffff");
        
        //6. Các thuộc tính bao gồm: (size 14px, color #333333) "STT", "Họ tên", "Tên đăng nhập", "Email", "Trạng thái"
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[1]", "STT", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[2]", "Họ tên", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[3]", "Tên đăng nhập", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[4]", "Email", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[5]", "Trạng thái", "14px", "#333333");
        
        //- Button ""Sửa"": size 14px, color #ffffff, background-color #5bc0de
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[6]/a[1]/button", "Sửa", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[6]/a[1]/button", "#5bc0de");
        
        //- Button ""Mở / Khóa"": size 14px, color #ffffff, background-color #f0ad4e"
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[6]/a[2]/button", "Mở / Khóa", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[6]/a[2]/button", "#f0ad4e");
        
    }
    
    @Test
    public void Test_ThemKhachHang() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/customeradd.php");
        
        //click đóng menu trước khi test header menu
        //driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. Tiêu đề trang là ""Quản lý người dùng"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Quản lý người dùng", "36px", "#333333");
        
        //3. Tiêu đề thêm quản trị viên là ""THÊM KHÁCH HÀNG"", size 15px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/span", "THÊM KHÁCH HÀNG", "15px", "#333333");
        
        //4. Button ""Thêm"", size 14px, color #ffffff, background-color #5cb85c
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "value", "Thêm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#5cb85c");
        
        //5. Các thuộc tính: 
        //- ""Họ tên:"", ""Email:"", ""Tên đăng nhập:"", ""Mật khẩu:"", ""Nhập lại mật khẩu:"" 
        //(Label: size 14px, color #333333; input: height 34px,background-color #ffffff)
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[1]/label", "Họ tên:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[1]/label", "Email:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[1]/label", "Tên đăng nhập:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[1]/label", "Mật khẩu:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[1]/label", "Nhập lại mật khẩu:", "14px", "#333333");
 
        //Các input
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input", "#ffffff");
        
    }
    
    @Test
    public void Test_SuaKhachHang() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/customeredit.php?userid=9");
        
        //click đóng menu trước khi test header menu
        //driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. Tiêu đề trang là ""Quản lý người dùng"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Quản lý người dùng", "36px", "#333333");
        
        //3. Tiêu đề thêm quản trị viên là ""SỬA THÔNG TIN KHÁCH HÀNG"", size 15px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/span", "SỬA THÔNG TIN KHÁCH HÀNG", "15px", "#333333");
        
        //4. Button ""Cập nhật"", size 14px, color #ffffff, background-color #5cb85c
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "value", "Cập nhật");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#5cb85c");
        
        //5. Các thuộc tính: 
        //- ""Họ tên:"", ""Email:"", ""Tên đăng nhập:"", ""Mật khẩu:"", ""Nhập lại mật khẩu:"" 
        //(Label: size 14px, color #333333; input: height 34px,background-color #ffffff)
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[1]/label", "Họ tên:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[1]/label", "Email:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[1]/label", "Tên đăng nhập:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[1]/label", "Mật khẩu:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[1]/label", "Nhập lại mật khẩu:", "14px", "#333333");
 
        //Các input
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/input", "#ffffff");
        
    }
    
    
}
