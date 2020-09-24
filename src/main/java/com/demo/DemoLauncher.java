/*
 * Developed 2018 by GSD, Satrec Initiative, Co., Ltd.
 * 441 Expo-ro, Yuseong-gu, Daejeon, 305-714, Korea (Munji R&D)
 * http://www.satreci.com
 * All rights reserved.
 *
 *
 * This software is the confidential information
 * of Satrec Initiative. You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license agreement
 * you entered into with SI.
 */

package com.demo;

import com.demo.controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class DemoLauncher extends Application {
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    final MainController controller = new MainController();
    Scene scene = new Scene(controller);
    primaryStage.setTitle("Demo Application");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
