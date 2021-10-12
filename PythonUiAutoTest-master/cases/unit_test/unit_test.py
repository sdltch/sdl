"""
------------------------------------
@Time : 2019/7/18 10:23
@Auth : linux超
@File : unit_test.py
@IDE  : PyCharm
@Motto: Real warriors,dare to face the bleak warning,dare to face the incisive error!
@QQ   : 28174043@qq.com
@GROUP: 878565760
------------------------------------
"""
# coding:utf-8
import os
import unittest
from selenium import webdriver

from common.record_log import logger
from pages.homePage import HomePage
from pages.loginPage import LoginPage
from pages.loanPage import LoanPage
from pages.memberPage import MemberPage


class MyUnitTest(unittest.TestCase):
    print('MyUnitTest')
    driver = None
    logger = logger
    @classmethod
    def setUpClass(cls):
        try:
            # 加启动配置
            # chrome浏览器V78及以上版本解决自动监控软件
            chrome_options = webdriver.ChromeOptions()
            chrome_options.add_experimental_option('useAutomationExtension', False)
            chrome_options.add_experimental_option("excludeSwitches", ['enable-automation'])
            # driver路径
            mydrvier = 'C:\Program Files (x86)\Google\Chrome\Application\chromedriver87\chromedriver.exe'
            cls.driver = webdriver.Chrome(options=chrome_options, executable_path=mydrvier)
            cls.driver.implicitly_wait(2)  # 隐式等待
            # cls.driver = webdriver.Chrome()  # 打开浏览器
            cls.driver.maximize_window()  # 最大化窗口
        except Exception as e:
            cls.logger.error('打开浏览器失败:{}', format(e))
            raise e
        else:
            cls.logger.info("打开浏览器:{}".format(cls.driver.name))
        cls.home_page = HomePage(cls.driver)
        cls.login_page = LoginPage(cls.driver)
        cls.loan_page = LoanPage(cls.driver)
        cls.member_page = MemberPage(cls.driver)

    @classmethod
    def tearDownClass(cls):
        cls.driver.quit()
        logger.info("关闭浏览器")


if __name__ == '__main__':
    unittest.main()