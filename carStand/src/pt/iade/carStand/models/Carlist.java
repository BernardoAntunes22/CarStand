package pt.iade.carStand.models;

import javafx.collections.ObservableList;
import pt.iade.carStand.models.Car;

public class Carlist {
		private String name;
		private ObservableList<Car> items;
		public Carlist(String name, ObservableList<Car> items) {
			this.name = name;
			this.items = items;
		}
	}