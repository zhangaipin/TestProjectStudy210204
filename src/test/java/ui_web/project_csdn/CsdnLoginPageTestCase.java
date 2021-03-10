package ui_web.project_csdn;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @time: 2021/2/21 23:00
 */
public class CsdnLoginPageTestCase {
    static CsdnLoginPage csdnLoginPage = null;
    static CsdnMainPage csdnMainPage = null;
    @BeforeAll
    public static void setUp() {
        csdnMainPage = new CsdnMainPage();
    }

    @AfterAll
    public static void tearDown() {
        csdnMainPage.quit();
    }

    @Test
    public void toLogin(){
        csdnLoginPage = csdnMainPage.toLoginPage();//
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
//
////        csdnMainPage.toLoginPage();
////        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
//
        csdnLoginPage.toUserPwdLoginTab();
        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
//
//        csdnLoginPage.toLogin();
//        try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

    }
}