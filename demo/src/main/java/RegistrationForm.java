import com.cat2.demo.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class RegisterForm extends JFrame {

    // ... (rest of your Swing UI code)

    @Autowired
    private RegistrationService registrationService;

    private void saveDataToDatabase() {
        String name = nameField.getText();
        String username = usernameField.getText();
        String password = passwordField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();

        boolean registrationSuccess = registrationService.registerUser(name, username, password, email, phone, address);

        if (registrationSuccess) {
            JOptionPane.showMessageDialog(this, "Registration successful!");
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed!");
        }
    }


}
