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
public class Admin_QuanLyHoaDon {
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void Test_DanhSachDonHang() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/hoadonlist.php");
        
        //click đóng menu trước khi test header menu
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[5]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text "Hóa đơn", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Hóa đơn", "36px", "#333333");
        
        //3. text "QUẢN LÝ HÓA ĐƠN", size 14px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[1]", "QUẢN LÝ HÓA ĐƠN", "14px", "#333333");
        
        //4. - Input tìm kiếm (height 34px, background-color #ffffff)
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[1]", "#ffffff");
        
        //- button tìm kiếm (value "Tìm kiếm", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]", "value", "Tìm kiếm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/input[2]", "#ffffff");
        
        //- dropdown tìm kiếm theo tiêu chí (height 34px, background-color #ffffff): "Mã hóa đơn", "Mã khách hàng", "Ngày lập hóa đơn"
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select", "#ffffff");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select")).click();
        HamDungChung.Test_Text("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select/option[1]", "Mã hóa đơn");
        HamDungChung.Test_Text("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select/option[2]", "Mã khách hàng");
        HamDungChung.Test_Text("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/select/option[3]", "Ngày lập hóa đơn");
      
        //- button hiện tất cả (value "Hiện tất cả", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/a/input", "value", "Hiện tất cả");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/a/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/a/input", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[1]/a/input", "#ffffff");
        
        //- Input từ ngày (height 34px, background-color #ffffff)
        HamDungChung.Test_AttributeHTML("//*[@id=\"datepicker1\"]", "placeholder", "Từ ngày..");
        HamDungChung.Test_CSSValue("//*[@id=\"datepicker1\"]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"datepicker1\"]", "#ffffff");
        
        //- Input tới ngày (height 34px, background-color #ffffff)
        HamDungChung.Test_AttributeHTML("//*[@id=\"datepicker2\"]", "placeholder", "Tới ngày..");
        HamDungChung.Test_CSSValue("//*[@id=\"datepicker2\"]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"datepicker2\"]", "#ffffff");
        
        //- button lọc (value "Lọc", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]", "value", "Lọc");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/form[2]/input[3]", "#ffffff");
        
        //5. Các thuộc tính bao gồm: (size 14px, color #333333) "Mã hóa đơn", "Mã khách hàng", "Ngày lập hóa đơn", "Giá trị hóa đơn"
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[1]", "Mã hóa đơn", "34px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[2]", "Mã khách hàng", "34px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[3]", "Ngày lập hóa đơn", "34px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[4]", "Giá trị hóa đơn", "34px", "#333333");

        //- Button "Xem chi tiết": size 14px, color #ffffff, background-color #5BC0DE
        HamDungChung.Test_TextSizeColor("//*[@id=\"btnShow\"]", "Xem chi tiết", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"btnShow\"]", "#5bc0de");
        
        //- Button "In hóa đơn":  disabled, size 14px, color #ffffff, background-color #f0ad4e
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[5]/button", "In hóa đơn", "14px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"dataTables-example\"]/tbody/tr[1]/td[5]/button", "#f0ad4e");
        
       
    }
    
    @Test
    public void Test_XemChiTietHoaDon() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/chitiethoadon.php?maHoaDon=17");
    
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text ""Hóa đơn"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Hóa đơn", "36px", "#333333");
        
        //3. text ""CHI TIẾT HÓA ĐƠN"", size 14px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[1]", "CHI TIẾT HÓA ĐƠN", "14px", "#333333");
        
        //4. Các thuộc tính: 
        //- Các label (size 14px, color #333333): ""Mã hóa đơn:"", ""Mã khách hàng:"", ""Tên người nhận:"", ""Số điện thoại:"", ""Địa chỉ giao:"", ""Giá trị đơn hàng:""
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[1]/td[1]/label", "Mã hóa đơn:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[2]/td[1]/label", "Mã khách hàng:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[3]/td[1]/label", "Tên người nhận:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[4]/td[1]/label", "Số điện thoại:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/div/form/table[1]/tbody/tr[5]/td[1]/label", "Địa chỉ giao:", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div/div/div[2]/label", "Giá trị đơn hàng:", "14px", "#333333");
        
        //- Thuộc tính table (size 14px, color #333333) : ""STT"", ""Ảnh"", ""Mã sản phẩm"", ""Tên sản phẩm"", ""Size"", ""Số lượng SP"", ""Đơn giá"", ""Thành tiền"""
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[1]", "STT", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[2]", "Ảnh", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[3]", "Mã sản phẩm", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[4]", "Tên sản phẩm", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[5]", "Size", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[6]", "Số lượng SP", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[7]", "Đơn giá", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[8]", "Thành tiền", "14px", "#333333");
   
        
    }
    
}
