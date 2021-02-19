package ui_web.project_ceshiren;


import org.openqa.selenium.WebDriver;
import ui_web.base.BasePage;

/**
 * @description:    项目CeshirenBasePage
 * @time: 2021/2/12 22:49
 */
public class CeshirenBasePage extends BasePage {
    public CeshirenBasePage(String URL) {
        //todo:替换path相对路径，来适合远程Jenkins
        super(
                URL,
                "alibaba"
        );
    }

    public CeshirenBasePage(WebDriver driver) {
        super(driver);
    }
}
