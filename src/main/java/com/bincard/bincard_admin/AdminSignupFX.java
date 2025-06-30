package com.bincard.bincard_admin;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class AdminSignupFX {
    private TextField nameField;
    private TextField surnameField;
    private TextField phoneField;
    private TextField emailField;
    private PasswordField passwordField;
    private PasswordField passwordRepeatField;
    private Button signupButton;
    private Button backButton;
    private TextArea resultArea;
    private Stage stage;

    public AdminSignupFX(Stage stage) {
        this.stage = stage;
        createUI();
    }

    private void createUI() {
        // Ana container
        VBox mainContainer = new VBox(20);
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setStyle("-fx-background-color: linear-gradient(to bottom right, #667eea 0%, #764ba2 100%);");
        mainContainer.setPadding(new Insets(40));

        // Kart container
        VBox card = new VBox(20);
        card.setAlignment(Pos.CENTER);
        card.setStyle("-fx-background-color: white; -fx-background-radius: 15; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.3), 10, 0, 0, 0);");
        card.setPadding(new Insets(40));
        card.setMaxWidth(500);
        card.setPrefWidth(500);

        // Başlık
        Label title = new Label("Admin Kayıt");
        title.setFont(Font.font("Segoe UI", FontWeight.BOLD, 32));
        title.setTextFill(Color.web("#2c3e50"));
        title.setAlignment(Pos.CENTER);

        // Ad alanı
        VBox nameContainer = new VBox(8);
        Label nameLabel = new Label("Ad:");
        nameLabel.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 16));
        nameLabel.setTextFill(Color.web("#34495e"));
        
        nameField = new TextField();
        nameField.setPromptText("Adınızı giriniz");
        nameField.setStyle("-fx-font-size: 16; -fx-padding: 12; -fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #3498db; -fx-border-width: 2;");
        nameField.setPrefHeight(45);

        nameContainer.getChildren().addAll(nameLabel, nameField);

        // Soyad alanı
        VBox surnameContainer = new VBox(8);
        Label surnameLabel = new Label("Soyad:");
        surnameLabel.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 16));
        surnameLabel.setTextFill(Color.web("#34495e"));
        
        surnameField = new TextField();
        surnameField.setPromptText("Soyadınızı giriniz");
        surnameField.setStyle("-fx-font-size: 16; -fx-padding: 12; -fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #3498db; -fx-border-width: 2;");
        surnameField.setPrefHeight(45);

        surnameContainer.getChildren().addAll(surnameLabel, surnameField);

        // Telefon alanı
        VBox phoneContainer = new VBox(8);
        Label phoneLabel = new Label("Telefon (Kullanıcı Adı):");
        phoneLabel.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 16));
        phoneLabel.setTextFill(Color.web("#34495e"));
        
        phoneField = new TextField();
        phoneField.setPromptText("Telefon numaranızı giriniz");
        phoneField.setStyle("-fx-font-size: 16; -fx-padding: 12; -fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #3498db; -fx-border-width: 2;");
        phoneField.setPrefHeight(45);

        phoneContainer.getChildren().addAll(phoneLabel, phoneField);

        // Email alanı
        VBox emailContainer = new VBox(8);
        Label emailLabel = new Label("Email:");
        emailLabel.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 16));
        emailLabel.setTextFill(Color.web("#34495e"));
        
        emailField = new TextField();
        emailField.setPromptText("Email adresinizi giriniz");
        emailField.setStyle("-fx-font-size: 16; -fx-padding: 12; -fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #3498db; -fx-border-width: 2;");
        emailField.setPrefHeight(45);

        emailContainer.getChildren().addAll(emailLabel, emailField);

        // Şifre alanı
        VBox passwordContainer = new VBox(8);
        Label passwordLabel = new Label("Şifre:");
        passwordLabel.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 16));
        passwordLabel.setTextFill(Color.web("#34495e"));
        
        passwordField = new PasswordField();
        passwordField.setPromptText("Şifrenizi giriniz (en az 6 karakter)");
        passwordField.setStyle("-fx-font-size: 16; -fx-padding: 12; -fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #3498db; -fx-border-width: 2;");
        passwordField.setPrefHeight(45);

        passwordContainer.getChildren().addAll(passwordLabel, passwordField);

        // Şifre tekrar alanı
        VBox passwordRepeatContainer = new VBox(8);
        Label passwordRepeatLabel = new Label("Şifre Tekrar:");
        passwordRepeatLabel.setFont(Font.font("Segoe UI", FontWeight.NORMAL, 16));
        passwordRepeatLabel.setTextFill(Color.web("#34495e"));
        
        passwordRepeatField = new PasswordField();
        passwordRepeatField.setPromptText("Şifrenizi tekrar giriniz");
        passwordRepeatField.setStyle("-fx-font-size: 16; -fx-padding: 12; -fx-background-radius: 8; -fx-border-radius: 8; -fx-border-color: #3498db; -fx-border-width: 2;");
        passwordRepeatField.setPrefHeight(45);

        passwordRepeatContainer.getChildren().addAll(passwordRepeatLabel, passwordRepeatField);

        // Kayıt butonu
        signupButton = new Button("Kayıt Ol");
        signupButton.setFont(Font.font("Segoe UI", FontWeight.BOLD, 18));
        signupButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-background-radius: 8; -fx-cursor: hand;");
        signupButton.setPrefHeight(50);
        signupButton.setMaxWidth(Double.MAX_VALUE);
        signupButton.setOnMouseEntered(e -> signupButton.setStyle("-fx-background-color: #229954; -fx-text-fill: white; -fx-background-radius: 8; -fx-cursor: hand;"));
        signupButton.setOnMouseExited(e -> signupButton.setStyle("-fx-background-color: #27ae60; -fx-text-fill: white; -fx-background-radius: 8; -fx-cursor: hand;"));

        // Sonuç alanı
        resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setWrapText(true);
        resultArea.setPrefRowCount(4);
        resultArea.setStyle("-fx-font-size: 14; -fx-background-color: #f8f9fa; -fx-border-color: #dee2e6; -fx-border-radius: 8; -fx-background-radius: 8;");
        resultArea.setPrefHeight(100);

        // Geri dön butonu
        backButton = new Button("← Geri Dön");
        backButton.setFont(Font.font("Segoe UI", FontWeight.BOLD, 16));
        backButton.setStyle("-fx-background-color: #95a5a6; -fx-text-fill: white; -fx-background-radius: 8; -fx-cursor: hand;");
        backButton.setPrefHeight(40);
        backButton.setOnMouseEntered(e -> backButton.setStyle("-fx-background-color: #7f8c8d; -fx-text-fill: white; -fx-background-radius: 8; -fx-cursor: hand;"));
        backButton.setOnMouseExited(e -> backButton.setStyle("-fx-background-color: #95a5a6; -fx-text-fill: white; -fx-background-radius: 8; -fx-cursor: hand;"));

        // Event handlers
        signupButton.setOnAction(e -> handleSignup());
        backButton.setOnAction(e -> showMainMenu());

        // Enter tuşu ile kayıt
        passwordRepeatField.setOnAction(e -> handleSignup());

        // Kart içeriğini oluştur
        card.getChildren().addAll(
            title, 
            nameContainer, 
            surnameContainer, 
            phoneContainer, 
            emailContainer,
            passwordContainer, 
            passwordRepeatContainer, 
            signupButton, 
            resultArea, 
            backButton
        );

        // Ana container'a kartı ekle
        mainContainer.getChildren().add(card);

        // Scene oluştur
        Scene scene = new Scene(mainContainer, 800, 800);
        stage.setScene(scene);
        stage.setTitle("Admin Kayıt - Bincard Admin");
        stage.setResizable(false);
    }

    private void handleSignup() {
        String name = nameField.getText().trim();
        String surname = surnameField.getText().trim();
        String phone = phoneField.getText().trim();
        String email = emailField.getText().trim();
        String password = passwordField.getText();
        String passwordRepeat = passwordRepeatField.getText();

        if (name.isEmpty() || surname.isEmpty() || phone.isEmpty() || email.isEmpty() || password.isEmpty() || passwordRepeat.isEmpty()) {
            showResult("Tüm alanlar zorunludur!", false);
            return;
        }

        if (!password.equals(passwordRepeat)) {
            showResult("Şifreler eşleşmiyor!", false);
            return;
        }

        if (password.length() < 6) {
            showResult("Şifre en az 6 karakter olmalıdır!", false);
            return;
        }

        String phoneOnlyDigits = phone.replaceAll("\\D", "");
        if (!phoneOnlyDigits.matches("^\\d{10,11}$")) {
            showResult("Geçerli bir telefon numarası giriniz!", false);
            return;
        }
        
        if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            showResult("Geçerli bir email adresi giriniz!", false);
            return;
        }

        // UI'ı devre dışı bırak
        setUIEnabled(false);
        signupButton.setText("Kayıt yapılıyor...");

        // Arka planda kayıt işlemini yap
        new Thread(() -> {
            try {
                // JavaFX için ipAddress, uuid, userAgent üret
                String ipAddress = ApiClientFX.getPublicIpAddress();
                String deviceUuid = java.util.UUID.randomUUID().toString();
                String userAgent = System.getProperty("os.name") + " - JavaFX Client";

                // ApiClientFX.signup metodunu güncelle
                String result = ApiClientFX.signup(
                        name,
                        surname,
                        phoneOnlyDigits,
                        password,
                        email,
                        ipAddress,
                        deviceUuid,
                        userAgent
                );
                
                Platform.runLater(() -> {
                    showResult("Kayıt başarılı!\n" + result, true);
                    setUIEnabled(true);
                    signupButton.setText("Kayıt Ol");
                });
            } catch (Exception ex) {
                Platform.runLater(() -> {
                    showResult("Kayıt başarısız: " + ex.getMessage(), false);
                    setUIEnabled(true);
                    signupButton.setText("Kayıt Ol");
                });
            }
        }).start();
    }

    private void showResult(String message, boolean isSuccess) {
        resultArea.setText(message);
        if (isSuccess) {
            resultArea.setStyle("-fx-font-size: 14; -fx-background-color: #d4edda; -fx-border-color: #c3e6cb; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #155724;");
        } else {
            resultArea.setStyle("-fx-font-size: 14; -fx-background-color: #f8d7da; -fx-border-color: #f5c6cb; -fx-border-radius: 8; -fx-background-radius: 8; -fx-text-fill: #721c24;");
        }
    }

    private void setUIEnabled(boolean enabled) {
        nameField.setDisable(!enabled);
        surnameField.setDisable(!enabled);
        phoneField.setDisable(!enabled);
        emailField.setDisable(!enabled);
        passwordField.setDisable(!enabled);
        passwordRepeatField.setDisable(!enabled);
        signupButton.setDisable(!enabled);
        backButton.setDisable(!enabled);
    }

    private void showMainMenu() {
        new MainMenuFX(stage);
    }
} 