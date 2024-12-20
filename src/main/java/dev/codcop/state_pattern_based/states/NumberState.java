package dev.codcop.state_pattern_based.states;

import dev.codcop.state_pattern_based.EmailValidator;
import dev.codcop.state_pattern_based.IState;

public class NumberState implements IState {

    @Override
    public void handleChar(EmailValidator context, char text) {
        if (Character.isDigit(text)) {

        } else if (text == '@') {
            context.setState(new AtSymbolState());
        } else {
            context.setState(new InvalidState());
        }
    }
}
