package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import controller.front.Front;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Update implements Initializable {
	
	@FXML
	private TextField txtemail;
	@FXML
	private TextField txtaddress;
	@FXML
	private Button btnupdate;
	
	@FXML // ��ưŬ�� -> ActionEvent  // ���̺�Ŭ�� -> MouseEvent
	public void update( ActionEvent e ) {
		// 1. ��Ʈ�ѷ� �Է��� ������ ��������
		String email = txtemail.getText();
		String address = txtaddress.getText();
		// 2. ������Ʈó��[ ȸ����ȣ = Login.member
		System.out.println("������Ʈ�߰�ó��");
		boolean result = MemberDao.memberDao.update( Front.member.getMnum() , email, address);
		if( result ) {
			Alert alert = new Alert( AlertType.INFORMATION ); // �޽��� ���
				alert.setHeaderText("ȸ�������� �����Ǿ����ϴ�  [ �ٽ� �α������ּ���] ");
			alert.showAndWait();	
			Main.instance.loadpage("/view/front/front.fxml"); // ������ ��ȯ
			Front.member = null; // �α������� null
		}else {
			Alert alert = new Alert( AlertType.INFORMATION ); // �޽��� ���
				alert.setHeaderText("ȸ�������� ���� ���� [ �����ڿ��� ����]");
			alert.showAndWait();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtemail.setText( Front.member.getMemail() );
		txtaddress.setText( Front.member.getMaddress() );
	}

}






