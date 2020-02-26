package com.it.factory;

/*
* 模擬一個工廠類 該類可能是存在於jar包中的  我們無法通過修改源碼的方式來提供默認的構造函數
* */

import com.it.service.IAccountService;
import com.it.service.impl.AccountServiceImpl;

public class InstanceFactory {

    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }

}
