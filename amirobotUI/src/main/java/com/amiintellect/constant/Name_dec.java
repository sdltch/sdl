package com.amiintellect.constant;
//货物申报元素
public class Name_dec {
    /*
     *  上传
     * */
    //上传
    public static final String UPLOAD = "//div[@id=\"root\"]//div[3]/span/button";
    //客户信息
    public static final String CUSTOMERINFORMATION = "//div[@id=\"customerInfo\"]//input";
    //委托单位
    public static final String ENTRUSTUNIT = "//div[@id=\"entrustCompanyId\"]//input";
    //点击供应商
    public static final String SOME_SUPPLIERS = "//div[@id=\"overseasConsignorEnName\"]/div/div";
    //供应商//
    //public static final String SUPPLIER = "//div[@id=\"overseasConsignorEnName\"]/div/div/div[1]";
    public static final String SUPPLIER = "//span[@class='ant-form-item-children']/div/div/div/div//li[1]";

    //批量批量文件
    public static final String BATCH = "//div[@class='ant-tabs-nav-scroll']/div/div/div[1]";
    //2发票（单次）
    public static final String INVOICES = "//div[@class='ant-col ant-col-24']//div[3]/div[1]/span[2]//span[1]/input";
    //单次文件上传
    public static final String SINGLE = "//div[@class='ant-tabs-nav-scroll']/div/div/div[2]";
    //span 1:合同；2：发票；3：箱单；4：运单；5：入库单；6：草单；7：面单；8：申报要素；9：产品说明书；10：原产地证书；11：其它文件；12：打包文件
    public static final String CONTRACT = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[1]//span[1]/input";
    //2发票（单次）
    public static final String INVOICE = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[2]//span[1]/input";
    //3箱单（单次）
    public static final String PACKING_LIST = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[3]//span[1]/input";
    //4运单（单次）
    public static final String WAYBILL = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[4]//span[1]/input";
    //5入库单（单次）
    public static final String GRN = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[5]//span[1]/input";
    //6草单（单次）
    public static final String CSINGLE_GRASS = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[6]//span[1]/input";
    //7面单（单次）
    public static final String SURFACE_SINGLE = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[7]//span[1]/input";
    //8申报要素（单次）
    public static final String DECLARE_ELEMENTS = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[8]//span[1]/input";
    //9：产品说明书（单次）
    public static final String PRODUCT_DESCRIPTION = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[9]//span[1]/input";
    //10：原产地证书（单次）
    public static final String CERTIFICATE_OF_ORIGIN = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[10]//span[1]/input";
    //11：其它文件（单次）
    public static final String OTHER_DOCUMENTS = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[11]//span[1]/input";
    //12：打包文件（单次）
    public static final String THE_PACKAGED_FILE = "//div[@class='ant-col ant-col-24']//div[3]/div[2]/span[12]//span[1]/input";

    //上传文件取消
    public static final String UPLOADTOCANCEL= "//div[@class='ant-col ant-col-24']/button[1]";
    //上传文件确定
    public static final String UPLOADTODETERMINE= "//div[@class='ant-col ant-col-24']/button[2]";

    /*
    *  进口，表头
    * */
    //货物申报制单(进口)
    public static final String RPA_TITLE_I = "//div[@id=\"root\"]//li[1]/a";
    //货物申报制单(出口)
    public static final String RPA_TITLE_E = "//div[@id=\"root\"]//li[2]/a";
    //新增
    public static final String IDECNEW = "//div[@id=\"root\"]//div[3]/button";
    //报关单类型
    public static final String CUSTOMSDECLARATIONTYPETOP = "//div[@id=\"formbox\"]/div/div/div/form//tr[1]/td[4]//input";
    //报关转关类型//div[@id="formbox"]/div/div/div/form//tr[1]/td[6]//input
    public static final String CUSTOMSDECLARATIONTRANSFERTYPE = "//div[@id=\"formbox\"]/div/div/div/form//tr[1]/td[6]//input";
    //申报地海关
    public static final String DECLARATIONPLACECUSTOMS = "//div[@id=\"formbox\"]/div[5]//div/div/div[1]/form//table[1]//tr[1]/td[1]//input";
    //进境关别
    public static final String IECUSCLEARANCE = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[3]/td[2]//input";
    //海关编号
    public static final String CUSCODE = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[3]/td[1]//input";
    //备案号
    public static final String EORI = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[4]/td[1]//input";
    //合同协议号
    public static final String CONTRACTNO = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[4]/td[2]//input";
    //进口日期
    public static final String IEDATE = "//*[@id=\"formbox\"]//div[1]/form//table[1]//tr[5]/td[1]//input";
    //境内收发货人十八位信用代码
    public static final String USCI = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[6]/td[1]//input";
    //境内收发货人十位海关编号
    public static final String INRECEIVESHIPPERCUSCODE = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[6]/td[2]//input";
    //境内收发货人十位检验检疫编码
    public static final String INRECEIVESHIPPERCOMMCODE = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[6]/td[3]//input";
    //境内收发货人企业名称
     public static final String INRECEIVESHIPPERCUSNAME = "//div[@id=\"formbox\"]//div[1]/form//table[1]//tr[6]/td[4]//input";
    //境外收发货人代码
    public static final String AEOCODE = "//div[@id=\"formbox\"]//div[1]/form//tr[7]/td[1]//input";
    //企业名称（外文）境外收发货人
    public static final String CONSIGNEEISNAMEANDADDRESS = "//div[@id=\"formbox\"]//div[1]/form//tr[7]/td[2]//input";
    //消费使用单位十八位
    public static final String CONSUMERUSEUNITCODE = "//div[@id=\"formbox\"]//div[1]/form//tr[8]/td[1]//input";
    //消费使用单位十位编码
    public static final String CONSUMERUSECUSCODE = "//div[@id=\"formbox\"]//div[1]/form//tr[8]/td[2]//input";
    //消费使用单位十位国检
    public static final String CONSUMERUSECOMMCODE = "//div[@id=\"formbox\"]//div[1]/form//tr[8]/td[3]//input";
    //消费使用单位名称
    public static final String CONSUMERUSECUSNAME = "//div[@id=\"formbox\"]//div[1]/form//tr[8]/td[4]//input";
    //运输方式
    public static final String TRAFMODE = "//div[@id=\"formbox\"]//table[1]//tr[10]/td[1]//input";
    //运输工具
    public static final String TRAFNAME = "//div[@id=\"formbox\"]//table[1]//tr[10]/td[2]//input";
    //航次号
    public static final String REQUESTEDFLIGHT = "//div[@id=\"formbox\"]//table[1]//tr[10]/td[3]//input";
    //提运单号
    public static final String BILLNO = "//div[@id=\"formbox\"]//tr[11]/td[1]//input";
    //监管方式
    public static final String SUPERVISORMODE = "//div[@id=\"formbox\"]//tr[11]/td[2]//input";
    //征免性质
    public static final String EXEMPTIONNATURE = "//div[@id=\"formbox\"]//tr[11]/td[3]//input";
    //许可证号
    public static final String LICENSENO = "//div[@id=\"formbox\"]//tr[12]/td[1]//input";
    //启运国
    public static final String AIRPORTOFDEPARTURE = "//div[@id=\"formbox\"]//tr[12]/td[2]//input";
    //经停港
    public static final String PORTOFDESTINATION = "//div[@id=\"formbox\"]//tr[12]/td[3]//input";
    //成交方式
    public static final String SOLDFOR = "//div[@id=\"formbox\"]//tr[12]/td[4]//input";
    //运费类型
    public static final String FREIGHTTYPE = "//div[@id=\"formbox\"]//tr[13]/td[1]//input";
    //运费值
    public static final String FREIGHT = "//div[@id=\"formbox\"]//tr[13]/td[2]//input";
    //运费币制
    public static final String FREIGHTMONETARY = "//div[@id=\"formbox\"]//tr[13]/td[3]//input";
    //保费类型
    public static final String PREMIUMTYPE = "//div[@id=\"formbox\"]//tr[13]/td[4]//input";
    //保费值
    public static final String PREMIUM = "//div[@id=\"formbox\"]//tr[13]/td[5]//input";
    //保费币制
    public static final String PREMIUMVALUEOF = "//div[@id=\"formbox\"]//tr[13]/td[6]//input";
    //杂费类型
    public static final String MISCELLANEOUSFEESTYPE = "//div[@id=\"formbox\"]//tr[13]/td[7]//input";
    //杂费值
    public static final String MISCELLANEOUSFEES = "//div[@id=\"formbox\"]//tr[13]/td[8]//input";
    //杂费币制
    public static final String MISCELLANEOUSFEESMONETARY = "//div[@id=\"formbox\"]//tr[13]/td[9]//input";
    //件数
    public static final String PACKAGES = "//div[@id=\"formbox\"]//tr[14]/td[1]//input";
    //包装种类
    public static final String WRAPTYEP = "//div[@id=\"formbox\"]//tr[14]/td[2]//input";
    //点击其它包装
    public static final String WRAPTYEPS = "//div[@id=\"formbox\"]//tr[14]//button";
    //选择其它包装
    public static final String WRAPTYPEONE = "//div[@id=\"dictionary-modal\"]//div[2]/table//tr[1]//input";
    public static final String WRAPTYPETWO = "//div[@id=\"dictionary-modal\"]//div[2]/table//tr[2]//input";
    //其它包装确定
    public static final String WRAPS = "//div[@id=\"dictionary-modal\"]//button[1]";
    //毛重
    public static final String GROSSWEIGHT = "//div[@id=\"formbox\"]//tr[14]/td[4]//input";
    //净重
    public static final String NETWEIGHT = "//div[@id=\"formbox\"]//tr[14]/td[5]//input";
    //贸易国别
    public static final String TRADINGNATION = "//div[@id=\"formbox\"]//tr[15]/td[1]//input";
    //入境口岸
    public static final String PORTOFENTRY = "//div[@id=\"formbox\"]//tr[16]/td[1]//input";
    //货物存放地点
    public static final String GOODSLOCATION = "//div[@id=\"formbox\"]//tr[16]/td[2]//input";
    //启运港
    public static final String SHIPMENT = "//div[@id=\"formbox\"]//tr[16]/td[3]//input";
    //报关单类型下
    public static final String CUSTOMSDECLARATIONTYPEDOWN = "//div[@id=\"formbox\"]//tr[17]/td[1]//input";
    //特殊关系确认
    public static final String SPECIALRELATIONSHIP = "//div[@id=\"formbox\"]//tr[17]/td[2]//input";
    //价格影响确认
    public static final String PRICE = "//div[@id=\"formbox\"]//tr[17]/td[3]//input";
    //支付特权使用
    public static final String PAY = "//div[@id=\"formbox\"]//tr[17]/td[4]//input";
    //备注
    public static final String NOTE = "//div[@id=\"formbox\"]//tr[18]/td[1]//input";
    //标记唛码
    public static final String LABELCODE = "//div[@id=\"formbox\"]//tr[18]/td[2]//input";
    //点击暂存（表头）
    public static final String SAVA = "//div[@id=\"formbox\"]/div[4]//button[1]";
    //点击其它下一步
    public static final String SUBMIT = "//div[@id=\"formbox\"]/div[4]//button[2]";
    //提交下一步确定
    public static final String SUBMITS = "//div[@class='ant-modal-confirm-btns']/button[2]";
    /*
     *  进口，表体
     * */
    //
//    public static final String IDECNEW = "";
    //
//    public static final String IDECNEW = "";
    //
//    public static final String IDECNEW = "";
    //


}
