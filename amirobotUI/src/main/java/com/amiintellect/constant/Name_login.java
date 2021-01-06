package com.amiintellect.constant;

import org.openqa.selenium.WebDriver;
//登录元素
public class Name_login{
    public static WebDriver mydriver;
    //启动googel路径
    public static final String RPA_GOOGLE = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver87\\chromedriver.exe";
    //登录地址
    public static final String RPA_URL ="http://develop.edge.customs.dev.amiintellect.com";
    //登录账号
    public static final String RPA_LOGINNAME= "//input[@id=\"loginName\"]";
    //登录密码
    public static final String RPA_PASSWORD = "//input[@id=\"password\"]";
    //登录
    public static final String RPA_LOGIN = "//div[@id=\"root\"]//button";
    //货物申报
    public static final String RPA_TITLE = "//li[2]/a";
    //海关特殊监管区域
    public static final String RPA_SAS = "//li[4]/a";
    //区外加工贸易
    public static final String RPA_EML = "//li[6]/a";
    //保税物流管理
    public static final String RPA_BWS = "//li[8]/a";
    //客户管理
    public static final String RPA_CUSTOMER = "//li[10]/a";
    //财务管理
    public static final String RPA_FINANCIAL = "//li[12]/a";
    //经营管理
    public static final String RPA_BUSINESS = "//li[14]/a";
    //系统管理
    public static final String RPA_SYSTEM = "//li[16]/a";

}
