package pt.iade.carStand.models;

import javafx.collections.ObservableList;
import pt.iade.carStand.models.Car;

public class Carlist {
		
	public class Shoplist {
		private String name;
		private ObservableList<Car> items;
		public Shoplist(String name, ObservableList<Car> items) {
			this.name = name;
			this.items = items;
		}
	}
}
