package modelo;

import java.util.Date;

public class Agenda {

	Date data;
	Animal animal;
	
	public Agenda() {

	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
