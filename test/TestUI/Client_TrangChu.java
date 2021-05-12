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
public class Client_TrangChu {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_TrangChu(){
        HamDungChung.OpenPage("http://localhost/web2general/");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề trang ""GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""SẢN PHẨM MỚI"", text ""SẢN PHẨM KHUYẾN MÃI"", text ""SẢN PHẨM KHUYẾN MÃI"", text ""SẢN PHẨM CỦA ADIDAS"", 
        //text ""SẢN PHẨM CỦA NIKE"", text ""TIN TỨC MỚI"", text ""THƯƠNG HIỆU & ĐỐI TÁC"": color: #3a3d42; font-size: 18px;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div/div[1]/h2", "SẢN PHẨM MỚI", "18px", "#3a3d42");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div/div[1]/h2", "SẢN PHẨM KHUYẾN MÃI", "18px", "#3a3d42");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[5]/div/div[1]/h2", "SẢN PHẨM CỦA ADIDAS", "18px", "#3a3d42");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[6]/div[1]/div[1]/h2", "SẢN PHẨM CỦA NIKE", "18px", "#3a3d42");
        HamDungChung.Test_TextSizeColor("/html/body/section[3]/div/div/div/div[1]/h2", "TIN TỨC MỚI", "18px", "#3a3d42");
        HamDungChung.Test_TextSizeColor("/html/body/section[4]/div/div/div/div[1]/h2", "THƯƠNG HIỆU & ĐỐI TÁC", "18px", "#3a3d42");
        
        //+ text tên sản phẩm: color: #000000; font-family: 'Bitter', serif; font-size: 14px;
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span", "#000000");
        HamDungChung.Test_FontSize("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span", "14px");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/a/span", "font-family", "Bitter, serif");
        
        //+ text giá sản phẩm: color: #ff5858; font-size: 18px;
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/span", "#ff5858");
        HamDungChung.Test_FontSize("/html/body/section[2]/div/div[2]/div[1]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/span", "18px");
        
        driver.close();
    }
        
        
        
       
    
    
}
