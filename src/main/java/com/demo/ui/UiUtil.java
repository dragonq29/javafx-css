package com.demo.ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.text.Font;

import java.io.IOException;

public class UiUtil {

    /**
     * 폰트 초기화 및 로드.
     */
    public static synchronized void initializeFont() {
        String[] fonts = new String[]{
                "NanumBarunGothic.ttf",
                "NanumBarunGothicBold.ttf",
                "NanumBarunGothicLight.ttf",
                "NanumBarunGothicUltraLight.ttf"
        };
        for (String font : fonts) {
            Font.loadFont(UiUtil.class.getResourceAsStream("fonts/" + font), 12);
        }
    }

    /**
     * FXML을 Controller 이름을 기반으로 추출하여 읽고 등록.
     *
     * @param controller Controller 인스턴스.
     * @throws IOException 파일이 없을 때 발생.
     */
    public static void loadFxml(Parent controller) {
        try {
            final FXMLLoader loader = getFxmlLoader(controller.getClass());
            loader.setRoot(controller);
            loader.setController(controller);
            loader.load();
        } catch (Exception e) {
            throw new RuntimeException("Failed to load FXML", e);
        }
    }
    /**
     * Fxml을 Controller 클래스와 동일한 위치에서 가져오기. 예) MainController 의 경우 Main.fxml 로 변환
     *
     * @param clazz Controller 이름.
     * @return FXML Loader.
     */
    public static FXMLLoader getFxmlLoader(Class<?> clazz) {
        FXMLLoader loader = new FXMLLoader();
        final String fxmlName = clazz.getSimpleName().replace("Controller", "") + ".fxml";
        loader.setLocation(clazz.getResource(fxmlName));
        return loader;
    }
}
