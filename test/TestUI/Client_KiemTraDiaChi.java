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
public class Client_KiemTraDiaChi {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_KiemTraDiaChi() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/checkout-address.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề ""KIỂM TRA ĐỊA CHỈ | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("KIỂM TRA ĐỊA CHỈ | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Sổ Địa Chỉ"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "Sổ Địa Chỉ", "15px", "#777777");
        
        //- text ""SỔ ĐỊA CHỈ"": size 18px, color #555454
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/h2", "SỔ ĐỊA CHỈ", "18px", "#555454");
        
        //- text ""01. GIỎ HÀNG"", ""02. ĐĂNG NHẬP"": size 17px, color #B5B5B5;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[1]/span/a", "01. GIỎ HÀNG", "17px", "#b5b5b5");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[2]/span/a", "02. ĐĂNG NHẬP", "17px" , "#b5b5b5");
        
        //- text ""03. ĐỊA CHỈ"": size 17px, color #FFFFFF
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[3]/span", "03. ĐỊA CHỈ", "17px", "#ffffff");
        
        //- text ""04. VẬN CHUYỂN"", ""05. THANH TOÁN"": size 17px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/ul/li[4]/span", "04. VẬN CHUYỂN", "17px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"step_end\"]/span", "05. THANH TOÁN", "17px", "#333333");
        
        //- form địa chỉ: background-color #fbfbfb
        HamDungChung.Test_BackgroundColor("//*[@id=\"personalinfo\"]", "#fbfbfb");
        
        //+ text ""ĐỊA CHỈ"": size 14px, color #6D6D6D
        HamDungChung.Test_TextSizeColor("//*[@id=\"personalinfo\"]/center", "ĐỊA CHỈ", "14px", "#6d6d6d");
        
        //+ Các label (size 13px, color #333333):
        //""Chọn tỉnh/thành phố:"", ""Chọn Quận/Huyện:"", ""Chọn Xã"", ""Địa chỉ nhận hàng*"", ""Tên người nhận*"", ""Số điện thoại *"", ""Ghi chú cho đơn hàng (nếu có)""
        HamDungChung.Test_TextSizeColor("//*[@id=\"personalinfo\"]/label[1]", "Chọn tỉnh/thành phố:", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"personalinfo\"]/label[2]", "Chọn Quận/Huyện:", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"personalinfo\"]/label[3]", "Chọn Xã", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"personalinfo\"]/label[4]", "Địa chỉ nhận hàng*", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"personalinfo\"]/div[4]/label", "Tên người nhận*", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"personalinfo\"]/div[5]/label", "Số điện thoại *", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[1]/div/label", "Ghi chú cho đơn hàng (nếu có)", "13px", "#333333");
        
        //+ input tỉnh, thành phố, quận huyện: size 12px, height 28px, color #777777, background #000000
        HamDungChung.Test_FontSize("//*[@id=\"address_tinh\"]", "12px");
        HamDungChung.Test_CSSValue("//*[@id=\"address_tinh\"]", "height", "28px");
        HamDungChung.Test_Color("//*[@id=\"address_tinh\"]", "#777777");
        HamDungChung.Test_BackgroundColor("//*[@id=\"address_tinh\"]", "#000000");
        
        HamDungChung.Test_FontSize("//*[@id=\"address1\"]", "12px");
        HamDungChung.Test_CSSValue("//*[@id=\"address1\"]", "height", "28px");
        HamDungChung.Test_Color("//*[@id=\"address1\"]", "#777777");
        HamDungChung.Test_BackgroundColor("//*[@id=\"address1\"]", "#000000");
        
        HamDungChung.Test_FontSize("//*[@id=\"deli-address\"]", "12px");
        HamDungChung.Test_CSSValue("//*[@id=\"deli-address\"]", "height", "28px");
        HamDungChung.Test_Color("//*[@id=\"deli-address\"]", "#777777");
        HamDungChung.Test_BackgroundColor("//*[@id=\"deli-address\"]", "#000000");
        
        //+ input địa chỉ nhận hàng, tên người nhận, số điện thoại: size 14px, height 33px, color #9c9b9b, background #ffffff
        HamDungChung.Test_FontSize("//*[@id=\"diachinh\"]", "14px");
        HamDungChung.Test_CSSValue("//*[@id=\"diachinh\"]", "height", "33px");
        HamDungChung.Test_Color("//*[@id=\"diachinh\"]", "#9c9b9b");
        HamDungChung.Test_BackgroundColor("//*[@id=\"diachinh\"]", "#ffffff");
        
        HamDungChung.Test_FontSize("//*[@id=\"firstname\"]", "14px");
        HamDungChung.Test_CSSValue("//*[@id=\"firstname\"]", "height", "33px");
        HamDungChung.Test_Color("//*[@id=\"firstname\"]", "#9c9b9b");
        HamDungChung.Test_BackgroundColor("//*[@id=\"firstname\"]", "#ffffff");
        
        HamDungChung.Test_FontSize("//*[@id=\"phone\"]", "14px");
        HamDungChung.Test_CSSValue("//*[@id=\"phone\"]", "height", "33px");
        HamDungChung.Test_Color("//*[@id=\"phone\"]", "#9c9b9b");
        HamDungChung.Test_BackgroundColor("//*[@id=\"phone\"]", "#ffffff");
        
        //+ input ghi chú: size 14px, height 135px, color #d6d4d4, background #ffffff
        HamDungChung.Test_FontSize("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[1]/div/textarea", "14px");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[1]/div/textarea", "height", "135px");
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[1]/div/textarea", "#d6d4d4");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[1]/div/textarea", "#ffffff");
        
        //- button ""TIẾN HÀNH ĐẶT HÀNG"": color #ffffff; background-color: #FF0000; height: 45px; width: 209px;
        HamDungChung.Test_AttributeHTML("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input", "value", "TIẾN HÀNH ĐẶT HÀNG");
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input", "#ff0000");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input", "height", "45px");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[3]/div[2]/div[2]/input", "width", "209px");
        
        
        driver.close();
    }
        
        
        
       
    
    
}
