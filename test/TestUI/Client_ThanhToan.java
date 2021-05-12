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
public class Client_ThanhToan{
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_ThanhToan() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/checkout.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();

        //2. - Tiêu đề ""THANH TOÁN | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("THANH TOÁN | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/form/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Phương Thức Thanh Toán"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/form/div[1]/div/div/span[2]", "Phương Thức Thanh Toán", "15px", "#777777");
        
        
        //- text ""01. GIỎ HÀNG"", ""02. ĐĂNG NHẬP"", ""03. ĐỊA CHỈ"", ""04. VẬN CHUYỂN"": size 17px; color: #B5B5B5;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/form/div[2]/div[2]/div[1]/ul/li[1]/span/a", "01. GIỎ HÀNG", "17px", "#b5b5b5");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/form/div[2]/div[2]/div[1]/ul/li[2]/span/a", "02. ĐĂNG NHẬP", "17px", "#b5b5b5");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/form/div[2]/div[2]/div[1]/ul/li[3]/span/a", "03. ĐỊA CHỈ", "17px", "#b5b5b5");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/form/div[2]/div[2]/div[1]/ul/li[4]/span/a", "04. VẬN CHUYỂN", "17px", "#b5b5b5");
        
        //- text ""05. THANH TOÁN"": size 17px; color #FFFFFF
        HamDungChung.Test_TextSizeColor("//*[@id=\"step_end\"]/span", "05. THANH TOÁN", "17px", "#ffffff");
        
        //- Các thuộc tính label của form (size 13px, color #333333): 
        //""Sản phẩm"", ""Miêu tả sản phẩm"", ""Tình trạng hàng"", ""Đơn giá"", ""Số lượng"", ""Tổng"", ""Tạm tính"", 
        //""Chi phí gói quà"", ""Phí vận chuyển"", ""Khuyến mãi"", ""Địa chỉ giao hàng"", ""Số điện thoại"", ""Người nhận""
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[1]", "Sản phẩm", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[2]", "Miêu tả sản phẩm", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[3]", "Tình trạng hàng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[4]", "Đơn giá", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[5]", "Số lượng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/thead/tr/th[6]", "Tổng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[1]/td[1]", "Tạm tính", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[2]/td[1]", "Chi phí gói quà", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[3]/td[1]", "Phí vận chuyển", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[4]/td[1]", "Khuyến mãi", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[6]/td[1]", "Địa chỉ giao hàng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[7]/td[1]", "Số điện thoại", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[8]/td[1]", "Người nhận", "13px", "#333333");
        
        //- text ""TỔNG THANH TOÁN"": color: #555454; font-size: 18px;
        HamDungChung.Test_TextSizeColor("//*[@id=\"cart-summary\"]/tfoot/tr[5]/td[1]/span", "TỔNG THANH TOÁN", "18px", "#555454");
        
        //- button ""THANH TOÁN KHI NHẬN HÀNG (COD)"": background-color #332e2e; font-size: 17px; color: #333333;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/form/div[2]/div[3]/div/div[4]/a", "THANH TOÁN KHI NHẬN HÀNG (COD)", "17px", "#333333");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/form/div[2]/div[3]/div/div[4]/a", "#332e2e");
        
        //- button ""ĐẶT HÀNG"": size 14px, color #FFFFFF, background-color #FF0000 
        HamDungChung.Test_AttributeHTML("/html/body/section[2]/div/form/div[2]/div[4]/div/input", "value","ĐẶT HÀNG");
        HamDungChung.Test_FontSize("/html/body/section[2]/div/form/div[2]/div[4]/div/input", "14px");
        HamDungChung.Test_Color("/html/body/section[2]/div/form/div[2]/div[4]/div/input", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/form/div[2]/div[4]/div/input", "#ff0000");
        
        driver.close();
    }
        
        
        
       
    
    
}
