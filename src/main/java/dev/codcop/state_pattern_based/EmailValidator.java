package dev.codcop.state_pattern_based;

import dev.codcop.state_pattern_based.states.InvalidState;
import dev.codcop.state_pattern_based.states.StartState;
import dev.codcop.state_pattern_based.states.TldState;
import dev.codcop.state_pattern_based.states.ValidState;

public class EmailValidator {
    private IState state = new StartState();

    public boolean emailValidator(String email) {
        if (email.isEmpty()) {
            return false;
        }
        char[] eChars = email.toCharArray();

        for (char c : eChars) {
            state.handleChar(this, c);
            if (state instanceof InvalidState) {
                return false;
            }
        }
        if (state instanceof TldState) {
            state = new ValidState();
        }
        return state instanceof ValidState;
    }

    // Setting State
    public void setState(IState state) {
        this.state = state;
    }

}
