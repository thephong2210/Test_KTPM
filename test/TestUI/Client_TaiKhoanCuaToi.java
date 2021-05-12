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
public class Client_TaiKhoanCuaToi {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_TaiKhoanCuaToi() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/my-account.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề trang ""TÀI KHOẢN CỦA TÔI | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("TÀI KHOẢN CỦA TÔI | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Tải Khoản Của Tôi"", text ""Chi Tiết Và Lịch Sử Đơn Hàng"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "Tải Khoản Của Tôi", "15px", "#777777");
        
        //- text ""TÀI KHOẢN CỦA TÔI"": size 18px, color #555454;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/h2", "TÀI KHOẢN CỦA TÔI", "18px", "#555454");
        
        //- text ""Xin chào, Bạn có thể quản lý tất cả thông tin cá nhân và đơn hàng ở đây."": size 13px, color #6D6D6D
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]", "Xin chào,\n" +"Bạn có thể quản lý tất cả thông tin cá nhân và đơn hàng ở đây.", "13px", "#6d6d6d");
        
        //- button ""CHI TIẾT VÀ LỊCH SỬ ĐƠN HÀNG"", ""THÔNG TIN CÁ NHÂN"": color: #555454; font-size: 16px; 
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[3]/div/div/ul/li[1]/a", "CHI TIẾT VÀ LỊCH SỬ ĐƠN HÀNG", "16px", "#555454");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[3]/div/div/ul/li[2]/a", "THÔNG TIN CÁ NHÂN", "16px", "#555454");
    
        //- button ""ĐĂNG XUẤT"": color #222222; background-color: #FF0000; height: 45px; width: 209px;
        HamDungChung.Test_AttributeHTML("/html/body/section[2]/div/div[2]/div[4]/div/ul/form/input", "value" , "ĐĂNG XUẤT");
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[4]/div/ul/form/input", "#222222");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[4]/div/ul/form/input", "#ff0000");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[4]/div/ul/form/input", "height", "45px");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[4]/div/ul/form/input", "width", "209px");
        
        
        driver.close();
    }
        
        
        
       
    
    
}
