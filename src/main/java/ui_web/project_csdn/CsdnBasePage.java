package ui_web.project_csdn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui_web.base.BasePage;

/**
 * @description:
 * @time: 2021/2/19 22:32
 */
public class CsdnBasePage extends BasePage {
    /**
     * @Description: 启动浏览器
     * @param:	URL
     * @param:	server
     * @Return:
     * @Date: 2021/2/19 23:55
     **/
    public CsdnBasePage(String URL, String server) {
        super(URL, server);
    }

    /**
     * @Description: 传递driver
     * @param:	driver
     * @Return:
     * @Date: 2021/2/19 23:55
     **/
//    public CsdnBasePage(WebDriver driver) {
//        super(driver);
//    }
}
