/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import static testproject.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class Client_DangKy {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_DangKy(){
        HamDungChung.OpenPage("http://localhost/web2general/checkout-registration.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề ""ĐĂNG KÝ | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("ĐĂNG KÝ | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Đăng Ký"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "Đăng Ký", "15px", "#777777");
        
        //- text ""TẠO MỘT TÀI KHOẢN"": size 18px, color #555454
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/h2", "TẠO MỘT TÀI KHOẢN", "18px", "#555454");
        
        //- form đăng ký: background: #fbfbfb;
        HamDungChung.Test_BackgroundColor("//*[@id=\"formDangKy\"]", "#fbfbfb");
        
        //+ text ""THÔNG TIN CÁ NHÂN CỦA BẠN"": size 18px, color #555454
        HamDungChung.Test_TextSizeColor("//*[@id=\"formDangKy\"]/h3", "THÔNG TIN CÁ NHÂN CỦA BẠN", "18px", "#555454");
        
        //+ Các label (size 13px, color #333333): ""Họ Tên*"", ""Email*"", ""Ngày Sinh *"", ""Tên Đăng Nhập*"", ""Mật Khẩu *"", ""Nhập Lại Mật Khẩu *""
        HamDungChung.Test_TextSizeColor("//*[@id=\"formDangKy\"]/div/div[1]/label", "Họ Tên*", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"formDangKy\"]/div/div[2]/label", "Email*", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"formDangKy\"]/div/div[3]/label", "Ngày Sinh *", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"formDangKy\"]/div/div[4]/label", "Tên Đăng Nhập*", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"formDangKy\"]/div/div[5]/label", "Mật Khẩu *", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"formDangKy\"]/div/div[6]/label", "Nhập Lại Mật Khẩu *", "13px", "#333333");
        
        //+ các input (height 33px, background-color #FFFFFF)
        HamDungChung.Test_CSSValue("//*[@id=\"hoTen_input\"]", "height", "33px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"hoTen_input\"]", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"email_input\"]", "height", "33px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"email_input\"]", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"formDangKy\"]/div/div[3]/input", "height", "33px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"formDangKy\"]/div/div[3]/input", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"firstname\"]", "height", "33px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"firstname\"]", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"matKhau_input\"]", "height", "33px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"matKhau_input\"]", "#ffffff");
        
        HamDungChung.Test_CSSValue("//*[@id=\"nhapLaiMatKhau_input\"]", "height", "33px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"nhapLaiMatKhau_input\"]", "#ffffff");
        
        //+ button ""ĐĂNG KÍ"": size 17px, color #FFFFFF, background-color #FF0000; height 45px; width 209px;
        HamDungChung.Test_AttributeHTML("//*[@id=\"SubmitCreate\"]", "value", "ĐĂNG KÍ");
        HamDungChung.Test_FontSize("//*[@id=\"SubmitCreate\"]", "17px");
        HamDungChung.Test_Color("//*[@id=\"SubmitCreate\"]", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"SubmitCreate\"]", "#ff0000");
        HamDungChung.Test_CSSValue("//*[@id=\"SubmitCreate\"]", "height", "45px");
        HamDungChung.Test_CSSValue("//*[@id=\"SubmitCreate\"]", "width", "209px");
        
        
        driver.close();
    }
        
        
        
       
    
    
}
