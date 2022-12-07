package com.co.qvision.userinterfaces.register;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.io.File;

public class MyAccount {

    public static final Target BTN_REGISTER = Target.the("Button of my account")
            .locatedBy("/html/body/div/div/nav[1]/div/div[3]/ul/li[1]/span/button");
    public static final Target OPTION_EMPRENDEDOR = Target.the("option emprendedor user")
            .locatedBy("//body/div[@id='root']/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]");
    public static  final Target INPUT_NAME_USER = Target.the(("name user"))
            .locatedBy("//input[@id='name']");
    public static  final Target INPUT_LAST_NAME = Target.the(("Last name user"))
            .locatedBy("//input[@id='last_name']");
    public static  final Target INPUT_EMAIL_USER = Target.the(("Last name user"))
            .locatedBy("//input[@id='email']");
    public static  final Target INPUT_PASSWORD = Target.the(("password user"))
            .locatedBy("//input[@id='password']");
    public static  final Target INPUT_CONFIRMPASSWORD = Target.the(("confirm password user"))
            .locatedBy("//input[@id='confirmPassword']");
    public static  final Target ACCEPT_TERMS = Target.the(("accept terms user"))
            .locatedBy("//input[@id='acceptTerms']");

    public static  final Target BTN_CONFIR_REGISTER = Target.the(("button register user"))
            .locatedBy("//body/div[@id='root']/div[1]/div[4]/div[1]/form[1]/button[1]");
}

