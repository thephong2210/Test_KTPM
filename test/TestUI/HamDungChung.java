/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestUI;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import static testproject.DangKy.driver;

/**
 *
 * @author ADMIN
 */
public class HamDungChung {

    //Hàm kiểm thử text, size, color hex
    public static void Test_TextSizeColor(String xPath, String Text, String Size, String colorHex){
        String text = driver.findElement(By.xpath(xPath)).getText();
        String textSize = driver.findElement(By.xpath(xPath)).getCssValue("font-size");
        String textColor = driver.findElement(By.xpath(xPath)).getCssValue("color");
        String textColorHex = Color.fromString(textColor).asHex();
        Assert.assertEquals(Text, text);
        Assert.assertEquals(Size, textSize);
        Assert.assertEquals(colorHex, textColorHex);
    }
    
    //Hàm kiểm thử text
    public static void Test_Text(String xPath, String text){
        String textTest = driver.findElement(By.xpath(xPath)).getText();
        Assert.assertEquals(text, textTest);
    }
    
    //Hàm kiểm thử color hex
    public static void Test_BackgroundColor(String xPath, String colorHex){
        String colorTest = driver.findElement(By.xpath(xPath)).getCssValue("background-color");
        String colorTestHex = Color.fromString(colorTest).asHex();
        Assert.assertEquals(colorHex, colorTestHex);
    }
   
    
    //Hàm kiểm thử font-size
    public static void Test_FontSize(String xPath, String Size){
        String sizeTest = driver.findElement(By.xpath(xPath)).getCssValue("font-size");
        Assert.assertEquals(Size, sizeTest);
    }
    
    //Hàm kiểm thử color
    public static void Test_Color(String xPath, String colorString){
        String colorTest = driver.findElement(By.xpath(xPath)).getCssValue("color");
        String textColorHex = Color.fromString(colorTest).asHex();
        Assert.assertEquals(colorString, textColorHex);
    }
    
    //Hàm kiểm thử icon (class)
    public static void Test_Icon(String xPath, String iconString){
        String iconSP = driver.findElement(By.xpath(xPath)).getAttribute("class");
        Assert.assertEquals(iconString, iconSP);
    }
    
    //Hàm kiểm thử title trang
    public static void Test_Title(String Title){
        String textTitle = driver.getTitle();
        Assert.assertEquals(Title, textTitle);
    }
    
    //Hàm lấy attribute html tùy chọn
    public static void Test_AttributeHTML(String xPath, String attributeHTML, String attributeString){
        String attribute = driver.findElement(By.xpath(xPath)).getAttribute(attributeHTML);
        Assert.assertEquals(attributeString, attribute);
    }
    
    //Hàm lấy css value tùy chọn
    public static void Test_CSSValue(String xPath, String cssValue, String cssString){
        String cssGet = driver.findElement(By.xpath(xPath)).getCssValue(cssValue);
        Assert.assertEquals(cssString, cssGet);
    }
    
    public static void OpenPage(String urlString){
        System.out.println("Start");
        System.setProperty("webdriver.chrome.driver", "test\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        driver.get(urlString);
    }
    
    
    
}
