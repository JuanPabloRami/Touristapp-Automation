package com.co.qvision.tasks.signIn;

import com.co.qvision.userinterfaces.signIn.SignIn;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignInUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SignIn.BTN_SIGN_IN),
                Enter.theValue("holi@gmail.com").into(SignIn.INPUT_EMAIL),
                Enter.theValue("123456789").into(SignIn.INPUT_PASSWORD),
                Click.on(SignIn.BTN_SIGNIN)
        );
    }

    public static SignInUser on(){
        return instrumented(SignInUser.class);
    }
}
