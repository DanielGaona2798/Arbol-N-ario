package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

import model.Node;
import views.FileChooser;
import views.MainWindow;

public class Controller{

	private FileChooser chooser;
	ArrayList<String> files;
	private File file = new File("");
	private Node root = new Node();
	private MainWindow window;

	public Controller() {
		window = new MainWindow(this);
		files = new ArrayList<>();
		chooser = new FileChooser(this);
		file = new File(chooser.getPathFile());
		root.setName(file.getPath());
		createTree(root);
		getExtensions();
		window.setData(root,files,getExtensions());
		window.setVisible(true);

	}

	private void createTree(Node node) {
		for (File file : new File(node.getName()).listFiles()) {
			if(file.isDirectory()) {
				Node aux = new Node();
				aux.setName(file.getPath());
				createTree(aux);
				node.addNode(aux);
			}else {
				node.addFile(file.getPath());
				files.add(file.getName());
			}
		}
	}

	private String getFileExtension(File file) {
		String name = file.getName();
		try {
			return name.substring(name.lastIndexOf(".") + 1);
		} catch (Exception e) {
			return "";
		}
	}

	public HashSet<String> getExtensions(){
		HashSet<String> extensions = new HashSet<>();
		for (String file: files) {
			extensions.add(getFileExtension(new File(file)));
		}
		return extensions;
	}


}
