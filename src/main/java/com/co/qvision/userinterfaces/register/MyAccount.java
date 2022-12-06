package com.co.qvision.userinterfaces.register;

import net.serenitybdd.screenplay.targets.Target;

public class MyAccount {
    public static final Target BTN_MY_ACCOUNT = Target.the("Button of my account")
            .locatedBy("/html/body/div/div/nav[1]/div/div[3]/ul/li[1]/span/button");
}

