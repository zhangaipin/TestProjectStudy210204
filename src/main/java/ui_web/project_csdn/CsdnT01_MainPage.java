package ui_web.project_csdn;

import org.openqa.selenium.By;
import ui_web.base.BasePage;

/**
 * @description:
 * @time: 2021/2/19 22:34
 */
public class CsdnT01_MainPage extends BasePage {
    private static final String URL = "https://www.csdn.net/";  //测试地址
    private static final String server = "local";       //测试服务器
//    private static final String server = "alibab";    //阿里服务器

    private By loginPageBtn = By.xpath("//*[@id='csdn-toolbar']/div/div/div[3]/div/div[1]");   //登录页面跳转按钮
    private By blogPageBtn = By.xpath("//*[@id='csdn-toolbar']/div/div/div[1]/ul/li[2]");  //跳转至博客页面

    /**
     * @Description: 启动浏览器，进去测试人网址主页
     * @param:	URL
     * @Return:
     * @Date: 2021/2/12 23:16
     **/
    public CsdnT01_MainPage() {
        super(URL, server);
        Log.info("进入URL:" + URL);
    }

    /**
     * @Description: 去跳转至登录页面
     * @param:
     * @Return: ui_web.project_csdn.CsdnLoginPage
     * @Date: 2021/2/19 23:28
     *
     * @return*/
    public CsdnT02_LoginPage toLoginPage(){
        click(loginPageBtn);
        Log.info("点击页面右上角:登录/注册 按钮");
        return new CsdnT02_LoginPage(driver);
    }

    /**
     * @Description: 跳转至登录页面
     * @param:
     * @Return: CsdnBlogMainPage
     * @Date: 2021/2/19 23:39
     *
     * @return*/
    public CsdnT01_MainPage toBlogMainPage(){
        click(blogPageBtn);
        Log.info("点击 博客 按钮");
        return this;
    }
}
