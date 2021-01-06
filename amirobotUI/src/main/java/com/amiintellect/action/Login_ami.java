package com.amiintellect.action;

import com.amiintellect.constant.Name_login;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Login_ami {
    /**
     *  打开浏览器，登录rpa
     */
    public void mydriver() throws Exception {
        //对deriver进行配置
        System.setProperty("webdriver.chrome.driver", Name_login.RPA_GOOGLE);
        //新增一个预操作对象
        ChromeOptions options =new ChromeOptions();
        //chrome75及以下
        //options.addArguments("disable-infobars");
        //chrome76及以上
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        //必须禁用浏览器的保存密码选项：
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
//        将预操作对象加载到浏览器中
        System.out.println("当前打开");
        Name_login.mydriver = new ChromeDriver(options);
//        实例化一个Chrome浏览器的实例
//        Name_login.mydriver = new ChromeDriver();
//        设置打开的浏览器窗口最大化
        Name_login.mydriver.manage().window().maximize();
//        设置等待时间
        //设置页面加载时间15秒，
        Name_login.mydriver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        //获取页面元素的超时，隐式等待(implicitly_wait)
        Name_login.mydriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//        使用get()打开一个网站
        System.out.println("当前打开1");
        Name_login.mydriver.get(Name_login.RPA_URL);
//        getTitle()获取当前页面的title，
        System.out.println("当前打开页面的标题1： "+ Name_login.mydriver.getTitle());
        Thread.sleep(1000);
//        关闭浏览器
//        driver.quit();
    }
    /**
     * 登录
     */
    public void mylogin() throws Exception {
        //输入登录账号
        Public_methods.myclear(Name_login.RPA_LOGINNAME,"0215测试001");
        //输入登录密码
        Public_methods.myclear(Name_login.RPA_PASSWORD,"123456");
        //点击登录
        Public_methods.myclick(Name_login.RPA_LOGIN);
        Thread.sleep(1500);
        System.out.println("当前打开页面的标题2： "+Name_login.mydriver.getTitle());
        //判断元素是否存在
        boolean rpa_title = isJudgingElement("RPA_TITLE", By.partialLinkText(Name_login.RPA_TITLE));
        if (rpa_title == true){
            System.out.println("1：");
        }
        System.out.println("登录成功后的界面元素q：");
        String text = Name_login.mydriver.findElement(By.xpath(Name_login.RPA_TITLE)).getText();
        System.out.println("登录成功后的界面元素："+text);
        if (text.contains("货物申报")) {
            System.out.println("登录成功---true");
        } else {
            System.out.println("登录失败---fail");
        }
        //判断元素是否存在
        //isJudgingElement("RPA_TITLE",By.partialLinkText(Name_login.RPA_TITLE));
    }
    /**
     * 判断某个元素是否存在
     */
    public static boolean isJudgingElement(String data,By by) {
        try {
            Name_login.mydriver.findElement(by);
            return true;
        } catch (Exception e) {
            System.out.println("不存在此元素:RPA_TITLE");
            return false;
        }
    }
}
