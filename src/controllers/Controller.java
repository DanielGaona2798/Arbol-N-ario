package controllers;

import views.FileChooser;

public class Controller {

	
	private FileChooser fileChooser;
	private String directory;
	
	public Controller() throws Exception {
		fileChooser = new FileChooser(this);
		directory = fileChooser.getPathFile();
	}
	
}