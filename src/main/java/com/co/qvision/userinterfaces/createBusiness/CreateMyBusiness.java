package com.co.qvision.userinterfaces.createBusiness;

import net.serenitybdd.screenplay.targets.Target;

public class CreateMyBusiness {

    public static final Target TITLE_BUSINESS= Target.the("title business")
            .locatedBy("//*[@id=\"root\"]/div/div[13]/div[3]/div[1]/input");
    public static final Target BTN_SAVE_TITLE= Target.the("button save title")
            .locatedBy("//*[@id=\"root\"]/div/div[13]/div[3]/div[1]/button");

    //Informacion de negocio
    public static final Target BTN_INFO_BUSINESS= Target.the("button info business")
            .locatedBy("//*[@id=\"root\"]/div/div[13]/div[3]/div[2]/button");
    public static final Target SELECT_DEPERTAMENT= Target.the("select departament business")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div/form/div[1]/div/select[1]");
    public static final Target VALUE_DEPERTAMENT= Target.the("value departament business")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div/form/div[1]/div/select[1]/option[17]");

    public static final Target SELECT_MUNICIPIOS= Target.the("select municipio business")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div/form/div[1]/div/select[2]");
    public static final Target VALUE_MUNICIPIOS= Target.the("value municipio business")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div/form/div[1]/div/select[2]/option[13]");
    public static final Target INPUT_UBICATION= Target.the("adress business")
            .locatedBy("//input[@id='Localidad']");
    public static final Target INPUT_FACEBOOK= Target.the("facebook business")
            .locatedBy("//input[@id='Facebook']");
    public static final Target INPUT_EMAIL= Target.the("email business")
            .locatedBy("//input[@id='emailBusiness']");
    public static final Target SELECT_CATEGORY= Target.the("category business")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div/form/div[7]/select");
    public static final Target VALUE_CATEGORY= Target.the("value category business")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div/form/div[7]/select/option[4]");
    public static final Target BTN_SAVE_INFORMATION= Target.the("btn save information")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div/form/button");


    //Descripcion
    public static final Target ICON_DESCRIPTION= Target.the("description business")
            .locatedBy("//*[@id=\"input\"]");
    public static final Target INPUT_DESCRIPTION= Target.the("Input description business")
            .locatedBy("//textarea[@id='des_create']");
    public static final Target BTN_SAVE_DESCRIPTION= Target.the("button save description")
            .locatedBy("//button[contains(text(),'Guardar Cambios')]");

    //Catalogue
    public static final Target ICON_CATALOGUE= Target.the("icon create catalogue")
            .locatedBy("//*[@id=\"catalogue_icon\"]");
    public static final Target INPUT_NAME= Target.the("catalogue name")
            .locatedBy("//input[@id='nameItem']");
    public static final Target INPUT_DESCRIPTION_CATALOGUE= Target.the("catalogue description")
            .locatedBy("//input[@id='desItem']");
    public static final Target INPUT_PRECIO= Target.the("catalogue precio")
            .locatedBy("//input[@id='numItem']");
    public static final Target INPUT_IMG= Target.the("img item")
            .locatedBy("//*[@id=\"fil\"]");

    public static final Target CHECK_PROMOTION= Target.the("check promotion")
            .locatedBy("//*[@id=\"Si\"]");
    public static final Target BTN_CRATE_ITEM= Target.the("create all catalogue")
            .locatedBy("//*[@id=\"root\"]/div/div[7]/div/form/button");

    public static final Target BTN_CREATE_BUSINESS= Target.the("create my business")
            .locatedBy("//*[@id=\"root\"]/div/div[13]/button");

    public static final Target BTN_CREATE_CONFIRM_BUSINESS= Target.the("modal de confirmacion para create my business")
            .locatedBy("//*[@id=\"root\"]/div/div[9]/div[1]/div[2]/button[2]");

    public static final Target IMG_SCROLL= Target.the("modal de confirmacion para create my business")
            .locatedBy("//*[@id=\"root\"]/div/div[13]/div[2]/img");















}
