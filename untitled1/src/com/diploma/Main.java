package com.diploma;

import java.sql.Connection;

public class Main {



    public static void main(String[] args) {


        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());

    }

    Connection conn = null;

}