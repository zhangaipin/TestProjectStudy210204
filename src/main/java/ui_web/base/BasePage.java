package ui_web.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @time: 2021/2/12 22:23
 */
public class BasePage {
    public static final Logger Log = LoggerFactory.getLogger(BasePage.class);
//    RemoteWebDriver driver;
    ChromeOptions options;
    WebDriver driver;
    WebDriverWait wait;

    /**
     * @Description: 启动浏览器，打开目标网址
     * @param:	chromeDriverPath driver驱动存放路径
     * @param:	URL 测试的目标网址
     * @param:	server 测试服务器，local和alibaba
     * @Return:
     * @Date: 2021/2/16 0:00
     **/
    public BasePage(String URL, String server){
        if (server.equals("local")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            options = new ChromeOptions();
            //制定启动需要带的一些参数，适用于服务器
            options.addArguments("--lang=zh_CN.UTF-8");
            options.addArguments("start-maximized"); // 最大化运行（全屏窗口）,不设置，可能取元素会报错
            options.addArguments("disable-infobars"); // 隐藏启动浏览器出现‘Chrome正在受到自动软件的控制’提示
            options.addArguments("--disable-extensions"); // 禁止扩展
            options.addArguments("--disable-gpu"); // applicable to windows os only谷歌文档提到需要加上这个属性来规避bug
            options.addArguments("--disable-dev-shm-usage");
        }else if (server.equals("alibaba")){
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
            options = new ChromeOptions();
            //制定启动需要带的一些参数，适用于服务器
            options.addArguments("--lang=zh_CN.UTF-8");
            options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors");
            options.addArguments("start-maximized"); // 最大化运行（全屏窗口）,不设置，可能取元素会报错
            options.addArguments("disable-infobars"); // 隐藏启动浏览器出现‘Chrome正在受到自动软件的控制’提示
            options.addArguments("--disable-extensions"); // 禁止扩展
            options.addArguments("--disable-gpu"); // applicable to windows os only谷歌文档提到需要加上这个属性来规避bug
            options.addArguments("--no-sandbox"); // //取消沙盘模式,为了让root用户也能执行
            options.addArguments("--disable-dev-shm-usage");
        }else {
            Log.info("开发中，请期待！");
            System.exit(0);
        }
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        wait=new WebDriverWait(driver, 15);
        Log.info("测试开始，浏览器启动！");
        driver.get(URL);
    }

    /**
     * @Description: 传递driver
     * @param:	driver
     * @Return:
     * @Date: 2021/2/12 22:37
     **/
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    /**
     * @Description: 浏览器退出操作
     * @param:
     * @Return: void
     * @Date: 2021/2/12 22:46
     **/
    public void quit(){
        Log.info("测试完成，浏览器退出！");
        driver.quit();
    }

    /**
     * @Description: 点击事件操作
     * @param:	by
     * @Return: void
     * @Date: 2021/2/12 22:45
     **/
    public void click(By by){
        //todo: 异常处理
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    /**
     * @Description: 点击事件
     * @param:	linkText 文字链接
     * @Return: void
     * @Date: 2021/2/13 13:00
     **/
    public void clickLinkText(String linkText){
        By linkTextBy = By.linkText(linkText);
        wait.until(ExpectedConditions.elementToBeClickable(linkTextBy));
        driver.findElement(linkTextBy).click();
        Log.info("点击 "+linkText+" 按钮");
    }

    /**
     * @Description: 发送内容操作
     * @param:	by
     * @param:	content
     * @Return: void
     * @Date: 2021/2/12 22:44
     **/
    public void sendKeys(By by, String content){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(content);
    }

    /**
     * @Description: 文件上传操作
     * @param:	by
     * @param:	path
     * @Return: void
     * @Date: 2021/2/12 22:44
     **/
    public void upload(By by, String path){
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).sendKeys(path);
    }
}
