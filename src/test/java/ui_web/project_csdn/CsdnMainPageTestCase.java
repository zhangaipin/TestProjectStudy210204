package ui_web.project_csdn;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @time: 2021/2/21 22:37
 */
public class CsdnMainPageTestCase {
    CsdnMainPage csdnMainPage = null;
    @BeforeEach
    public void setUp(){
        csdnMainPage = new CsdnMainPage();
    }

    @AfterEach
    public void tearDown(){
        csdnMainPage.quit();
    }

    @Test
    public void toLoginPage(){
        csdnMainPage.toLoginPage();
    }
    @Test
    public void toLogin(){
        csdnMainPage.toBlogMainPage();
    }
}