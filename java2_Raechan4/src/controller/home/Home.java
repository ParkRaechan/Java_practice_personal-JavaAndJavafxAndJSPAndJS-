package controller.home;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import controller.front.Front;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Home implements Initializable {
				// fxml ����� �ʱⰪ ���� �������̽� 
	public static Home home; // ��ü 
	
	// * this : ���� Ŭ������ �޸� ȣ��
	public Home() { home = this; }
	
	
	@FXML
	private Label lblloginid;
	@FXML
	private Label lblpoint;
	@FXML
	private Label lbllogout;
	@FXML
	private Label lbldelete; // fxid��������
	@FXML
	private Label lblinfo; // fxid��������
	@FXML
	private BorderPane borderpane;
	@FXML
	private Label lblupdate; // fxid��������
	@FXML
	private Label lblboard; // fxid��������
	@FXML
	private Label lblproduct1; // fxid��������
	@FXML
	private Label lblproduct2; // fxid��������
	@FXML
	private Label lblproduct3; // fxid��������
	@FXML
	private Label lblproduct4; // fxid��������

	public static String category;
	
	
	@FXML// �����Ƿ� ���̺��� Ŭ�������� �̺�Ʈ
	public void accproduct1( MouseEvent e ) { 
		category="���ӱ�";
		loadpage("/view/product/product.fxml"); 
		
	}
	@FXML// �����Ƿ� ���̺��� Ŭ�������� �̺�Ʈ
	public void accproduct2( MouseEvent e ) { 
		category="���ð�����";
		loadpage("/view/product/product.fxml"); 
	}
	@FXML// ���ӱ�� ���̺��� Ŭ�������� �̺�Ʈ
	public void accproduct3( MouseEvent e ) { 
		category="������������";
		loadpage("/view/product/product.fxml"); 
	}
	@FXML// ��Ȱ��ǰ ���̺��� Ŭ�������� �̺�Ʈ
	public void accproduct4( MouseEvent e ) { 
		category="�׼ǰ�����";
		loadpage("/view/product/product.fxml"); 
	}
	
	
	//���� ���� �ѷ�����
	@FXML
	public void hallinfo( MouseEvent e) {
		controller.Main.l++;
		if(controller.Main.l%7!=0) {
			loadpage("/view/home/hallway.fxml");
		}else {
			loadpage("/view/home/hallway_ghost.fxml");
		}
		
	}
	
	
	
	@FXML// �����Խ� ���̺��� Ŭ�������� �̺�Ʈ
	int k=0;
	public void accboard( MouseEvent e ) {
		k++;
		if(k%2!=0) {
			loadpage("/view/board/board.fxml"); 
		}else {
			Main.instance.loadpage("/view/home/home.fxml");
		}
	}
	
	
	@Override // ���� �ʱ� �޼ҵ� 
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblloginid.setText( Front.member.getMid()+" ��" );
		lblpoint.setText("����Ʈ : "+ Front.member.getMpoint()+" ��");
		loadpage("/view/home/homeview.fxml");
	}
	int i = 0 ;
	@FXML// ȸ��Ż�� ���̺��� Ŭ�������� �̺�Ʈ
	public void accinfo( MouseEvent e ) {
		
		i++;
		if(i%2!=0) {
			loadpage("/view/home/info.fxml"); 
				
		}else {
			Main.instance.loadpage("/view/home/home.fxml");
		}
		
	}
	
	public void loadpage( String page ) {
		try {
			Parent parent = FXMLLoader.load( getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch( Exception e ) {}
	}
	
	@FXML // �α׾ƿ� ���̺� Ŭ�������� �̺�Ʈ
	public void logout( MouseEvent e  ) {
		
		// 1. �޽��� ���� 
				Alert alert = new Alert( AlertType.CONFIRMATION ); // Ȯ��,��� ��ư Ÿ�� 
					alert.setHeaderText("���� �α׾ƿ� �Ͻðڽ��ϱ�?");
				// 2. ��ư Ȯ�� [ Optional : Ŭ���� 
				Optional<ButtonType> optional = alert.showAndWait(); // ����
				if( optional.get() == ButtonType.OK ) { // Ȯ�� ��ư�� �������� 
					// ȸ��Ż�� ���� 
					
					
						// �α׾ƿ� [ Login Ŭ������ Member ��ü null ���� ���� ] 
						Front.member = null;
						// ��������ȯ
						Main.instance.loadpage("/view/front/front.fxml");
					 // Ż�� ����
						
					
				}
		
		
		
	}
	
	
	@FXML// ȸ��Ż�� ���̺��� Ŭ�������� �̺�Ʈ
	public void delete( MouseEvent e ) {
		
		// 1. �޽��� ���� 
		Alert alert = new Alert( AlertType.CONFIRMATION ); // Ȯ��,��� ��ư Ÿ�� 
			alert.setHeaderText("���� Ż�� �Ͻðڽ��ϱ�?");
		// 2. ��ư Ȯ�� [ Optional : Ŭ���� 
		Optional<ButtonType> optional = alert.showAndWait(); // ����
		if( optional.get() == ButtonType.OK ) { // Ȯ�� ��ư�� �������� 
			// ȸ��Ż�� ���� 
			boolean result= MemberDao.memberDao.delete( Front.member.getMnum() );
								// ���� �α������� ȸ���� ��ȣ ȣ��
			if( result ) { // Ż�� ���� 
				// �α׾ƿ� [ Login Ŭ������ Member ��ü null ���� ���� ] 
				Front.member = null;
				// ��������ȯ
				Main.instance.loadpage("/view/front/front.fxml");
			}else { // Ż�� ����
				
			}
		}
		// �ƴϸ� 
	}
	
	
	
	@FXML// ȸ������ ���̺��� Ŭ�������� �̺�Ʈ
	
	int j = 0 ;
	@FXML// ȸ��Ż�� ���̺��� Ŭ�������� �̺�Ʈ
	public void accupdate( MouseEvent e ) {
		
		j++;
		if(j%2!=0) {
			loadpage("/view/home/update.fxml");	
		}else {
			Main.instance.loadpage("/view/home/home.fxml");
		}
		
	}
	
	
}
