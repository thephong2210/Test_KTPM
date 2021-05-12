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
public class Admin_QuanLySanPham {
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void Test_DanhSachSanPham() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/product.php");
        
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text ""Sản phẩm"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Sản phẩm", "36px", "#333333");
        
        //3. text ""DANH SÁCH SẢN PHẨM"", size 15px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/span", "DANH SÁCH SẢN PHẨM", "15px", "#333333");
        
        //4. Button ""Thêm sản phẩm"", size 14px, color #ffffff, background-color #5cb85c
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/a[2]/button", "Thêm sản phẩm", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/a[2]/button", "#5cb85c");
        
        //5. Input tìm kiếm (height 34px, background-color #ffffff), 
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[1]", "#ffffff");
        
        //button tìm kiếm (value ""Tìm kiếm"", size 14px, color #333333, background-color #ffffff ),
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]", "value", "Tìm kiếm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input[2]", "#ffffff");
        
        //button hiện tất cả (value ""Hiện tất cả"", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/a[1]/input", "value", "Hiện tất cả");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/a[1]/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/a[1]/input", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/a[1]/input", "#ffffff");
        
        //6. Các thuộc tính bao gồm: (size 14px, color #333333) ""Mã sản phẩm"", ""Tên sản phẩm"", ""Tên danh mục"", ""Size"", 
        //""Số lượng"", ""Giá"",  ""Miêu tả sản phẩm"",  ""Trạng thái"", ""Ảnh sản phẩm""
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[1]", "Mã sản phẩm", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[2]", "Tên sản phẩm", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[3]", "Tên danh mục", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[4]", "Size", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[5]", "Số lượng", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[6]", "Giá", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[7]", "Miêu tả sản phẩm", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[8]", "Trạng thái", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[9]", "Ảnh sản phẩm", "14px", "#333333");
        
        //- Button ""Sửa"": size 14px, color #ffffff, background-color #5BC0DE
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[10]/a[1]/button", "Sửa", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[10]/a[1]/button", "#5bc0de");
        
        //- Button ""Ẩn"": size 14px, color #ffffff, background-color #f0ad4e"
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[10]/a[2]/button", "Ẩn", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[10]/a[2]/button", "#f0ad4e");
        
        
    }
    
    
    @Test
    public void Test_ThemSanPham() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/productadd.php");
        
        //click đóng menu trước khi test header menu
        //driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text ""Sản phẩm"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Sản phẩm", "36px", "#333333");
        
        //3. text ""THÊM SẢN PHẨM"", size 15px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/span", "THÊM SẢN PHẨM", "15px", "#333333");
        
        //4. Button ""Thêm sản phẩm"", size 14px, color #ffffff, background-color #5cb85c
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "value", "Thêm sản phẩm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#5cb85c");
        
        //5. Các thuộc tính: 
        //- Các label (size 14px, color #333333): ""Tên sản phẩm:"", ""Danh mục sản phẩm:"", ""Size:"", 
        //""Số lượng:"", ""Miêu tả sản phẩm:"", ""Giá:"", ""Hình ảnh sản phẩm:"" 
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[1]/label", "Tên sản phẩm:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[1]/label", "Danh mục sản phẩm:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[1]/label", "Size:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[1]/label", "Số lượng:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[1]/label", "Miêu tả sản phẩm:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[1]/label", "Giá:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[1]/label", "Hình ảnh sản phẩm:", "14px", "#333333");
        
        //-  Các input (height 34px, background-color #ffffff), input miêu tả sản phẩm (height 80px), input type file"
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/select", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/select", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/select", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/select", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "#ffffff");
        
        //input miêu tả sản phẩm
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea", "height", "80px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input", "#ffffff");
        
        //input type file
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input", "type", "file");
        
    }
    
    @Test
    public void Test_SuaSanPham() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/productedit.php?productid=64");
        
        //click đóng menu trước khi test header menu
        //driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[3]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text ""Sản phẩm"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Sản phẩm", "36px", "#333333");
        
        //3. text ""THÊM SẢN PHẨM"", size 15px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/span", "THÊM SẢN PHẨM", "15px", "#333333");
        
        //4. Button ""Cập nhật sản phẩm"", size 14px, color #ffffff, background-color #5cb85c
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "value", "Cập nhật sản phẩm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/input", "#5cb85c");
        
        //5. Các thuộc tính: 
        //- Các label (size 14px, color #333333): ""Tên sản phẩm:"", ""Danh mục sản phẩm:"", ""Size:"", 
        //""Số lượng:"", ""Miêu tả sản phẩm:"", ""Giá:"", ""Hình ảnh sản phẩm:"" 
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[1]/label", "Tên sản phẩm:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[1]/label", "Danh mục sản phẩm:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[1]/label", "Size:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[1]/label", "Số lượng:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[1]/label", "Miêu tả sản phẩm:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[1]/label", "Giá:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[1]/label", "Hình ảnh sản phẩm:", "14px", "#333333");
        
        //-  Các input (height 34px, background-color #ffffff), input miêu tả sản phẩm (height 80px), input type file"
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[1]/td[2]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/select", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[2]/td[2]/select", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/select", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[3]/td[2]/select", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[4]/td[2]/input", "#ffffff");
        
        //input miêu tả sản phẩm
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea", "height", "80px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[5]/td[2]/textarea", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[6]/td[2]/input", "#ffffff");
        
        //input type file
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[2]/form/table/tbody/tr[7]/td[2]/input", "type", "file");
        
    }
    
    
}
