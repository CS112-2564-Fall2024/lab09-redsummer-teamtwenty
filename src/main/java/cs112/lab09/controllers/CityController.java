package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.scene.control.Label;

public class CityController {
    @FXML
    Label locationLabel;
    public void initData(Constants.Event eventIndex) {
        String[] data = HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
        locationLabel.setText(event.getLocation());
    }
}
