module JavaFxEmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;


    opens com.launcher;
    opens com.launcher.view;
    opens com.launcher.controller;
}