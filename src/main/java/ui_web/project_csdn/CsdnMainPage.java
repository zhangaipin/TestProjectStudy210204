package ui_web.project_csdn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @description:
 * @time: 2021/2/19 22:34
 */
public class CsdnMainPage extends CsdnBasePage{
    private static final String URL = "https://www.csdn.net/";  //测试地址
    private static final String server = "local";       //测试服务器
//    private static final String server = "alibab";    //阿里服务器


    private By loginPageBtn = By.xpath("//*[@class=\"toolbar-btn toolbar-btn-login csdn-toolbar-fl \"]");   //登录页面跳转按钮
    private By blogPageBtn = By.xpath("//*[@class=\"toolbar-menus csdn-toolbar-fl\"]/li[1]");  //跳转至博客页面

    /**
     * @Description: 启动浏览器，进去测试人网址主页
     * @param:	URL
     * @Return:
     * @Date: 2021/2/12 23:16
     **/
    public CsdnMainPage() {
        super(URL, server);
        String pageTitle = "CSDN - 专业开发者社区";
        if (pageTitle != getPageTitle()){
            Log.info("请先确认测试页面地址！");
            System.exit(0);
        }
        Log.info("进入URL:" + URL);
    }

    /**
     * @Description: 去跳转至登录页面
     * @param:
     * @Return: ui_web.project_csdn.CsdnLoginPage
     * @Date: 2021/2/19 23:28
     **/
    public CsdnLoginPage toLoginPage(){
        click(loginPageBtn);
        Log.info("点击登录/注册按钮");
        return new CsdnLoginPage();
    }

    /**
     * @Description: 跳转至登录页面
     * @param:
     * @Return: CsdnBlogMainPage
     * @Date: 2021/2/19 23:39
     **/
    public CsdnBlogMainPage toBlogMainPage(){
        click(blogPageBtn);
        Log.info("点击博客按钮");
        return new CsdnBlogMainPage();
    }
}
