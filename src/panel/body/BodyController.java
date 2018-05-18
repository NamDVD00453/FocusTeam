package panel.body;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BodyController implements Initializable {

    @FXML
    private Pane pnMain;
    @FXML
    private JFXButton btnDashboard, btnManager, btnAdd, btnAttend, btnReport, btnStatistic;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        setDefault();
        loadPane("dashboard");

    }

    private void loadPane(String name){
        try {
            Pane pane = FXMLLoader.load(getClass().getResource("/panel/" + name +
                    "/" + name +
                    ".fxml"));
            pnMain.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setDefault(){
        pnMain.getChildren().removeAll();
        btnDashboard.setStyle("-fx-background-color: white");
        btnAdd.setStyle("-fx-background-color: white");
        btnManager.setStyle("-fx-background-color: white");
        btnAttend.setStyle("-fx-background-color: white");
        btnReport.setStyle("-fx-background-color: white");
        btnStatistic.setStyle("-fx-background-color: white");

        btnDashboard.setStyle("-fx-text-fill: #8d8d8d");
        btnManager.setStyle("-fx-text-fill: #8d8d8d");
        btnAttend.setStyle("-fx-text-fill: #8d8d8d");
        btnAdd.setStyle("-fx-text-fill: #8d8d8d");
        btnReport.setStyle("-fx-text-fill: #8d8d8d");
        btnStatistic.setStyle("-fx-text-fill: #8d8d8d");


    }


    @FXML
    private void handlSelect(ActionEvent event){
        JFXButton clicked = (JFXButton) event.getSource();
        if (clicked == btnDashboard){
            setDefault();
            loadPane("dashboard");
            btnDashboard.setStyle("-fx-background-color: #f3f3f3");
            btnDashboard.setStyle("-fx-text-fill: #00bdda");
        } else if (clicked == btnManager){
            setDefault();
            loadPane("manager");
            btnManager.setStyle("-fx-background-color: #f3f3f3");
            btnManager.setStyle("-fx-text-fill: #00bdda");
        } else if (clicked == btnAttend){
            setDefault();
            loadPane("attend");
            btnAttend.setStyle("-fx-background-color: #f3f3f3");
            btnAttend.setStyle("-fx-text-fill: #00bdda");
        } else if (clicked == btnAdd){
            setDefault();
            loadPane("add");
            btnAdd.setStyle("-fx-background-color: #f3f3f3");
            btnAdd.setStyle("-fx-text-fill: #00bdda");
        } else if (clicked ==  btnReport){
            setDefault();
            loadPane("report");
            btnReport.setStyle("-fx-background-color: #f3f3f3");
            btnReport.setStyle("-fx-text-fill: #00bdda");
        } else if (clicked == btnStatistic){
            setDefault();
            loadPane("statistic");
            btnStatistic.setStyle("-fx-background-color: #f3f3f3");
            btnStatistic.setStyle("-fx-text-fill: #00bdda");
        }
    }
}
