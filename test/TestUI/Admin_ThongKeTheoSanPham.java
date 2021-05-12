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
public class Admin_ThongKeTheoSanPham {
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void Test_TrangThongKeTheoSanPham() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/statistical_product.php");
        
        //click đóng menu trước khi test header menu
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text "Thống kê theo sản phẩm", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Thống kê theo sản phẩm", "36px", "#333333");
        
        //3. text "Thống kê theo sản phẩm", size 14px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[1]", "Thống kê theo sản phẩm", "14px", "#333333");
        
        //4. - label "Sắp xếp:"(size 14px, color #333333)
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/span", "Sắp xếp:", "14px", "#333333");
        
        //- button tìm kiếm (value "Tìm kiếm", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input", "value", "Tìm kiếm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input", "#ffffff");
        
        //- dropdown tìm kiếm theo tiêu chí (height 34px, background-color #ffffff): "Tăng dần", "Giảm dần"
        HamDungChung.Test_CSSValue("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[2]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[2]", "#ffffff");
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[2]")).click();
        HamDungChung.Test_Text("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[2]/option[1]", "Tăng dần");
        HamDungChung.Test_Text("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/select[2]/option[2]", "Giảm dần");
        
        //- button hiện tất cả (value "Hiện tất cả", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "value", "Hiện tất cả");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "#ffffff");
        
        //5. Các thuộc tính bao gồm: (size 14px, color #333333) "STT", "Tên sản phẩm", "Số lượng sản phẩm đã bán", "Số lượng còn lại", "Ảnh"
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[1]", "STT", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[2]", "Tên sản phẩm", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[3]", "Số lượng sản phẩm đã bán", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[4]", "Số lượng còn lại", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[5]", "Ảnh", "14px", "#333333");
       
    }
    
}
