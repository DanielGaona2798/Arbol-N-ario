package controllers;

import views.FileChooser;

public class Controller {

	
	private FileChooser fileChooser;
	
	public Controller() throws Exception {
		fileChooser = new FileChooser(this);
		fileChooser.getPathFile();
	}
}
