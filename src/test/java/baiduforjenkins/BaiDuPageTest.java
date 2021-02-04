package baiduforjenkins;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @time: 2021/2/4 23:39
 */
class BaiDuPageTest {git
    static BaiDuPage baiDuPage = null;
    @BeforeAll
    public static void setUp() {
        baiDuPage = new BaiDuPage();
    }

    @Test
    void addMethod() {
        int num = baiDuPage.addMethod(4,7);
        assertEquals(num,11);
    }

    @Test
    void lessMethod() {
        int num = baiDuPage.lessMethod(11,3);
        System.out.println(num);
        assertEquals(num,12);
    }
}