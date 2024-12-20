package dev.codcop;

import dev.codcop.state_pattern_based.EmailValidator;

public class Main {
    public static void main(String[] args) {
//        // State with Switch Cases
//        System.out.println(CredUtils.emailValidator("F223639@codcop.dev"));
        // Using State Pattern
        EmailValidator emailValidator = new EmailValidator();
        System.out.println(emailValidator.emailValidator("F223639@codcop.dev"));
    }
}