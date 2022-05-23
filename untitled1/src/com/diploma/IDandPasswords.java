package com.diploma;

import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Admin","12345");
        logininfo.put("Sotrudnik","54321");
        logininfo.put("Pro","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}