package ui_web.project_csdn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @time: 2021/3/12 23:05
 */
class CsdnT01_MainPageTestCase {

    static CsdnT01_MainPage csdnMainPage = null;

    @BeforeAll
    public static void setUp(){
        csdnMainPage = new CsdnT01_MainPage();
    }
    @AfterAll
    public static void tearDown(){
        csdnMainPage.quit();
    }

    @Test
    public void case02001_searchOperation_TestCase(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        csdnMainPage.searchOperation("你好，李焕英！");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}