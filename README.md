# Email Validator Project

This project demonstrates two approaches to implementing an email validator in Java:

1. Using a switch-based state machine.
2. Using the State Design Pattern.

## Project Structure

### Project Directory Structure

```plaintext
project-root/
├── src/
│   └── main/
│       └── java/
│           └── dev/
│               └── codcop/
│                   ├── Main.java
│                   ├── state_based/
│                   │   └── CredUtils.java
│                   └── state_pattern_based/
│                       ├── EmailValidator.java
│                       ├── IState.java
│                       └── states/
│                           ├── AtSymbolState.java
│                           ├── DomainState.java
│                           ├── DotState.java
│                           ├── InvalidState.java
│                           ├── StartState.java
│                           ├── TldState.java
│                           └── ValidState.java
├── pom.xml
└── README.md
```

- `src/main/java/dev/codcop/Main.java`: Entry point of the application.
- `src/main/java/dev/codcop/state_based/CredUtils.java`: Contains the switch-based state machine implementation.
- `src/main/java/dev/codcop/state_pattern_based/EmailValidator.java`: Contains the State Design Pattern implementation.
- `src/main/java/dev/codcop/state_pattern_based/IState.java`: Interface for state classes.
- `src/main/java/dev/codcop/state_pattern_based/states/`: Directory containing concrete state classes for the State
  Design Pattern.

## How to Run

1. **Clone the repository**:
    ```sh
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Build the project using Maven**:
    ```sh
    mvn clean install
    ```

3. **Run the application**:
    ```sh
    mvn exec:java -Dexec.mainClass="dev.codcop.Main"
    ```

## Email Validation Approaches

### Switch-Based State Machine

The switch-based state machine is implemented in the `CredUtils` class. It uses a series of switch cases to transition
between different states based on the input character.

### State Design Pattern

The State Design Pattern is implemented in the `EmailValidator` class. It uses separate classes for each state,
providing a clear separation of concerns and making the code easier to maintain and extend.

## Example Usage

### Switch-Based State Machine

```java
System.out.println(CredUtils.emailValidator("F223639@codcop.dev")); // true or false
```

### State Design Pattern

```java
EmailValidator emailValidator = new EmailValidator();
System.out.

println(emailValidator.emailValidator("F223639@codcop.dev")); // true or false
```

## License

This project is licensed under the MIT License.

```