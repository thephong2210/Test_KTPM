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
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import static testproject.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class Client_GioHang {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_GioHang(){
        HamDungChung.OpenPage("http://localhost/web2general/cart.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề ""GIỎ HÀNG | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("GIỎ HÀNG | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""GIỎ HÀNG CỦA BẠN"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "GIỎ HÀNG CỦA BẠN", "15px", "#777777");
       
        //- text ""01. GIỎ HÀNG"": size 17px, color #FFFFFF, background: linear-gradient(#42b856, #43ab54);
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/ul/li[1]/span", "01. GIỎ HÀNG", "17px", "#ffffff");
   
        //HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[2]/div[1]/ul/li[1]", "background" ,"linear-gradient(#42b856, #43ab54)");
        
        //- text ""02. ĐĂNG NHẬP"", ""03. ĐỊA CHỈ"", ""04. VẬN CHUYỂN"", ""05. THANH TOÁN"": size 17px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/ul/li[2]/span", "02. ĐĂNG NHẬP", "17px", "#333333");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/ul/li[3]/span", "03. ĐỊA CHỈ", "17px", "#333333");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/ul/li[4]/span", "04. VẬN CHUYỂN", "17px", "#333333");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/ul/li[5]/span", "05. THANH TOÁN", "17px", "#333333");
        
        //- Thuộc tính table ( color: #333333; font-size: 13px): 
        //""Sản phẩm"", ""Miêu tả sản phẩm"", ""Tình trạng hàng"", ""Đơn giá"", ""Số lượng"", ""Tổng"", ""Tổng thanh toán:""
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[1]", "Sản phẩm", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[2]", "Miêu tả sản phẩm", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[3]", "Tình trạng hàng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[4]", "Đơn giá", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[5]", "Số lượng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[7]", "Tổng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot[1]/tr/td[2]", "Tổng thanh toán:", "13px", "#333333");
        
        //- button ""Tiếp tục đơn hàng"": color #FFFFFF, background-color: #ff0000; height: 45px; width: 209px;
        HamDungChung.Test_AttributeHTML("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/a/input", "value", "Tiếp tục đơn hàng");
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/a/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/a/input", "#ff0000");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/a/input", "height", "45px");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[2]/div[3]/div/a/input", "width", "209px");
        
        
        driver.close();
    }
        
        
        
       
    
    
}
