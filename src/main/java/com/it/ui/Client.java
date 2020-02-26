package com.it.ui;


import com.it.service.IAccountService;
import com.it.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.sql.rowset.spi.XmlReader;

public class Client {

    /**

     * @param args
     */

    public static void main(String[] args) {
        //1.獲取核心容器對象
        //ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");//若看成父類 無法使用close方法

        //2.根據ID獲取bean對象
        IAccountService as1 = (IAccountService)ac.getBean("accountService");
        //IAccountService as2 = (IAccountService)ac.getBean("accountService");
        as1.saveAccount();
        //判斷兩個對象是否相同 -- 單例測試
        //System.out.println(as1 == as2);

        ac.close();

    }
}
