package Login;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialization logic goes here
    }

    @FXML
    private void handleLoginButtonAction() {
        // Handle login button action
        String username = usernameField.getText();
        String password = passwordField.getText();
        // Implement your login logic here
    }

    @FXML
    private void handleRegisterButtonAction() {
        // Handle register button action
        // Implement your registration logic here
    }
}
