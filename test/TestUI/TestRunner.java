/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 *
 * @author ADMIN
 */
public class TestRunner {
    
    public static void TestClass(Class className){
        Result result = JUnitCore.runClasses(className);
        	
        for (Failure failure : result.getFailures()) {
           System.out.println(failure.toString());
        }
		
        System.out.println(result.wasSuccessful());  
    }
    
    public static void main(String[] args){
        //Admin
        TestClass(Admin_QuanLyDanhMucSP.class);
        TestClass(Admin_QuanLyDonHang.class);
        TestClass(Admin_QuanLyQuanTriVien.class);
        TestClass(Admin_ThongKeTheoThang.class);
        TestClass(Admin_TrangChu.class);
        TestClass(Admin_TrangDangNhap.class);
        TestClass(Admin_QuanLyDonHang.class);
        TestClass(Admin_QuanLyHoaDon.class);
        TestClass(Admin_QuanLySanPham.class);
        TestClass(Admin_ThongKeTheoSanPham.class);
        
        //Client
//        TestClass(Client_ChiTietSanPham.class);
//        TestClass(Client_DangKy.class);
//        TestClass(Client_DangNhap.class);
//        TestClass(Client_GioHang.class);
//        TestClass(Client_KetQuaTimKiem.class);
//        TestClass(Client_KiemTraDiaChi.class);
//        TestClass(Client_LichSuDonHang.class);
//        TestClass(Client_LoaiSanPham.class);
//        TestClass(Client_TaiKhoanCuaToi.class);
//        TestClass(Client_ThanhToan.class);
//        TestClass(Client_ThongTinCaNhan.class);
//        TestClass(Client_ThongTinVanChuyen.class);
//        TestClass(Client_TrangChu.class);
        
    }
    
    
}
