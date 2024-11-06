package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.RedSummer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MapController {
    public void handleSFButton() {
        handleOpenPopup(Constants.Event.SAN_FRANCISCO);
    }
    public void handleOpenPopup(Constants.Event eventIndex) throws IOException
        Stage stage = newStage();
    stage.initModality(Modality.APPLICATION_MODAL);

    FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
    Scene scene = new Scene(fxmlLoader.load());
    stage.setScene(scene);
    stage.setTitle(CITY_VIEW_TITLE);
    CityController cityController = fxmlLoader.getController();
    cityController.initData(eventIndex);
    stage.show();

}
