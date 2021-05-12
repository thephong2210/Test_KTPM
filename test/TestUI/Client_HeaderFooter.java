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
public class Client_HeaderFooter {
   
    @After
    public void afterClass(){
        driver.close();
    }

    @Test
    public static void Test_Header(){

        //"- Header top: background-color #363636;
        HamDungChung.Test_BackgroundColor("/html/body/div", "#363636");
       
        //- text ""CHÀO MỪNG ĐẾN VỚI"": size 11px, color #FFFFFF
        HamDungChung.Test_TextSizeColor("/html/body/div/div/div/div[1]/div/div", "CHÀO MỪNG ĐẾN VỚI B.STORE", "11px", "#ffffff");
        
        //- span ""B.STORE"": size 11px, color #FF4F4F
        HamDungChung.Test_TextSizeColor("/html/body/div/div/div/div[1]/div/div/span", "B.STORE", "11px", "#ff4f4f");
        
        //- text ""KIỂM TRA ĐƠN HÀNG"": size 11px, color #FFFFFF
        HamDungChung.Test_TextSizeColor("/html/body/div/div/div/div[2]/div/nav/ul/li[1]/a", "KIỂM TRA ĐƠN HÀNG", "11px", "#ffffff");
        
        //- text ""GIỎ HÀNG"": size 11px, color #FFFFFF
        HamDungChung.Test_TextSizeColor("/html/body/div/div/div/div[2]/div/nav/ul/li[2]/a", "GIỎ HÀNG", "11px", "#ffffff");
        
        //- text ""ĐĂNG NHẬP: size 11px, color #FFFFFF (chỉ test nếu chưa đăng nhập)
        String textDangNhap = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/nav/ul/li[3]/a")).getText();
        if (textDangNhap.equals("ĐĂNG NHẬP")){
            HamDungChung.Test_FontSize("/html/body/div/div/div/div[2]/div/nav/ul/li[3]/a", "11px");
            HamDungChung.Test_Color("/html/body/div/div/div/div[2]/div/nav/ul/li[3]/a", "#ffffff");
        }
        
        //- div logo: width 188px; padding-top: 25px; float: left; margin-bottom: 25px
        HamDungChung.Test_CSSValue("/html/body/section[1]/div/div/div/div[1]", "width", "188px");
        HamDungChung.Test_CSSValue("/html/body/section[1]/div/div/div/div[1]", "float", "left");
        HamDungChung.Test_CSSValue("/html/body/section[1]/div/div/div/div[1]", "margin-bottom", "25px");
        
        //- input tìm kiếm: color: #333; font-size: 13px; min-height: 41px; width: 365px; background-color: #ffffff
        HamDungChung.Test_Color("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]", "#333333");
        HamDungChung.Test_FontSize("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]", "13px");
        HamDungChung.Test_CSSValue("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]", "min-height", "41px");
        HamDungChung.Test_BackgroundColor("/html/body/section[1]/div/div/div/div[3]/form/div/input[1]", "#ffffff");
        
        //- button ""Tìm kiếm"": color:  #FFFFFFF; background-color: #FF0000; height: 45px
        HamDungChung.Test_AttributeHTML("//*[@id=\"search\"]", "value", "Tìm kiếm");
        HamDungChung.Test_Color("//*[@id=\"search\"]", "#ffffff");
        HamDungChung.Test_BackgroundColor("//*[@id=\"search\"]", "#ff0000");
        HamDungChung.Test_CSSValue("//*[@id=\"search\"]", "height", "45px");
        
        //- Header mid: background-color #EBEBEB
        HamDungChung.Test_BackgroundColor("/html/body/section[1]", "#ebebeb");
        
        //- Main menu: background-color: #3A3D42; height: 55px
        HamDungChung.Test_BackgroundColor("/html/body/header", "#3a3d42");
        HamDungChung.Test_CSSValue("/html/body/header", "height", "55px");
        
        //+ thẻ li a: color: #ffffff; font-family: 'Bitter', serif; size: 14px; line-height: 55px; padding: 0 18px 
        //(các text ""TRANG CHỦ"", ""GIÀY ADIDAS"", ""GIÀY NIKE"", ""GIÀY CONVERSE"", ""GIÀY VANS"", ""GIÀY ASICS"", ""KHÁC"")
       
        MenuOptionTest("/html/body/header/div/div/div[2]/div/nav/ul/li[1]/a", "TRANG CHỦ");
        MenuOptionTest("/html/body/header/div/div/div[2]/div/nav/ul/li[2]/a", "GIÀY ADIDAS");
        MenuOptionTest("/html/body/header/div/div/div[2]/div/nav/ul/li[3]/a", "GIÀY NIKE");
        MenuOptionTest("/html/body/header/div/div/div[2]/div/nav/ul/li[4]/a", "GIÀY CONVERSE");
        MenuOptionTest("/html/body/header/div/div/div[2]/div/nav/ul/li[5]/a", "GIÀY VANS");
        MenuOptionTest("/html/body/header/div/div/div[2]/div/nav/ul/li[6]/a", "GIÀY ASICS");
        MenuOptionTest("/html/body/header/div/div/div[2]/div/nav/ul/li[7]/a", "KHÁC");
        
        //+ text ""GIỎ HÀNG"" : size 12px; color: #ffffff;
        HamDungChung.Test_TextSizeColor("/html/body/header/div/div/div[1]/div/div/a/b", "GIỎ HÀNG", "12px", "#ffffff");
        
    }
    
    public static void MenuOptionTest(String xPath, String optionName){
        HamDungChung.Test_Text(xPath, optionName);
        HamDungChung.Test_Color(xPath, "#ffffff");
        HamDungChung.Test_CSSValue(xPath,"font-family", "Bitter, serif");
        HamDungChung.Test_CSSValue(xPath,"line-height", "55px");
    }
    
    @Test
    public static void Test_Footer(){

        //"- footer top: background-color #2D3035;
        if (driver.findElement(By.xpath("/html/body/section[4]")).isDisplayed()){
            HamDungChung.Test_BackgroundColor("/html/body/section[4]", "#2d3035");
            
            //- newsletter area: background: #ff4f4f;
            HamDungChung.Test_BackgroundColor("/html/body/section[4]/div/div/div/div[1]/div/div[1]", "#ff4f4f");

            //+ text ""ĐĂNG KÝ NHẬN TIN"": font-size: 18px; color: #fff;
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[1]/div/div[1]/h2", "ĐĂNG KÝ NHẬN TIN", "18px", "#ffffff");

            //+ text ""Đăng ký để nhận cập nhật sản phẩm hằng ngày cũng như khuyến mãi hấp dẫn."": color: #fff; font-size: 12px;
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[1]/div/div[1]/p", "Đăng ký để nhận cập nhật sản phẩm hằng ngày cũng như khuyến mãi hấp dẫn.", "12px", "#ffffff");

            //+ input nhập email: background: #FBFBFB; font-size: 13px;
            HamDungChung.Test_BackgroundColor("/html/body/section[4]/div/div/div/div[1]/div/div[1]/form/div/input[1]", "#fbfbfb");
            HamDungChung.Test_FontSize("/html/body/section[4]/div/div/div/div[1]/div/div[1]/form/div/input[1]", "13px");

            //+ button ""ĐĂNG KÝ"": background-color: #FF0000; height: 45px; width: 209px;
            HamDungChung.Test_AttributeHTML("/html/body/section[4]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "value", "ĐĂNG KÝ");
            HamDungChung.Test_BackgroundColor("/html/body/section[4]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "#ff0000");
            HamDungChung.Test_CSSValue("/html/body/section[4]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "height", "45px");
            HamDungChung.Test_CSSValue("/html/body/section[4]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "width", "209px");

            //- text ""GIỚI THIỆU"", ""THÔNG TIN CỬA HÀNG"", ""DANH MỤC"", ""THÔNG TIN"", ""TÀI KHOẢN CỦA TÔI"": color: #ffffff; font-size: 18px;
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[2]/div[1]/div/div[1]/div/h2", "GIỚI THIỆU", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[2]/div[1]/div/div[2]/div/h2", "THÔNG TIN CỬA HÀNG", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[2]/div[2]/div/div[1]/div/div/h2", "DANH MỤC", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[2]/div[2]/div/div[2]/div/div/h2", "THÔNG TIN", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[2]/div[2]/div/div[3]/div/div/h2", "TÀI KHOẢN CỦA TÔI", "18px", "#ffffff");

            //- text ""B.STORE được thành lập vào năm 2020. Nhằm giúp các bạn có thể mua được những đôi giày chất lượng tốt và chính hãng."": size 12px, color #FFFFFF
            HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[2]/div[1]/div/div[1]/div/p", "B.STORE được thành lập vào năm 2020. Nhằm giúp các bạn có thể mua được những đôi giày chất lượng tốt và chính hãng.", "12px", "#ffffff");

            
        }else if (driver.findElement(By.xpath("/html/body/section[6]")).isDisplayed()){
            HamDungChung.Test_BackgroundColor("/html/body/section[6]", "#2d3035");
            
            //- newsletter area: background: #ff4f4f;
            HamDungChung.Test_BackgroundColor("/html/body/section[6]/div/div/div/div[1]/div/div[1]", "#ff4f4f");

            //+ text ""ĐĂNG KÝ NHẬN TIN"": font-size: 18px; color: #fff;
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[1]/div/div[1]/h2", "ĐĂNG KÝ NHẬN TIN", "18px", "#ffffff");

            //+ text ""Đăng ký để nhận cập nhật sản phẩm hằng ngày cũng như khuyến mãi hấp dẫn."": color: #fff; font-size: 12px;
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[1]/div/div[1]/p", "Đăng ký để nhận cập nhật sản phẩm hằng ngày cũng như khuyến mãi hấp dẫn.", "12px", "#ffffff");

            //+ input nhập email: background: #FBFBFB; font-size: 13px;
            HamDungChung.Test_BackgroundColor("/html/body/section[6]/div/div/div/div[1]/div/div[1]/form/div/input[1]", "#fbfbfb");
            HamDungChung.Test_FontSize("/html/body/section[6]/div/div/div/div[1]/div/div[1]/form/div/input[1]", "13px");

            //+ button ""ĐĂNG KÝ"": background-color: #FF0000; height: 45px; width: 209px;
            HamDungChung.Test_AttributeHTML("/html/body/section[6]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "value", "ĐĂNG KÝ");
            HamDungChung.Test_BackgroundColor("/html/body/section[6]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "#ff0000");
            HamDungChung.Test_CSSValue("/html/body/section[6]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "height", "45px");
            HamDungChung.Test_CSSValue("/html/body/section[6]/div/div/div/div[1]/div/div[1]/form/div/input[2]", "width", "209px");

            //- text ""GIỚI THIỆU"", ""THÔNG TIN CỬA HÀNG"", ""DANH MỤC"", ""THÔNG TIN"", ""TÀI KHOẢN CỦA TÔI"": color: #ffffff; font-size: 18px;
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[2]/div[1]/div/div[1]/div/h2", "GIỚI THIỆU", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[2]/div[1]/div/div[2]/div/h2", "THÔNG TIN CỬA HÀNG", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[2]/div[2]/div/div[1]/div/div/h2", "DANH MỤC", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[2]/div[2]/div/div[2]/div/div/h2", "THÔNG TIN", "18px", "#ffffff");
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[2]/div[2]/div/div[3]/div/div/h2", "TÀI KHOẢN CỦA TÔI", "18px", "#ffffff");

            //- text ""B.STORE được thành lập vào năm 2020. Nhằm giúp các bạn có thể mua được những đôi giày chất lượng tốt và chính hãng."": size 12px, color #FFFFFF
            HamDungChung.Test_TextSizeColor("/html/body/section[6]/div/div/div/div[2]/div[1]/div/div[1]/div/p", "B.STORE được thành lập vào năm 2020. Nhằm giúp các bạn có thể mua được những đôi giày chất lượng tốt và chính hãng.", "12px", "#ffffff");

        }
        
        
        
    }
    
    
    
}
