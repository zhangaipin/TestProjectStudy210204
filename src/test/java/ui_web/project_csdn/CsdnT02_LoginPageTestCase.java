package ui_web.project_csdn;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @time: 2021/2/21 23:00
 */
public class CsdnT02_LoginPageTestCase {
    static CsdnT02_LoginPage csdnLoginPage = null;
    static CsdnT01_MainPage csdnMainPage = null;
    @BeforeAll
    public static void setUp() {
        csdnMainPage = new CsdnT01_MainPage();
    }

    @AfterAll
    public static void tearDown() {
        csdnMainPage.quit();
    }

    @Disabled("登录验证-账号密码登录")
    @Test
    public void case01001_toLogin_TestCase(){
        csdnLoginPage = csdnMainPage.toLoginPage();
        csdnLoginPage.toUserPwdLoginTab();
        boolean loginResult =  csdnLoginPage.toLogin();
        assertTrue(loginResult);
    }
}