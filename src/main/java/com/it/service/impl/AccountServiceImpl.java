package com.it.service.impl;


import com.it.service.IAccountService;

public class AccountServiceImpl implements IAccountService {



    public AccountServiceImpl(){
        System.out.println("對象創建了");
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法執行了");
    }

    public void init() {
        System.out.println("對象初始化");
    }

    public void destory() {
        System.out.println("對象銷毀");
    }
}
