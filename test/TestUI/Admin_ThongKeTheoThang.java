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
public class Admin_ThongKeTheoThang {
    
    @After
    public void afterClass(){
        driver.close();
    }
    
    @Test
    public void Test_TrangThongKeTheoThang() throws Exception{
        DangNhapAdmin.LoginAdminAndToPage("http://localhost/web2general/admin/pages/statistical_months.php");
        
        //click đóng menu trước khi test header menu
        driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a")).click();
        //1. Gọi trong file header và menu
        Admin_HeaderMenu.TestHeader();
        Admin_HeaderMenu.TestMenu();
        
        //2. text ""Thống kê doanh thu"", size 36px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[1]/div/h1", "Thống kê doanh thu", "36px", "#333333");
        
        //3. text ""Thống kê theo tháng"", size 14px, color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[1]", "Thống kê theo tháng", "14px", "#333333");
        
        //4. - button tìm kiếm (value ""Tìm kiếm"", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input[3]", "value", "Tìm kiếm");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input[3]", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input[3]", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/input[3]", "#ffffff");
        
        //- button hiện tất cả (value ""Hiện tất cả"", size 14px, color #333333, background-color #ffffff )
        HamDungChung.Test_AttributeHTML("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "value", "Hiện tất cả");
        HamDungChung.Test_FontSize("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "14px");
        HamDungChung.Test_Color("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "#333333");
        HamDungChung.Test_BackgroundColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/form/a/input", "#ffffff");
        
        //- input ""Từ tháng"", input ""Tới tháng"" (height 34px, background-color #ffffff)
        HamDungChung.Test_AttributeHTML("//*[@id=\"datepicker1\"]", "placeholder", "Từ tháng..");
        HamDungChung.Test_CSSValue("//*[@id=\"datepicker1\"]", "height", "34px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"datepicker1\"]", "#ffffff");
        
        //5. Các thuộc tính bao gồm: (size 14px, color #333333) ""STT"", ""Tháng/Năm"", ""Số lượng hóa đơn"", ""Doanh thu""
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[1]", "STT", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[2]", "Tháng/Năm", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[3]", "Số lượng hóa đơn", "14px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"page-wrapper\"]/div/div[2]/div[1]/div/div[2]/div/div[1]/div/table/thead/tr/th[4]", "Doanh thu", "14px", "#333333");
    
    }
    
}
