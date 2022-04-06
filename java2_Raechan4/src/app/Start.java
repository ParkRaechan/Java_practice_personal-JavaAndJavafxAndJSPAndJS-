package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Start extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		
		Image image = new Image("/img/레트로 아케이드.png");
		
		stage.getIcons().add(image);
		
		
		
		stage.setResizable(true);
		stage.setTitle("에프엑스 연습창");
		stage.show();
		
	} 
	
	public static void main(String[] args) {
		launch(args);
	}
	//
	
}
