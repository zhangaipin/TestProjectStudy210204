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
     * @Return:
     * @Date: 2021/2/12 22:39
     **/
    public BasePage(String chromeDriverPath, String URL) {
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        driver=new ChromeDriver();
        options = new ChromeOptions();
        options.addArguments("--lang=zh_CN.UTF-8");

        options.addArguments("--no-sandbox", "--disable-dev-shm-usage"); // Bypass OS security model, overcome limited resource problems

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
