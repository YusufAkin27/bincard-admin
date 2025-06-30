package com.bincard.bincard_admin;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MainMenuFX {
    private Stage stage;

    public MainMenuFX(Stage stage) {
        this.stage = stage;
        createUI();
    }

    private void createUI() {
        // Ana container
        VBox mainContainer = new VBox(30);
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setStyle("-fx-background-color: linear-gradient(to bottom right, #667eea 0%, #764ba2 100%);");
        mainContainer.setPadding(new Insets(40));

        // Başlık
        javafx.scene.control.Label title = new javafx.scene.control.Label("Bincard Admin Paneli");
        title.setFont(Font.font("Segoe UI", FontWeight.BOLD, 36));
        title.setTextFill(Color.WHITE);
        title.setAlignment(Pos.CENTER);

        // Buton container
        VBox buttonContainer = new VBox(20);
        buttonContainer.setAlignment(Pos.CENTER);
        buttonContainer.setMaxWidth(400);

        // Admin Giriş butonu
        Button loginButton = new Button("Admin Giriş");
        loginButton.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
        loginButton.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-background-radius: 10; -fx-cursor: hand; -fx-padding: 15 30;");
        loginButton.setPrefWidth(300);
        loginButton.setPrefHeight(60);
        loginButton.setOnMouseEntered(e -> loginButton.setStyle("-fx-background-color: #2980b9; -fx-text-fill: white; -fx-background-radius: 10; -fx-cursor: hand; -fx-padding: 15 30;"));
        loginButton.setOnMouseExited(e -> loginButton.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-background-radius: 10; -fx-cursor: hand; -fx-padding: 15 30;"));

        // Admin Kayıt butonu
        Button signupButton = new Button("Admin Kayıt");
        signupButton.setFont(Font.font("Segoe UI", FontWeight.BOLD, 20));
        signupButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-background-radius: 10; -fx-cursor: hand; -fx-padding: 15 30;");
        signupButton.setPrefWidth(300);
        signupButton.setPrefHeight(60);
        signupButton.setOnMouseEntered(e -> signupButton.setStyle("-fx-background-color: #229954; -fx-text-fill: white; -fx-background-radius: 10; -fx-cursor: hand; -fx-padding: 15 30;"));
        signupButton.setOnMouseExited(e -> signupButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-background-radius: 10; -fx-cursor: hand; -fx-padding: 15 30;"));

        // Event handlers
        loginButton.setOnAction(e -> {
            System.out.println("Admin Giriş butonuna tıklandı!");
            try {
                new AdminLoginFX(stage);
                System.out.println("AdminLoginFX başarıyla oluşturuldu!");
            } catch (Exception ex) {
                System.err.println("AdminLoginFX oluşturulurken hata: " + ex.getMessage());
                ex.printStackTrace();
            }
        });
        signupButton.setOnAction(e -> new AdminSignupFX(stage));

        // Container'a butonları ekle
        buttonContainer.getChildren().addAll(loginButton, signupButton);

        // Ana container'a elemanları ekle
        mainContainer.getChildren().addAll(title, buttonContainer);

        // Scene oluştur
        Scene scene = new Scene(mainContainer, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Bincard Admin Paneli");
        stage.setResizable(false);
    }
} 