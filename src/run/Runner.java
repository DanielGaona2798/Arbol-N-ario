package run;

import controllers.Controller;

public class Runner {

	public static void main(String[] args) {
		try {
			new Controller();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
