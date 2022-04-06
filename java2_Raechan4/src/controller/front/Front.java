package controller.front;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dto.Member;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Front implements Initializable{

	public static Front instance ;
	
	public Front() {instance = this;}
	
	public static Member member;
	
	@FXML
	private MediaView mediaview;
	
	@FXML
	private BorderPane borderpane;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Media media = new Media(getClass().getResource("/img/Road.mp4").toString());
		
		MediaPlayer mediaplayer = new MediaPlayer(media);
		
		mediaview.setMediaPlayer(mediaplayer);
		
		mediaplayer.play();
		
		mediaplayer.setAutoPlay(true);
		mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaview = new MediaView(mediaplayer);
		
		
		loadpage("/view/front/frontpane.fxml");
		
	}

	void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
			
		} catch (IOException e) {
			System.out.println("¿À·ù2"+e);
		}
		
	}

	
}
