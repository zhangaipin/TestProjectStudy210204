package baiduforjenkins;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @time: 2021/2/4 23:39
 */
public class BaiDuPageTestCase {
    static BaiDuPage baiDuPage = null;
    @BeforeAll
    public static void setUp() {
        baiDuPage = new BaiDuPage();
    }

    @Test
    void addMethodTest() {
        int num = baiDuPage.addMethod(4,7);
        assertEquals(num,11);
    }

    @Test
    void lessMethodTest() {
        int num = baiDuPage.lessMethod(11,3);
        assertEquals(num,8);
    }
}
