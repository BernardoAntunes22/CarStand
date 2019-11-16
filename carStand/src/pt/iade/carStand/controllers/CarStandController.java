package pt.iade.carStand.controllers;

import javafx.event.ActionEvent;
import pt.iade.carStand.WindowManager;
import pt.iade.carStand.models.Carlist;

public class CarStandController {
	
    private Carlist carlist;
    
    public CarStandController(Carlist carlist) {
    	this.carlist = carlist;
    }
	
    private void backToMain(ActionEvent event) {
    	WindowManager.backToMainWindow();
    }

}
