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
		
		Image image = new Image("/img/��Ʈ�� �����̵�.png");
		
		stage.getIcons().add(image);
				
		//������â x��ư ��������
		stage.setOnCloseRequest(e ->{
			
			if(Front.member !=null) {
				RoomDao.roomDao.roomlivedelete(Front.member.getMid());
				if(Chatting.selectroom != null) {
					// 1. �� ���Ӹ�� ����
					RoomDao.roomDao.roomlivedelete( Front.member.getMid() );
					// 2. �� ���� 
					RoomDao.roomDao.roomdelete( Chatting.selectroom.getRonum() );
				
				}
			}
		});
		
		stage.setResizable(true);
		stage.setTitle("�������� ����â");
		stage.show();
		
	} 
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}
