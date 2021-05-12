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
public class Client_DangNhap {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_DangNhap(){
        HamDungChung.OpenPage("http://localhost/web2general/registration.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề ""ĐĂNG NHẬP/ĐĂNG KÝ | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("ĐĂNG NHẬP/ĐĂNG KÝ | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Đăng Nhập / Đăng Ký"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "Đăng Nhập / Đăng Ký", "15px", "#777777");
        
        //- text ""ĐĂNG NHẬP / ĐĂNG KÝ"": size 18px, color #555454
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/h2", "ĐĂNG NHẬP / ĐĂNG KÝ", "18px", "#555454");
        
        //- text ""TẠO TÀI KHOẢN"": color: #555454;  font-size: 18px;
        HamDungChung.Test_TextSizeColor("//*[@id=\"create-new-account\"]/h3", "TẠO TÀI KHOẢN", "18px", "#555454");
        
        //- button ""TẠO TÀI KHOẢN"": size 17px; background: #ff4f4f; color: #ffffff;
        HamDungChung.Test_TextSizeColor("//*[@id=\"SubmitCreate\"]", "TẠO TÀI KHOẢN", "17px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"SubmitCreate\"]", "#ff4f4f");
        
        //- text ""ĐÃ CÓ TÀI KHOẢN?"": size 18px, color: #555454;
        HamDungChung.Test_TextSizeColor("//*[@id=\"accountLogin\"]/h3", "ĐÃ CÓ TÀI KHOẢN?", "18px", "#555454");
        
        //- Các label (size 13px, color #333333): ""Tên đăng nhập"", ""Mật khẩu""
        HamDungChung.Test_TextSizeColor("//*[@id=\"accountLogin\"]/div/div[2]/label", "Tên đăng nhập", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"accountLogin\"]/div/div[3]/label", "Mật khẩu", "13px", "#333333");
        
        //- Các input (height 33px, color: #9c9b9b; background-color: #FFFFFF)
        HamDungChung.Test_CSSValue("//*[@id=\"loginname\"]", "height", "33px");
        HamDungChung.Test_Color("//*[@id=\"loginname\"]", "#9c9b9b");
        HamDungChung.Test_BackgroundColor("//*[@id=\"loginname\"]", "#ffffff");
        
        //- text ""Quên mật khẩu?"": size 13px, color #777777
        HamDungChung.Test_TextSizeColor("//*[@id=\"accountLogin\"]/div/div[4]/p/a", "Quên mật khẩu?", "13px", "#777777");
        
        //+ button "" ĐĂNG NHẬP"": size 17px, color #FFFFFF, background-color #FF0000; height 45px; width 209px;
        HamDungChung.Test_AttributeHTML("//*[@id=\"signinCreate\"]", "value", " ĐĂNG NHẬP");
        HamDungChung.Test_FontSize("//*[@id=\"signinCreate\"]", "17px");
        HamDungChung.Test_Color("//*[@id=\"signinCreate\"]", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"signinCreate\"]", "#ff0000");
        HamDungChung.Test_CSSValue("//*[@id=\"signinCreate\"]", "height", "45px");
        HamDungChung.Test_CSSValue("//*[@id=\"signinCreate\"]", "width", "209px");
        
        driver.close();
    }
        
        
        
       
    
    
}
