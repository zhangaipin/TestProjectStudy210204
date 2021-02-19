package ui_web.project_csdn;

import org.openqa.selenium.By;

/**
 * @description:
 * @time: 2021/2/19 23:28
 */
public class CsdnLoginPage extends CsdnBasePage{
    private By userPwdLoginBtu = By.xpath("//*[@class=\"text-tab border-right\"][2]");  //账号密码登录按钮
    private By userPwdLoginTabName = By.xpath("//*[@class=\"tab-one active\"]");    //登录的Tab标题

    /**
     * @Description: 点击账号密码登录按钮
     * @param:
     * @Return: String 用来断言使用
     * @Date: 2021/2/20 0:08
     *
     * @return*/
    public String toUserPwdLogin(){
        click(userPwdLoginBtu);
        Log.info("点击账号密码登录按钮");
        return getEleText(userPwdLoginTabName);
    }
}
