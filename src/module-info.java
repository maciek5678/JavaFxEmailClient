module JavaFxEmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;


    opens com.launcher;
    opens com.launcher.view;
    opens com.launcher.controller;
    opens com.launcher.model;
}