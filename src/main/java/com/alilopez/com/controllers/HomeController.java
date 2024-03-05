package com.alilopez.com.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.alilopez.com.models.Email;
import com.alilopez.com.models.Message;
import com.alilopez.com.models.SMS;
import com.alilopez.com.models.WhatsApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button enviarButton;

    @FXML
    private ComboBox<String> medioComboBox;

    @FXML
    private ListView<String> logListView;

    @FXML
    private TextArea messageTextArea;

    @FXML
    private Button salirButton;
    private Message message;

    @FXML
    void onClickEnviarButton(MouseEvent event) {
        message.setText(messageTextArea.getText());
        switch (medioComboBox.getValue()){
            case "WhatsApp":
                message.setConn(new WhatsApp());
                break;
            case "Email":
                message.setConn(new Email());
                break;
            case "SMS":
                message.setConn(new SMS());
        }
        message.sendMessage();
        logListView.getItems().add(medioComboBox.getValue());
    }

    @FXML
    void onClickSalirButton(MouseEvent event) {

    }

    @FXML
    void initialize() {
        medioComboBox.getItems().addAll("WhatsApp", "Email", "SMS");
        message = new Message();
    }

}
