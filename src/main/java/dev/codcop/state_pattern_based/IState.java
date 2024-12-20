package dev.codcop.state_pattern_based;

public interface IState {
    public void handleChar(EmailValidator context, char text);
}
