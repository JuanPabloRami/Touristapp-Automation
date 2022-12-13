package com.co.qvision.userinterfaces.commentBusiness;

import net.serenitybdd.screenplay.targets.Target;

public class CommentBusinessInterfaces {
    public static final Target BTN_SEARCH = Target.the("Button the search").
            locatedBy("//*[@id=\"search\"]");
    public static final Target INPUT_SEARCH = Target.the("Input search").
            locatedBy("//*[@id=\"services\"]/div[1]/ul/input");
    public static final Target BTN_BUSINESS = Target.the("Button go to business").
            locatedBy("//*[@id=\"services\"]/div[1]/ul/div[1]/div/button");
    public static final Target BTN_LIKE_BUSINESS = Target.the("Button the like").
            locatedBy("//*[@id=\"root\"]/div/div[13]/button");
    public static final Target TITLE_BUSINESS = Target.the("Title business").
            locatedBy("//*[@id=\"root\"]/div/main/div[2]/div[1]/h2");
    public static final Target INPUT_COMMENT = Target.the("input comment").
            locatedBy("//*[@id=\"root\"]/div/main/div[1]/div[2]/input");
    public static final Target BTN_SEND_COMMENT = Target.the("button send comment").
            locatedBy("//*[@id=\"root\"]/div/main/div[1]/div[2]/button");
}
