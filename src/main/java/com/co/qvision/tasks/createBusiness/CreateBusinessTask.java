package com.co.qvision.tasks.createBusiness;

import com.co.qvision.userinterfaces.createBusiness.CreateBusinessUserInterface;
import com.co.qvision.userinterfaces.createBusiness.CreateMyBusiness;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.io.File;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CreateBusinessTask implements Task {
    File file = new File("src/test/resources/images/buchanas.jpg");
    String path = file.getAbsolutePath();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CreateBusinessUserInterface.DROP_USER),
                Click.on(CreateBusinessUserInterface.CREATE_MY_BUSINESS),
                Enter.theValue("Panda Disco").into(CreateMyBusiness.TITLE_BUSINESS),
                Click.on(CreateMyBusiness.BTN_SAVE_TITLE),
                Click.on(CreateMyBusiness.BTN_INFO_BUSINESS),
                Click.on(CreateMyBusiness.SELECT_DEPERTAMENT),
                Click.on(CreateMyBusiness.VALUE_DEPERTAMENT),
                Click.on(CreateMyBusiness.SELECT_MUNICIPIOS),
                Click.on(CreateMyBusiness.VALUE_MUNICIPIOS),
                Enter.theValue("Avenida norte").into(CreateMyBusiness.INPUT_UBICATION),
                Enter.theValue("PandaDisco").into(CreateMyBusiness.INPUT_FACEBOOK),
                Enter.theValue("panadisco@gmail.com").into(CreateMyBusiness.INPUT_EMAIL),
                Click.on(CreateMyBusiness.SELECT_CATEGORY),
                Click.on(CreateMyBusiness.VALUE_CATEGORY),
                Click.on(CreateMyBusiness.BTN_SAVE_INFORMATION),

                //Description
                Scroll.to(CreateMyBusiness.BTN_CREATE_BUSINESS),
                Click.on(CreateMyBusiness.ICON_DESCRIPTION),
                Enter.theValue("El club mas exclusivo de la ciudad de armenia, abrimos jueves, viernes, sabados y festivos").into(CreateMyBusiness.INPUT_DESCRIPTION),
                Click.on(CreateMyBusiness.BTN_SAVE_DESCRIPTION),
                Scroll.to(CreateMyBusiness.ICON_DESCRIPTION),

                //Item
                Click.on(CreateMyBusiness.ICON_CATALOGUE),
                Enter.theValue("buchana").into(CreateMyBusiness.INPUT_NAME),
                Enter.theValue("Licor cotizado").into(CreateMyBusiness.INPUT_DESCRIPTION_CATALOGUE),
                Enter.theValue("180000").into(CreateMyBusiness.INPUT_PRECIO),
                Enter.keyValues(path).into(CreateMyBusiness.INPUT_IMG),
                Click.on(CreateMyBusiness.CHECK_PROMOTION),
                Click.on(CreateMyBusiness.BTN_CRATE_ITEM),
                Scroll.to(CreateMyBusiness.IMG_SCROLL),
                Click.on(CreateMyBusiness.BTN_CREATE_BUSINESS),
                Click.on(CreateMyBusiness.BTN_CREATE_CONFIRM_BUSINESS)
        );
    }

    public static CreateBusinessTask create(){
        return instrumented(CreateBusinessTask.class);
    }
}
