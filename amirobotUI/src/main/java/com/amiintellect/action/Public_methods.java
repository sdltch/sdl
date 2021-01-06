package com.amiintellect.action;

import com.amiintellect.constant.Name_login;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class Public_methods {
    /**
     * 清除.点击.输入
     */
    public static String myclear(String clears,String data) throws Exception {
        Thread.sleep(500);
        Name_login.mydriver.findElement(By.xpath(clears)).clear();
        Name_login.mydriver.findElement(By.xpath(clears)).click();
        Name_login.mydriver.findElement(By.xpath(clears)).sendKeys(data);
        //keyboard(3, clears);
        return "1";
    }
    /**
     * 点击
     * myclick：xapth
     * */
    public static void myclick(String myclick) throws Exception {
        sleep(500);
        Name_login.mydriver.findElement(By.xpath(myclick)).click();
    }
    /**
     * 键盘事件
     * keyboards：1：回车；2:空格
     * keyboards：xpath
     */
    public static void mykeyboard(String keyboards,int number) throws Exception {
        sleep(500);
        Actions actions = new Actions(Name_login.mydriver);
        switch (number){
            case 1 :
                //回车
                Name_login.mydriver.findElement(By.xpath(keyboards)).sendKeys(Keys.ENTER);
                break;
            case 2 :
                //空格
                Name_login.mydriver.findElement(By.xpath(keyboards)).sendKeys(Keys.SPACE);
                break;
            case 3 :
                //ctrl+c
                actions.sendKeys(Name_login.mydriver.findElement(By.xpath(keyboards)),Keys.CONTROL,"c").perform();
                //等同ctrl+c
                Name_login.mydriver.findElement(By.xpath(keyboards)).sendKeys(Keys.CONTROL,"c");
                break;
            default :
                System.out.println("没有类型为:” "+number+" “的键盘事件?");
        }
    }
    /**
     * 鼠标事件
     * number:1:左键单击；2：右键单击；3：双击；
     * soldFor:xpath
     */
    public static void myactions(String soldFor,int number) throws Exception {
        sleep(500);
        Actions actions = new Actions(Name_login.mydriver);
        switch (number){
            case 1 :
                //鼠标左键单击 soldFor为定义到的元素
                actions.clickAndHold(Name_login.mydriver.findElement(By.xpath(soldFor))).perform();
                break;
            case 2 :
                //鼠标右击单击 soldFor为定位到的元素
                actions.contextClick(Name_login.mydriver.findElement(By.xpath(soldFor))).perform();
                break;
            case 3 :
                //鼠标双击 soldFor为定义到的元素
                actions.doubleClick(Name_login.mydriver.findElement(By.xpath(soldFor))).perform();
            default :
                System.out.println("没有类型为: "+number+" 的鼠标事件?");
        }
    }
    /**
     * 下拉框事件
     * ropdownxpath:xapth
     * ropdowns:值
     */
    public static void mydropdown(String ropdownxpath ,String ropdowns) throws Exception {
        sleep(500);
        Name_login.mydriver.findElement(By.xpath(ropdownxpath)).clear();
        WebElement element = Name_login.mydriver.findElement(By.xpath(ropdownxpath));
        Select select = new Select(element);
        select.selectByVisibleText(ropdowns);//根据选项text属性值选择
        //select.selectByIndex(2);//通过下拉列表中选项的索引选中第二项
        //select.selectByValue("重庆");//通过下拉列表中的选项的value属性选中"重庆"这一项
        //遍历一下下拉列表所有选项
//        for(WebElement e : select.getOptions()){
//            e.click();
//        }
    }
    /**
     * 上传事件
     * dropupload:xpath;
     * pathupload:文件路径
     */
    public static void mydropupload(String dropupload,String pathupload) throws Exception {
        sleep(500);
        Name_login.mydriver.findElement(By.xpath(dropupload)).sendKeys(pathupload);
    }
}
