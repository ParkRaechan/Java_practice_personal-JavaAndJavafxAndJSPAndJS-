package app;

import controller.Chatting;
import controller.front.Front;
import dao.RoomDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Start extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		
		Scene scene = new Scene(parent);
		
		stage.setScene(scene);
		
		Image image = new Image("/img/레트로 아케이드.png");
		
		stage.getIcons().add(image);
				
		//윈도우창 x버튼 눌렀을시
		stage.setOnCloseRequest(e ->{
			
			if(Front.member !=null) {
				RoomDao.roomDao.roomlivedelete(Front.member.getMid());
				if(Chatting.selectroom != null) {
					// 1. 방 접속명단 삭제
					RoomDao.roomDao.roomlivedelete( Front.member.getMid() );
					// 2. 방 삭제 
					RoomDao.roomDao.roomdelete( Chatting.selectroom.getRonum() );
				
				}
			}
		});
		
		stage.setResizable(true);
		stage.setTitle("에프엑스 연습창");
		stage.show();
		
	} 
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
