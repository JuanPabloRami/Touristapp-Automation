package com.co.qvision.tasks.register;

import com.co.qvision.userinterfaces.register.MyAccount;
import com.co.qvision.userinterfaces.register.TourtistApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MyAccount.BTN_MY_ACCOUNT)

        );
    }

    public static CreateUser to() {
        return instrumented(CreateUser.class);
    }
}
