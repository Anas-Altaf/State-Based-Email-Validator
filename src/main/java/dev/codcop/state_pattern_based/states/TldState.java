package dev.codcop.state_pattern_based.states;

import dev.codcop.state_pattern_based.EmailValidator;
import dev.codcop.state_pattern_based.IState;

public class TldState implements IState {

    @Override
    public void handleChar(EmailValidator context, char text) {
        if (Character.isLetter(text)) {

        } else {
            context.setState(new InvalidState());
        }
    }
}
