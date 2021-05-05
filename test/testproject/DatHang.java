/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import static ADMIN.DangNhapAdmin.LoginAdminAndToPage;
import org.testng.annotations.Test;

/**
 *
 * @author Asus
 */
public class DatHang {
    public DatHang(){}
    @Test
    public static void check() throws InterruptedException, Exception {
        LoginAdminAndToPage("http://localhost:8080/web2general/admin/pages/userlist.php");
    }
}
