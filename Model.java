import java.io.File;

public class Model {

	
	Controller controller;
	Parser parser;
	View view;

	Model() {
		controller = new Controller(this);
		view = new View(this);
		
	}
	
	public void startParsing(File file){
		parser = new Parser(file);
	}

	public static void main(String args[]) {
		new Model();
	}

}
