package com.co.qvision.tasks.registerTourist;

import com.co.qvision.userinterfaces.registerTourist.RegisterUserTourist;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateTourist implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterUserTourist.BTN_REGISTER),
                Click.on(RegisterUserTourist.BTN_ROLE_TOURIST),
                Enter.theValue("Alejandro").into(RegisterUserTourist.INPUT_NAME),
                Enter.theValue("Lopez").into(RegisterUserTourist.INPUT_LASTNAME),
                Enter.theValue("alopez900@misena.edu.co").into(RegisterUserTourist.INPUT_EMAIL),
                Enter.theValue("123456789").into(RegisterUserTourist.INPUT_PASSWORD),
                Enter.theValue("123456789").into(RegisterUserTourist.INPUT_PASSWORD_CONFIRM),
                Click.on(RegisterUserTourist.BTN_REGISTER_USER)
        );
    }

    public static CreateTourist on(){
        return instrumented(CreateTourist.class);
    }
}
