package com.co.qvision.userinterfaces.createBusiness;

import net.serenitybdd.screenplay.targets.Target;

public class CreateMyBusiness {

    public static final Target TITLE_BUSINESS= Target.the("title business")
            .locatedBy("//body/div[@id='root']/div[1]/div[12]/div[3]/div[1]/input[1]");
    public static final Target BTN_SAVE_TITLE= Target.the("button save title")
            .locatedBy("//body[1]/div[1]/div[1]/div[12]/div[3]/div[1]/button[1]");

    //Informacion de negocio
    public static final Target BTN_INFO_BUSINESS= Target.the("button info business")
            .locatedBy("//body[1]/div[1]/div[1]/div[12]/div[3]/div[2]/button[1]");
    public static final Target SELECT_DEPERTAMENT= Target.the("select departament business")
            .locatedBy("//*[@id=\"root\"]/div/div[7]/div/form/div[1]/div/select[1]");
    public static final Target VALUE_DEPERTAMENT= Target.the("value departament business")
            .locatedBy("//body[1]/div[1]/div[1]/div[7]/div[1]/form[1]/div[1]/div[1]/select[1]/option[2]");

    public static final Target SELECT_MUNICIPIOS= Target.the("select municipio business")
            .locatedBy("//*[@id=\"root\"]/div/div[7]/div/form/div[1]/div/select[2]");
    public static final Target VALUE_MUNICIPIOS= Target.the("value municipio business")
            .locatedBy("//*[@id=\"root\"]/div/div[7]/div/form/div[1]/div/select[2]/option[2]");
    public static final Target INPUT_UBICATION= Target.the("adress business")
            .locatedBy("//input[@id='Localidad']");
    public static final Target INPUT_FACEBOOK= Target.the("facebook business")
            .locatedBy("//input[@id='Facebook']");
    public static final Target INPUT_EMAIL= Target.the("email business")
            .locatedBy("//input[@id='emailBusiness']");
    public static final Target SELECT_CATEGORY= Target.the("category business")
            .locatedBy("//*[@id=\"root\"]/div/div[7]/div/form/div[7]/select");
    public static final Target VALUE_CATEGORY= Target.the("value category business")
            .locatedBy("//body[1]/div[1]/div[1]/div[7]/div[1]/form[1]/div[7]/select[1]/option[4]");
    public static final Target BTN_SAVE_INFORMATION= Target.the("btn save information")
            .locatedBy("//body/div[@id='root']/div[1]/div[7]/div[1]/form[1]/button[1]");


    //Descripcion
    public static final Target ICON_DESCRIPTION= Target.the("description business")
            .locatedBy("//*[@id='input']");
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
            .locatedBy("//body/div[@id='root']/div[1]/div[6]/div[1]/form[1]/div[5]/div[1]/input[1]");
    public static final Target BTN_CRATE_ITEM= Target.the("create all catalogue")
            .locatedBy("//button[contains(text(),'Crear item')]");

    public static final Target BTN_CREATE_BUSINESS= Target.the("create my business")
            .locatedBy("//button[contains(text(),'Crear negocio')]");

    public static final Target BTN_CREATE_CONFIRM_BUSINESS= Target.the("modal de confirmacion para create my business")
            .locatedBy("//*[@id=\"root\"]/div/div[8]/div[1]/div[2]/button[2]");

    public static final Target IMG_SCROLL= Target.the("modal de confirmacion para create my business")
            .locatedBy("//*[@id=\"root\"]/div/div[12]/div[1]/img");















}
