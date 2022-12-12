package com.co.qvision.userinterfaces.createBusiness;

import net.serenitybdd.screenplay.targets.Target;

public class CreateBusinessUserInterface {
    public static final Target DROP_USER = Target.the("select drop user")
            .locatedBy("//body/div[@id='root']/div[1]/nav[1]/div[1]/div[3]/div[1]");
    public static final Target CREATE_MY_BUSINESS = Target.the("select create business")
            .locatedBy("//*[@id=\"services\"]/div[3]/div/ul/a[1]");

    //body[1]/div[1]/div[1]/nav[1]/div[1]/div[3]/div[1]/ul[1]/a[1]/li[1]
}
