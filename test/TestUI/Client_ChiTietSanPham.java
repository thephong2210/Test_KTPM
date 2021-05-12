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
public class Client_ChiTietSanPham {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_ChiTietSanPham() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/single-product.php?maSanPham=3");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề ""ADIDAS CONTINENTAL 80 BLACK RED | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("ADIDAS CONTINENTAL 80 BLACK RED | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""GIÀY ADIDAS"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a[2]", "GIÀY ADIDAS", "15px", "#333333");
        
        //- text ""ADIDAS CONTINENTAL 80 BLACK RED"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "ADIDAS CONTINENTAL 80 BLACK RED", "15px", "#777777");
        
        //- text tên sản phẩm: size 24px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/h2", "ADIDAS CONTINENTAL 80 BLACK RED", "24px", "#333333");
        
        //- text ""Mã sản phẩm: 3"": size 13px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[3]/p[1]", "Mã sản phẩm: 3", "13px", "#333333");
        
        //- text ""Tình trạng: Hàng mới"": size 13px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[3]/p[2]", "Tình trạng: Hàng mới", "13px", "#333333");
        
        //- button ""Còn hàng"": color: #ffffff; background-color: #5cb85c;
        HamDungChung.Test_Text("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[5]/div/p/button", "Còn hàng");
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[5]/div/p/button", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[5]/div/p/button", "#5cb85c");
        
        //- text giá sản phẩm: size 25px, color #FF5858
        HamDungChung.Test_FontSize("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2", "25px");
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/h2", "#ff5858");
        
        //- text ""Size:"", ""Số lượng:"": size 12px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/div/p", "Size:", "12px", "#333333");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/div/p", "Số lượng:", "12px", "#333333");
        
        //- button ""Thêm vào giỏ hàng"": size 13px; color #FFFFFF; background-color: #FF0000 ; height: 45px; width: 209px;
        HamDungChung.Test_AttributeHTML("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input", "value", "Thêm vào giỏ hàng");
        HamDungChung.Test_FontSize("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input", "13px");
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input", "#ff0000");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input","height" ,"45px");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[2]/div/div[7]/form/input","width" ,"209px");
        
        //- text ""SẢN PHẨM KHÁC"", ""TAGS"", ""SẢN PHẨM TƯƠNG TỰ"": size 18px, color #3a3d42
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/h2", "SẢN PHẨM KHÁC", "18px", "#3a3d42");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[2]/h2", "TAGS", "18px", "#3a3d42");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[3]/div[1]/div/h2", "SẢN PHẨM TƯƠNG TỰ", "18px", "#3a3d42");
        
        
        driver.close();
    }
        
        
        
       
    
    
}
