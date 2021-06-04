import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField Login;
    @FXML
    PasswordField Password;
    @FXML
    Label TextLabel;

    @FXML
    public void click(ActionEvent Event){
        if (Login.getText().equals("Admin") && Password.getText().equals("Password")){
            TextLabel.setText("Hello Admin");
        } else{
            TextLabel.setText("Authorisation Error");
        }
    }
    @FXML
    public void clickTwo(ActionEvent Event){
        Login.setText("");
        Password.setText("");
        TextLabel.setText("Type the login and password");
    }
}