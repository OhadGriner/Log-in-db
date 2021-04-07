package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class LoginController {
    @FXML
    private Button loginButton;
    @FXML
    private Button cancelButton;
    @FXML
    private Label invalidLabel;


    public void loginButtonAction(ActionEvent event){
        if(true)//change later to wrong password
            invalidLabel.setText("Invalid Login - Try again");
    }

    public void cancelButtonAction(ActionEvent event){
        Stage stage=(Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

}
