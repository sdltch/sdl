package com.amiintellect.start;
import com.amiintellect.action.Dec_ami_i;
import com.amiintellect.action.Login_ami;
import com.amiintellect.action.Sas_ami_i;

public class Launch {
    public static void main(String[] args) throws Exception {
        Launch mainStart = new Launch();
        mainStart.start();

    }
    public void start() throws Exception {
        //登录
        Login_ami login = new Login_ami();
        //货物申报进口
        Dec_ami_i decami = new Dec_ami_i();
        //海关特殊监管区域进口
        Sas_ami_i sasamii = new Sas_ami_i();
        //打开浏览器
        login.mydriver();
        //登录
        login.mylogin();
        //货物申报手动新增进口
        decami.dec_import();
        //货物申报上传进口
        decami.dec_ImporteRcognition();
        //海关特殊监管区域进口
        sasamii.sas_ImporteRcognition();

    }
}