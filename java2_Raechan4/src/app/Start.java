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
		
		Image image = new Image("/img/��Ʈ�� �����̵�.png");
		
		stage.getIcons().add(image);
		
		
		
		stage.setResizable(true);
		stage.setTitle("�������� ����â");
		stage.show();
		
	} 
	
	public static void main(String[] args) {
		launch(args);
	}
	//
	
}
