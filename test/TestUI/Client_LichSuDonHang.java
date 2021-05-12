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
public class Client_LichSuDonHang {
    
    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void Test_LichSuDonHang() throws Exception{
        DangNhapClient.LoginClientAndToPage("http://localhost/web2general/order_status.php");
        
        //"1. Kiểm tra Header và Footer
        Client_HeaderFooter.Test_Header();
        Client_HeaderFooter.Test_Footer();
        
        //2. - Tiêu đề trang ""TÀI KHOẢN CỦA TÔI | GIÀY B.STORE - Hệ thống giày thể thao chính hãng""
        HamDungChung.Test_Title("TÀI KHOẢN CỦA TÔI | GIÀY B.STORE - Hệ thống giày thể thao chính hãng");
        
        //- text ""TRANG CHỦ"": size 15px, color #333333
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/a", "TRANG CHỦ", "15px", "#333333");
        
        //- text ""Tải Khoản Của Tôi"", text ""Chi Tiết Và Lịch Sử Đơn Hàng"": size 15px, color #777777
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[2]", "Tải Khoản Của Tôi", "15px", "#777777");
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[1]/div/div/span[4]", "Chi Tiết Và Lịch Sử Đơn Hàng", "15px", "#777777");
        
        //- text ""CHI TIẾT VÀ LỊCH SỬ ĐƠN HÀNG"": size 18px, color #555454
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[1]/h2", "CHI TIẾT VÀ LỊCH SỬ ĐƠN HÀNG", "18px", "#555454");
        
        //- Các label table đơn hàng (size 13px, color #333333): ""STT"", ""Mã đơn hàng"", ""Ngày lập đơn hàng"", ""Tổng tiền đơn hàng"", ""Trạng thái đơn hàng"" 
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[1]", "STT", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[2]", "Mã đơn hàng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[3]", "Ngày lập đơn hàng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[4]", "Tổng tiền đơn hàng", "13px", "#333333");
        HamDungChung.Test_TextSizeColor("//*[@id=\"dataTables-example\"]/thead/tr/th[5]", "Trạng thái đơn hàng", "13px", "#333333");
        
        //- button ""TRỞ LẠI"": background: #ff4f4f, color: #fff; font-size: 13px;
        HamDungChung.Test_TextSizeColor("/html/body/section[2]/div/div[2]/div[4]/div/ul/li/a", "TRỞ LẠI", "13px", "#ffffff");
        HamDungChung.Test_BackgroundColor("/html/body/section[2]/div/div[2]/div[4]/div/ul/li/a", "#ff4f4f");
        
        driver.close();
    }
        
        
        
       
    
    
}
