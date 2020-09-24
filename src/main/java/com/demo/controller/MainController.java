package com.demo.controller;

import com.demo.ui.UiUtil;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainController extends AnchorPane {

  @FXML
  private TableView tableView;

  @FXML
  private TextField textField;

  @FXML
  private Button button;

  public MainController() {
    UiUtil.loadFxml(this);
    UiUtil.initializeFont();
//    final String e1 = UiUtil.class.getResource("styles.css").toExternalForm();
//    this.getStylesheets().add(e1);
//    final String e = this.getClass().getResource("main.css").toExternalForm();
    this.getStylesheets().add(getClass().getResource("/com/demo/ui/styles.css").toExternalForm());
//    this.getStylesheets().add()
    button.setOnAction(event -> handleButton());
  }

  private void handleButton() {
    final Stage stage = new Stage();
    final Scene scene = new Scene(new TableView<>());

    stage.initModality(Modality.WINDOW_MODAL);
    stage.setTitle("Button Window");
    stage.setScene(scene);
    stage.show();
  }
}
