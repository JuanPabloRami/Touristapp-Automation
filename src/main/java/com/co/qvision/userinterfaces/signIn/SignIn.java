package com.co.qvision.userinterfaces.signIn;

import net.serenitybdd.screenplay.targets.Target;

public class SignIn {
    public static final Target BTN_SIGN_IN = Target.the("Button of sign in")
            .locatedBy("//*[@id=\"services\"]/div[3]/ul/li[2]/span/button");
    public static final Target INPUT_EMAIL = Target.the("Input email")
            .locatedBy("//*[@id=\"mail\"]");
    public static final Target INPUT_PASSWORD = Target.the("Input password")
            .locatedBy("//*[@id=\"pass\"]");
    public static final Target BTN_SIGNIN = Target.the("Button of sign in")
            .locatedBy("//*[@id=\"root\"]/div/div[3]/div[1]/form/button");
    public static final Target ICON_CLOSE = Target.the("Button of sign in")
            .locatedBy("//*[@id=\"root\"]/div/div[3]/div[1]/button");
}
