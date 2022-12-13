package com.co.qvision.tasks.commentBusiness;

import com.co.qvision.userinterfaces.commentBusiness.CommentBusinessInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CommentBusiness implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CommentBusinessInterfaces.BTN_SEARCH),
                Click.on(CommentBusinessInterfaces.INPUT_SEARCH),
                Enter.theValue("Panda Disco").into(CommentBusinessInterfaces.INPUT_SEARCH),
                Click.on(CommentBusinessInterfaces.BTN_BUSINESS),
                Click.on(CommentBusinessInterfaces.BTN_LIKE_BUSINESS),
                Scroll.to(CommentBusinessInterfaces.TITLE_BUSINESS),
                Enter.theValue("Mera rumba parce").into(CommentBusinessInterfaces.INPUT_COMMENT),
                Click.on(CommentBusinessInterfaces.BTN_SEND_COMMENT)
        );
    }
    public static CommentBusiness the(){
        return instrumented(CommentBusiness.class);
    }
}
