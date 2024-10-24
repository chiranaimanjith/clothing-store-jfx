package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminFormController implements Initializable {

    @FXML
    private BorderPane mainBorderPane;


    @FXML
    private Button btnLogout;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loard();
    }

    private void loard(){
        try {
            // Load the dashboard FXML file
            AnchorPane dashboard = FXMLLoader.load(getClass().getResource("/view/comman/dashboard_form.fxml"));

            // Set the loaded FXML into the CENTER area of the BorderPane
            mainBorderPane.setCenter(dashboard);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnDashboardOnAction(javafx.event.ActionEvent actionEvent) {
        loard();
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

        Stage loginStage = new Stage();
        try {
            loginStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/login_form.fxml"))));
            loginStage.setTitle("Admin Form");
            loginStage.setResizable(false);
            loginStage.show();

            btnLogout.getScene().getWindow().hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {
        try {
            AnchorPane placeOrder= FXMLLoader.load(getClass().getResource("/view/comman/place_order_form.fxml"));
            mainBorderPane.setCenter(placeOrder);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnCustomerOnAction(ActionEvent event) {
        try {
            AnchorPane placeOrder= FXMLLoader.load(getClass().getResource("/view/admin/customer_form.fxml"));
            mainBorderPane.setCenter(placeOrder);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnEmployeeOnAction(ActionEvent event) {
        try {
            AnchorPane placeOrder= FXMLLoader.load(getClass().getResource("/view/admin/employee_form.fxml"));
            mainBorderPane.setCenter(placeOrder);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnProductOnAction(ActionEvent event) {
        try {
            AnchorPane placeOrder= FXMLLoader.load(getClass().getResource("/view/comman/product_form.fxml"));
            mainBorderPane.setCenter(placeOrder);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnOrdersOnAction(ActionEvent event) {
        try {
            AnchorPane placeOrder= FXMLLoader.load(getClass().getResource("/view/comman/orders_form.fxml"));
            mainBorderPane.setCenter(placeOrder);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnSupplierOnAction(ActionEvent event) {
        try {
            AnchorPane placeOrder= FXMLLoader.load(getClass().getResource("/view/comman/supplier_form.fxml"));
            mainBorderPane.setCenter(placeOrder);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
