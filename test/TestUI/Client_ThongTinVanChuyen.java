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
public class Client_ThongTinVanChuyen {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_ThongTinVanChuyen() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/checkout-shipping.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề ""THÔNG TIN VẬN CHUYỂN | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("THÔNG TIN VẬN CHUYỂN | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Vận Chuyển"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "Vận Chuyển", "15px", "#777777");
        
        //- text ""THÔNG TIN VẬN CHUYỂN:"": size 18px, color #555454
         HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/h2", "THÔNG TIN VẬN CHUYỂN:", "18px", "#555454");
        
        //- text ""01. GIỎ HÀNG"", ""02. ĐĂNG NHẬP"", ""03. ĐỊA CHỈ"", """": size 17px;  color: #b5b5b5;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[1]/span/a", "01. GIỎ HÀNG", "17px", "#b5b5b5");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[2]/span/a", "02. ĐĂNG NHẬP", "17px", "#b5b5b5");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[3]/span/a", "03. ĐỊA CHỈ", "17px", "#b5b5b5");
        
        //- text ""04. VẬN CHUYỂN"": size 17px;  color #FFFFFF
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[4]/span", "04. VẬN CHUYỂN", "17px", "#ffffff");
        
        //- text ""05. THANH TOÁN"": size 17px; color #333333
        HamDungChung.Test_TextSizeColor("//*[@id=\"step_end\"]/span", "05. THANH TOÁN", "17px", "#333333");
        
        //- text ""Chọn một phương thức vận chuyển:"", ""Điều khoản dịch vụ"": color: #333333; font-size: 13px;;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[3]/div/div[1]/div[1]/p", "Chọn một phương thức vận chuyển:", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[3]/div/div[1]/div[3]/p", "Điều khoản dịch vụ", "13px", "#333333");
        
        //- button ""Tiếp tục đơn hàng"":     background: #ff4f4f, color: #fff; font-size: 20px;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[3]/div/div[2]/a", "Tiếp tục đơn hàng", "20px", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[3]/div/div[2]/a", "#ff4f4f");

        driver.close();
    }
        
        
        
       
    
    
}
