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
public class Client_LoaiSanPham {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_LoaiSanPham() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/shop-gird.php?maLoai=1");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""GIÀY ADIDAS"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "GIÀY ADIDAS", "15px", "#777777");
        
        //- img banner: height 217px
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[1]/div/img", "height", "217px");
        
        //- text ""GIÀY ADIDAS"": size 18px, color #555454
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[2]/h1/span[1]", "GIÀY ADIDAS", "18px", "#555454");
        
        //- text ""MỤC LỤC"": font-size: 18px; color: #3a3d42;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/h2", "MỤC LỤC", "18px", "#3a3d42");
        
        //- text ""SIZE"": color: #333333; font-size: 14px;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[1]/div[3]/span", "SIZE", "14px", "#333333");
        
        //- text ""TAGS"": font-size: 18px; color: #3a3d42;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/div[2]/h2", "TAGS", "18px", "#3a3d42");
        
        //- text tên sản phẩm: color: #000000; font-size: 14px;
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[2]/div[2]/div/ul/li[1]/div/div[2]/a/span", "#000000");
        HamDungChung.Test_FontSize("/html/body/section[2]/div/div[2]/div[2]/div[2]/div/ul/li[1]/div/div[2]/a/span", "14px");
        
        //- text giá sản phẩm: color: #ff5858; font-size: 18px;
        HamDungChung.Test_Color("/html/body/section[2]/div/div[2]/div[2]/div[2]/div/ul/li[1]/div/div[2]/div[2]/span", "#ff5858");
        HamDungChung.Test_FontSize("/html/body/section[2]/div/div[2]/div[2]/div[2]/div/ul/li[1]/div/div[2]/div[2]/span", "18px");
        
        //- button ""Sắp xếp"": background-color: #f7f2ec; height: 30px;
        HamDungChung.Test_AttributeHTML("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[3]/div/form/input", "value", "Sắp xếp");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[3]/div/form/input", "#f7f2ec");
        HamDungChung.Test_CSSValue("/html/body/section[2]/div/div[2]/div[2]/div[1]/div[3]/div/form/input", "height", "30px");
        
        
        driver.close();
    }
        
        
        
       
    
    
}
