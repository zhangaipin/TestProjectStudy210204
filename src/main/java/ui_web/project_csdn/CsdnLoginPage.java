package ui_web.project_csdn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui_web.base.BasePage;

/**
 * @description:
 * @time: 2021/2/19 23:28
 */
public class CsdnLoginPage extends BasePage {
    private By userPwdLoginBtn = By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div[5]/ul/li[2]");  //账号密码登录方式切换按钮
    private By userPwdLoginTabName = By.xpath("//*[@id='tabOne']");    //登录的Tab标题
    private By usernameText = By.xpath("//*[@id=\"all\"]"); //账号输入框
    private By passwordText = By.xpath("//*[@id=\"password-number\"]"); //密码输入框
    private By loginBtn = By.xpath("//*[@id='app']/div/div/div[1]/div[2]/div[5]/div/div[6]/div/button");  //登录按钮
    private By loginPageBtn = By.xpath("//*[@id='csdn-toolbar']/div/div/div[3]/div/div[1]");   //登录页面跳转按钮(当右上角的登录/注册按钮消失，说明已经在登录状态了)

    /**
     * @Description: 传递driver
     * @param:	driver
     * @Return:
     * @Date: 2021/3/7 21:46
     **/
    public CsdnLoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * @Description: 点击账号密码登录按钮
     * @param:
     * @Return: String 用来断言使用
     * @Date: 2021/2/20 0:08
     *
     * @return
     **/
    public String toUserPwdLoginTab(){
        String name = getEleText(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/span"));
        System.out.println(name);
        click(userPwdLoginBtn);
        Log.info("点击切换成为账号密码登录法方式");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getEleText(userPwdLoginTabName);
    }

    /**
     * @Description: 输入账号和密码，点击登录按钮
     * @param:
     * @Return: boolean
     * @Date: 2021/2/21 22:35
     **/
    public boolean toLogin(){
        click(usernameText);
        sendKeys(usernameText, "18868445878");
        click(passwordText);
        sendKeys(passwordText,"2979530@sunny");
        click(loginBtn);
        return isElementExist(loginPageBtn);
    }
}
