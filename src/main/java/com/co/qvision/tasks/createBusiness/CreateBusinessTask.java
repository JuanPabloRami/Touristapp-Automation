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
    File file = new File("src/test/resources/images/Jupa.png");
    String path = file.getAbsolutePath();
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CreateBusinessUserInterface.DROP_USER),
                Click.on(CreateBusinessUserInterface.CREATE_MY_BUSINESS),
                Enter.theValue("SENA").into(CreateMyBusiness.TITLE_BUSINESS),
                Click.on(CreateMyBusiness.BTN_SAVE_TITLE),
                Click.on(CreateMyBusiness.BTN_INFO_BUSINESS),
                Click.on(CreateMyBusiness.SELECT_DEPERTAMENT),
                Click.on(CreateMyBusiness.VALUE_DEPERTAMENT),
                Click.on(CreateMyBusiness.SELECT_MUNICIPIOS),
                Click.on(CreateMyBusiness.VALUE_MUNICIPIOS),
                Enter.theValue("Barrio galan").into(CreateMyBusiness.INPUT_UBICATION),
                Enter.theValue("Centro de comercio y turismo").into(CreateMyBusiness.INPUT_FACEBOOK),
                Enter.theValue("senaganal@misan.edu.co").into(CreateMyBusiness.INPUT_EMAIL),
                Click.on(CreateMyBusiness.SELECT_CATEGORY),
                Click.on(CreateMyBusiness.VALUE_CATEGORY),
                Click.on(CreateMyBusiness.BTN_SAVE_INFORMATION),

                //Description
                Scroll.to(CreateMyBusiness.BTN_CREATE_BUSINESS),
                Click.on(CreateMyBusiness.ICON_DESCRIPTION),
                Enter.theValue("El mejor SENA del quindio").into(CreateMyBusiness.INPUT_DESCRIPTION),
                Click.on(CreateMyBusiness.BTN_SAVE_DESCRIPTION),
                Scroll.to(CreateMyBusiness.ICON_DESCRIPTION),

                //Item
                Click.on(CreateMyBusiness.ICON_CATALOGUE),
                Enter.theValue("ADSI").into(CreateMyBusiness.INPUT_NAME),
                Enter.theValue("Forma los mejores desarrolladores de armenia quindio").into(CreateMyBusiness.INPUT_DESCRIPTION_CATALOGUE),
                Enter.theValue("10000000").into(CreateMyBusiness.INPUT_PRECIO),
                Enter.keyValues(path).into(CreateMyBusiness.INPUT_IMG),
                Click.on(CreateMyBusiness.CHECK_PROMOTION),
                Click.on(CreateMyBusiness.BTN_CRATE_ITEM),
                Click.on(CreateMyBusiness.IMG_SCROLL),
                Click.on(CreateMyBusiness.BTN_CREATE_BUSINESS),
                Click.on(CreateMyBusiness.BTN_CREATE_CONFIRM_BUSINESS)
        );
    }

    public static CreateBusinessTask create(){
        return instrumented(CreateBusinessTask.class);
    }
}
