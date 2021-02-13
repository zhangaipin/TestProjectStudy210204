package ui_web.project_ceshiren;

import org.openqa.selenium.By;

/**
 * @description:测试人网址主页
 * @time: 2021/2/12 23:04
 */
public class CeshirenMainPage extends CeshirenBasePage{

    private static final String URL = "https://ceshiren.com/";
//    private By latestButtonBy = By.linkText("最新");
//    private By topButtonBy = By.linkText("热门");
//    private By essencesButtonBy = By.linkText("精华帖");

    private By latestButtonBy = By.xpath("//*[@id=\"ember1070\"]");
    private By topButtonBy = By.xpath("//*[@id=\"ember1072\"]");
    private By essencesButtonBy = By.xpath("//*[@id=\"ember1074\"]");
    private By searchBtu = By.xpath("//*[@id=\"search-button\"]");
    private By searchText = By.xpath("//*[@id=\"search-term\"]");

    /**
     * @Description: 启动浏览器，进去测试人网址主页
     * @param:	URL
     * @Return:
     * @Date: 2021/2/12 23:16
     **/
    public CeshirenMainPage() {
        super(URL);
        Log.info("进入URL:" + URL);
    }

    /**
     * @Description: 点击最新按钮
     * @param:	latestLinkText
     * @Return: ui_web.project_ceshiren.CeshirenMainPage
     * @Date: 2021/2/12 23:18
     **/
    public CeshirenMainPage toLatest() {
        click(latestButtonBy);
        Log.info("点击最新按钮");
        return this;
    }

    /**
     * @Description: 跳转至最新页面
     * @param:
     * @Return: ui_web.project_ceshiren.CeshirenMainPage
     * @Date: 2021/2/13 13:03
     **/
    public CeshirenMainPage toTop() {
        click(topButtonBy);
        Log.info("点击热门按钮");
        return this;
    }

    /**
     * @Description: 跳转至精华帖页面
     * @param:
     * @Return: ui_web.project_ceshiren.CeshirenMainPage
     * @Date: 2021/2/13 13:03
     **/
    public CeshirenMainPage toEssences() {
        click(essencesButtonBy);
        Log.info("点击精华帖按钮");
        return this;
    }

    public CeshirenMainPage toSearch() {
        click(searchBtu);
        Log.info("点击搜索按钮");
        return this;
    }

    public CeshirenMainPage sendkeysToSearch() {
        click(searchText);
        sendKeys(searchText, "你好");
        Log.info("输入搜索内容");
        return this;
    }

}
