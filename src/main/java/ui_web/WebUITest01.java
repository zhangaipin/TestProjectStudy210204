package ui_web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui_web.base.BasePage;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @time: 2021/2/19 22:45
 */
public class WebUITest01 {
    public static final Logger Log = LoggerFactory.getLogger(WebUITest01.class);
    ChromeOptions options;
    WebDriver driver;
    WebDriverWait wait;

    public void testUI(String URL) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        options = new ChromeOptions();
        //制定启动需要带的一些参数，适用于服务器
        options.addArguments("--lang=zh_CN.UTF-8");
        options.addArguments("start-maximized"); // 最大化运行（全屏窗口）,不设置，可能取元素会报错
        options.addArguments("disable-infobars"); // 隐藏启动浏览器出现‘Chrome正在受到自动软件的控制’提示
        options.addArguments("--disable-extensions"); // 禁止扩展
        options.addArguments("--disable-gpu"); // applicable to windows os only谷歌文档提到需要加上这个属性来规避bug
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        wait=new WebDriverWait(driver, 15);
        Log.info("测试开始，浏览器启动！");
        driver.get(URL);
        String title = driver.getTitle();
        System.out.println("获取的页面标题为："+title);
//        去往登录/注册页面
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='csdn-toolbar']/div/div/div[3]/div/div[1]")).click();


        //        切换为账号和密码登录
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div[2]/div[5]/ul/li[2]")).click();

        Thread.sleep(3000);
        String wangjimima = driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div[2]/div[5]/div/div[5]/div/a")).getText();
        System.out.println("wangjimima为："+wangjimima);

        Thread.sleep(3000);
        driver.quit();

    }

    public static void main(String[] args) throws InterruptedException {
        String URL = "https://www.csdn.net/";
        new WebUITest01().testUI(URL);
    }

}
