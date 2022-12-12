package com.co.qvision.tasks.register;

import com.co.qvision.userinterfaces.register.MyAccount;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccount.BTN_REGISTER),
                Click.on(MyAccount.OPTION_EMPRENDEDOR),
                Enter.theValue("JuanchoPolo").into(MyAccount.INPUT_NAME_USER),
                Enter.theValue("Lopez Moncada").into(MyAccount.INPUT_LAST_NAME),
                Enter.theValue("juanchin@gmail.com").into(MyAccount.INPUT_EMAIL_USER),
                Enter.theValue("123456789").into(MyAccount.INPUT_PASSWORD),
                Enter.theValue("123456789").into(MyAccount.INPUT_CONFIRMPASSWORD),
                Click.on(MyAccount.ACCEPT_TERMS),
                Click.on(MyAccount.BTN_CONFIR_REGISTER)
        );
    }

    public static CreateUser to() {
        return instrumented(CreateUser.class);
    }
}
