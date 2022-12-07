package com.co.qvision.userinterfaces.registerTourist;

import net.serenitybdd.screenplay.questions.targets.TargetAttribute;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterUserTourist {
    public static final Target BTN_REGISTER = Target.the("Button of my account")
            .locatedBy("/html/body/div/div/nav[1]/div/div[3]/ul/li[1]/span/button");
    public static final Target BTN_ROLE_TOURIST = Target.the("Button of tourist role")
            .locatedBy("//*[@id=\"root\"]/div/div[5]/div/div/div[1]/div");
    public static final Target INPUT_NAME = Target.the("Input name")
            .locatedBy("//*[@id=\"name\"]");
    public static final Target INPUT_LASTNAME = Target.the("Input lastname")
            .locatedBy("//*[@id=\"last_name\"]");
    public static final Target INPUT_EMAIL = Target.the("Input email")
            .locatedBy("//*[@id=\"email\"]");
    public static final Target INPUT_PASSWORD = Target.the("Input password")
            .locatedBy("//*[@id=\"password\"]");
    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("Input confirm password")
            .locatedBy("//*[@id=\"confirmPassword\"]");
    public static final Target INPUT_TERMS_CONDITION = Target.the("Input terms and condition")
            .locatedBy("//*[@id=\"acceptTerms\"]");
    public static final Target BTN_REGISTER_USER = Target.the("Button the register user")
            .locatedBy("//*[@id=\"root\"]/div/div[4]/div[1]/form/button");
}
