package controller.front;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Frontpane implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnfindid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Label lblconfirm;

    @FXML
    void accfindid(ActionEvent event) {
    	System.out.println(" ���̵�ã�� �������� �̵� ");
    	Front.instance.loadpage("/view/front/findidpane.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println(" �н�����ã�� �������� �̵� ");
    	Front.instance.loadpage("/view/front/findpasswordpane.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println(" ȸ������ �������� �̵� ");
    	// *ȸ������ ��ư�� ������ login��Ʈ��Ŭ���� �� borderpane �����̳� center ������ ����
    	// ���� : �ٸ� Ŭ������ �����̳� ȣ�� 
//    		Login login = new Login(); // ���ο� �����̳� ���� [ x ]
//    		login.loadpage("/view/signuppane.fxml"); // [ x ]
    	// �ذ��� : ���� �����̳� �������� ��� !!!! -> this
    	Front.instance.loadpage("/view/front/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	System.out.println(" �α���ó��");
    	
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	boolean result = MemberDao.memberDao.login(id, password);
    	if(result) {
    		lblconfirm.setText("�α��μ���");
    		Front.member = MemberDao.memberDao.getmember(id);
    		
    		
    		boolean result2 = MemberDao.memberDao.pointplus();
    		if(result2) {
        		Front.member = MemberDao.memberDao.getmember(id);

        		Main.instance.loadpage("/view/home/home.fxml");

    		}
    	}else {
    		lblconfirm.setText("������ ���̵� �������� �ʴ´�,,,");
    	}
    	
    }
    
	
	
}






