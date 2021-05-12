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
public class Client_KetQuaTimKiem {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_KetQuaTimKiem() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/search-result.php?nameSearch=adidas&search=T%C3%ACm+ki%E1%BA%BFm");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
//        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề ""Kết quả tìm kiếm | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("Kết quả tìm kiếm | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text tên sản phẩm: color: #000000; font-size: 14px;
        HamDungChung.Test_Color("/html/body/div[2]/div[1]/ul/li[1]/div/div[2]/a", "#000000");
        HamDungChung.Test_FontSize("/html/body/div[2]/div[1]/ul/li[1]/div/div[2]/a", "14px");
        
        //- text giá sản phẩm: color: #ff5858; font-size: 18px;
        HamDungChung.Test_Color("/html/body/div[2]/div[1]/ul/li[1]/div/div[2]/div[2]/span", "#ff5858");
        HamDungChung.Test_FontSize("/html/body/div[2]/div[1]/ul/li[1]/div/div[2]/div[2]/span", "18px");

        driver.close();
    }
        
        
        
       
    
    
}
