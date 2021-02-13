package ui_web.project_ceshiren;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @time: 2021/2/12 23:26
 */
public class CeshirenMainPageTestCase {
    static CeshirenMainPage ceshirenMainPage;

    @BeforeAll
    public static void setUp() {
        ceshirenMainPage = new CeshirenMainPage();
    }

    @AfterAll
    public static void tearDown() {
        ceshirenMainPage.quit();
    }

    @Test
    public void openURLTest() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ceshirenMainPage.toSearch();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ceshirenMainPage.sendkeysToSearch();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}