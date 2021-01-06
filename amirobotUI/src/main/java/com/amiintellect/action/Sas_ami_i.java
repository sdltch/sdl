package com.amiintellect.action;

import com.amiintellect.constant.Name_dec;
import com.amiintellect.constant.Name_login;
import com.amiintellect.constant.Name_sas;

import static java.lang.Thread.sleep;

/*
* 海关特区域进口
* */
public class Sas_ami_i {
    /*
     * 海关特殊上传
     * */
    public void sas_ImporteRcognition() throws Exception {
        //点击海关特殊监管区域
        Public_methods.myclick(Name_login.RPA_SAS);
        //点击海关特殊监管(进口)
        Public_methods.myclick(Name_sas.SAS_I);
        //上传文件按钮
        Public_methods.myclick(Name_sas.UPLOAD);
        //客户信息
        Public_methods.myclear(Name_sas.CUSTOMERINFORMATION,"bgd001");
        Public_methods.mykeyboard(Name_sas.CUSTOMERINFORMATION,1);
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
}
