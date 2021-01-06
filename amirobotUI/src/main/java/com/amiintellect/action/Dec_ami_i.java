package com.amiintellect.action;

import com.amiintellect.constant.Name_dec;
import com.amiintellect.constant.Name_login;
import org.openqa.selenium.By;


import static java.lang.Thread.sleep;
/**
 *   货物申报进口
 * */
public class Dec_ami_i {
    /*
     * 货物申报上传
     * */
    public void dec_ImporteRcognition() throws Exception {
        //点击货物申报Name_login.RPA_TITLE
        Public_methods.myclick(Name_login.RPA_TITLE);
        //点击货物申报制单(进口)Name_dec.RPA_TITLE_Is
        Public_methods.myclick(Name_dec.RPA_TITLE_I);
        //上传文件按钮Name_dec.UPLOAD
        Public_methods.myclick(Name_dec.UPLOAD);
        //客户信息Name_dec.CUSTOMERINFORMATION
        Public_methods.myclear(Name_dec.CUSTOMERINFORMATION,"bgd001");
        Public_methods.mykeyboard(Name_dec.CUSTOMERINFORMATION,1);
        //委托单位Name_dec.ENTRUSTUNIT
//        String ddd = "很大方";
//        dropdown(ddd,Name_dec.ENTRUSTUNIT);
        //点击供应商Name_dec.SOME_SUPPLIERS
        Public_methods.myclick(Name_dec.SOME_SUPPLIERS);
        //供应商ame_dec.SUPPLIERN   (通过客户信息带出来的第一个数据）
        Public_methods.myclick(Name_dec.SUPPLIER);
        //获取所有的li
//        List<WebElement> element = Name_login.mydriver.findElements(By.xpath("//span[@class='ant-form-item-children']/div/div/div/div//li"));
//        for(WebElement element1:element){
//            element1.click();
//            sleep(500);
//            System.out.println("chengg ");
//        }
        //上传文件
        String sss = "D:\\amibook\\amisbook\\1货物表头\\货物\\发票.xls";
//        String location = "D:/amibook/amisbook/1货物表头/货物/发票.xls";
//        String sss = location.replaceAll("\\\\","//");


        //批量
        Public_methods.myclick(Name_dec.BATCH);
        //文件上传（批量）
        Public_methods.mydropupload(Name_dec.INVOICES,sss);
        //单次
        //Public_methods.myclick(Name_dec.SINGLE);
        //文件上传(单次）
        //Public_methods.mydropupload(Name_dec.INVOICE,sss);
        //执行Autol，Autol处理可执行文件
        //Runtime.getRuntime().exec("D:\\upload.exe");
        //点击确定
        sleep(1000);
        Public_methods.myclick(Name_dec.UPLOADTODETERMINE);

    }
    /**
     *   货物申报手动新增进口
     * */
    public void dec_import() throws Exception {
        //点击货物申报
        Public_methods.myclick(Name_login.RPA_TITLE);
        //点击货物申报制单(进口)
        Public_methods.myclick(Name_dec.RPA_TITLE_I);
        Thread.sleep(1000);
        //点击新增
        Name_login.mydriver.findElement(By.xpath(Name_dec.IDECNEW)).click();
        Thread.sleep(2000);
        //报关单类型
        Public_methods.myclear(Name_dec.CUSTOMSDECLARATIONTYPETOP, "001");
        //Public_methods.mydropdown(Name_dec.CUSTOMSDECLARATIONTYPETOP, "001");
        //报关转关类型
        Public_methods.myclear(Name_dec.CUSTOMSDECLARATIONTRANSFERTYPE, "1");
        //申报地海关
        Public_methods.myclear(Name_dec.DECLARATIONPLACECUSTOMS, "临江海关");
        //进境关别
        Public_methods.myclear(Name_dec.IECUSCLEARANCE, "长春关区");
        //海关编号
        Public_methods.myclear(Name_dec.CUSCODE, "123456789");
        //备案号
        Public_methods.myclear(Name_dec.EORI, "123456789123");
        //合同协议号
        Public_methods.myclear(Name_dec.CONTRACTNO, "123456789123");
        //进口日期
        Public_methods.myclear(Name_dec.IEDATE, "20201212");
        //境内收发货人十八位信用代码
        Public_methods.myclear(Name_dec.USCI, "91110101089661568T");
        //境内收发货人十位海关编号
        Public_methods.myclear(Name_dec.INRECEIVESHIPPERCUSCODE, "1101960H79");
        //境内收发货人十位检验检疫编号
        Public_methods.myclear(Name_dec.INRECEIVESHIPPERCOMMCODE, "1101960H79");
        //境内收发货人企业名称
        Public_methods.myclear(Name_dec.INRECEIVESHIPPERCUSNAME, "北京泰家福瑞贸易有限公司");
        //境外收发货人代码
        Public_methods.myclear(Name_dec.AEOCODE, "境外收发货人代码");
        //企业名称（外文）
        Public_methods.myclear(Name_dec.CONSIGNEEISNAMEANDADDRESS, "English");
        //消费使用单位十八位
        Public_methods.myclear(Name_dec.CONSUMERUSEUNITCODE, "110191902811019190");
        //消费使用单位十位编码
        Public_methods.myclear(Name_dec.CONSUMERUSECUSCODE, "1101919028");
        //消费使用单位十位国检
        Public_methods.myclear(Name_dec.CONSUMERUSECOMMCODE, "1101919028");
        //消费使用单位名称
        Public_methods.myclear(Name_dec.CONSUMERUSECUSNAME, "中国科学器材公司");
        //运输方式
        Public_methods.myclear(Name_dec.TRAFMODE, "1");
        //运输工具
        Public_methods.myclear(Name_dec.TRAFNAME, "运输工具");
        //航次号
        Public_methods.myclear(Name_dec.REQUESTEDFLIGHT, "航次号");
        //提运单号
        Public_methods.myclear(Name_dec.BILLNO, "提运单号");
        //监管方式
        Public_methods.myclear(Name_dec.SUPERVISORMODE, "一般贸易");
        //征免性质
        Public_methods.myclear(Name_dec.EXEMPTIONNATURE, "一般征税");
        //许可证号
        Public_methods.myclear(Name_dec.LICENSENO, "12-21-123331");
        //启运国
        Public_methods.myclear(Name_dec.AIRPORTOFDEPARTURE, "不丹");
        //经停港
        Public_methods.myclear(Name_dec.PORTOFDESTINATION, "天津出口加工区");
        //成交方式
        Public_methods.myclear(Name_dec.SOLDFOR, "3");
        //运费类型
        Public_methods.myclear(Name_dec.FREIGHTTYPE, "3");
        //运费值
        Public_methods.myclear(Name_dec.FREIGHT, "1");
        //运费币制
        Public_methods.myclear(Name_dec.FREIGHTMONETARY, "PHP");
        //保费类型
        Public_methods.myclear(Name_dec.PREMIUMTYPE, "3");
        //保费值
        Public_methods.myclear(Name_dec.PREMIUM, "1");
        //保费币制
        Public_methods.myclear(Name_dec.PREMIUMVALUEOF, "PHP");
        //杂费type
        Public_methods.myclear(Name_dec.MISCELLANEOUSFEESTYPE, "3");
        //杂费值
        Public_methods.myclear(Name_dec.MISCELLANEOUSFEES, "1");
        //杂费币制
        Public_methods.myclear(Name_dec.MISCELLANEOUSFEESMONETARY, "PHP");
        //件数
        Public_methods.myclear(Name_dec.PACKAGES, "11");
        //包装种类
        Public_methods.myclear(Name_dec.WRAPTYEP, "01");
        //其它包装（点击）
        Public_methods.myclick(Name_dec.WRAPTYEPS);
        //选择其它包装
        sleep(500);
        Public_methods.myclick(Name_dec.WRAPTYPEONE);
        Public_methods.myclick(Name_dec.WRAPTYPETWO);
        //其它包装点击确定
        Public_methods.myclick(Name_dec.WRAPS);
        //毛重
        Public_methods.myclear(Name_dec.GROSSWEIGHT, "10");
        //净重
        Public_methods.myclear(Name_dec.NETWEIGHT, "9");
        //贸易国别
        Public_methods.myclear(Name_dec.TRADINGNATION, "AFG");
        //入境口岸
        Name_login.mydriver.findElement(By.xpath(Name_dec.PORTOFENTRY)).sendKeys("110001");
        //myclear(Name_dec.PORTOFENTRY,"110001");
        //货物存放地点
        Public_methods.myclear(Name_dec.GOODSLOCATION, "货物地点");
        //启运港
        Public_methods.myclear(Name_dec.SHIPMENT, "991101");
        //报关单类型下
        Public_methods.myclear(Name_dec.CUSTOMSDECLARATIONTYPEDOWN, "M");
        //特殊关系确认
        Public_methods.myclear(Name_dec.SPECIALRELATIONSHIP, "1");
        //价格影响确认
        Public_methods.myclear(Name_dec.PRICE, "0");
        //支付特许权使用
        Public_methods.myclear(Name_dec.PAY, "9");
        //备注
        Public_methods.myclear(Name_dec.NOTE, "备注");
        //标记唛码
        Public_methods.myclear(Name_dec.LABELCODE, "n/m");
        //点击暂存（表头）
        Public_methods.myclick(Name_dec.SAVA);
        //提交下一步
        Public_methods.myclick(Name_dec.SUBMIT);
        Public_methods.myclick(Name_dec.SUBMIT);
        //提交下一步确定
        sleep(1500);
        Public_methods.myclick(Name_dec.SUBMITS);
    }

}
