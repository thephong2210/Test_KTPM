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
import static Client.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class Client_ThongTinCaNhan {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_ThongTinCaNhan() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/information.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề trang ""TÀI KHOẢN CỦA TÔI | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("TÀI KHOẢN CỦA TÔI | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Tải Khoản Của Tôi"" size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "Tải Khoản Của Tôi", "15px", "#777777");
       
        //- text ""THÔNG TIN CÁ NHÂN"": size 18px, color #555454;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/h2", "THÔNG TIN CÁ NHÂN", "18px", "#555454");
        
        //- text ""Xin chào, Bạn có thể quản lý tất cả thông tin cá nhân."": size 13px, color #6D6D6D
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]", "Xin chào,\n" + "Bạn có thể quản lý tất cả thông tin cá nhân.", "13px", "#6d6d6d");
        
        //- text ""THÔNG TIN CÁ NHÂN CỦA BẠN"": color: #555454; font-size: 18px;
        HamDungChung.Test_TextSizeColor("//*[@id=\"accountLogin\"]/h3", "THÔNG TIN CÁ NHÂN CỦA BẠN", "18px", "#555454");
        
        //- text label ""Tên khách hàng"", ""Thư điện tử"": color: #333333; font-size: 13px;
        HamDungChung.Test_TextSizeColor("//*[@id=\"accountLogin\"]/div/div[1]/label", "Tên khách hàng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"accountLogin\"]/div/div[2]/label", "Thư điện tử", "13px", "#333333");
        
        //- input tên khách hàng, thử điện tử: heigth 33px, background-color: #EEEEEE
        HamDungChung.Test_CSSValue("//*[@id=\"name\"]", "height", "33px");
        HamDungChung.Test_BackgroundColor("//*[@id=\"name\"]", "#eeeeee");
        
        //- button ""Sửa"": size 17px, color #FFFFFF, background-color: #ff4f4f
        HamDungChung.Test_TextSizeColor("//*[@id=\"signinCreate\"]", "Sửa", "17px", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"signinCreate\"]", "#ff4f4f");
        
        //- button ""TRỞ VỀ"": background: #ff4f4f, color: #fff; font-size: 13px;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[3]/div/ul/li/a", "TRỞ VỀ", "13px", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[3]/div/ul/li/a", "#ff4f4f");
        
        driver.close();
    }
        
        
        
       
    
    
}
