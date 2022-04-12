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
    	System.out.println(" 아이디찾기 페이지로 이동 ");
    	Front.instance.loadpage("/view/front/findidpane.fxml");
    }

    @FXML
    void accfindpassword(ActionEvent event) {
    	System.out.println(" 패스워드찾기 페이지로 이동 ");
    	Front.instance.loadpage("/view/front/findpasswordpane.fxml");
    }

    @FXML
    void accsignup(ActionEvent event) {
    	System.out.println(" 회원가입 페이지로 이동 ");
    	// *회원가입 버튼을 누르면 login컨트롤클래스 내 borderpane 컨테이너 center 페이지 변경
    	// 문제 : 다른 클래스내 컨테이너 호출 
//    		Login login = new Login(); // 새로운 컨테이너 생성 [ x ]
//    		login.loadpage("/view/signuppane.fxml"); // [ x ]
    	// 해결방안 : 기존 컨테이너 가져오는 방법 !!!! -> this
    	Front.instance.loadpage("/view/front/signuppane.fxml");
    }

    @FXML
    void login(ActionEvent event) {
    	System.out.println(" 로그인처리");
    	
    	String id = txtid.getText();
    	String password = txtpassword.getText();
    	boolean result = MemberDao.memberDao.login(id, password);
    	if(result) {
    		lblconfirm.setText("로그인성공");
    		Front.member = MemberDao.memberDao.getmember(id);
    		
    		
    		boolean result2 = MemberDao.memberDao.pointplus();
    		if(result2) {
        		Front.member = MemberDao.memberDao.getmember(id);

        		Main.instance.loadpage("/view/home/home.fxml");

    		}
    	}else {
    		lblconfirm.setText("동일한 아이디가 존재하지 않는다,,,");
    	}
    	
    }
    
	
	
}






