package dev.codcop.state_based;

//F223639@codcop.dev
public class CredUtils {
    public static boolean emailValidator(String email) {
        if (email.isEmpty()) {
            return false;
        }
        char[] eChars = email.toCharArray();
        State state = State.START;
        for (char c : eChars) {
            switch (state) {
                case START:
                    if (Character.isLetter(c)) {
                        state = State.USER;
                    } else {
                        state = State.INVALID;
                    }
                    break;
                case USER:
                    if (Character.isDigit(c)) {

                    } else if (c == '@') {
                        state = State.AT_SYMBOL;
                    } else {
                        state = State.INVALID;
                    }
                    break;
                case AT_SYMBOL:
                    if (Character.isLetter(c)) {
                        state = State.DOMAIN;
                    } else {
                        state = State.INVALID;
                    }
                    break;
                case DOMAIN:
                    if (Character.isLetter(c)) {

                    } else if (c == '.') {
                        state = State.DOT;
                    } else {
                        state = State.INVALID;
                    }
                    break;
                case DOT:
                    if (Character.isLetter(c)) {
                        state = State.TLD;
                    } else {
                        state = State.INVALID;
                    }
                    break;
                case TLD:
                    if (Character.isLetter(c)) {
                    } else {
                        state = State.INVALID;
                    }
                    break;
                case INVALID:
                    return false;
                default:
                    state = State.INVALID;
                    break;
            }
        }
        if (state == State.TLD) {
            state = State.VALID;
        }
        return state == State.VALID;
    }
}
