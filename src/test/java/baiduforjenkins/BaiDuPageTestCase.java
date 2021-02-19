package baiduforjenkins;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertAll(
                "计算结果验证不通过",
                ()-> assertEquals(1,1),
                ()-> assertEquals(1,2),
                ()-> assertEquals(2,2)
                );
    }

    @Test
    void lessMethodTest() {
        int num = baiDuPage.lessMethod(11,3);
        assertEquals(num,8);
    }
}
