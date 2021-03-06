package controller.front;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MemberDao;
import dto.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class findpasswordpane implements Initializable {

    @FXML
    private TextField txtid;

    @FXML
    private Button btnfindpassword;

    @FXML
    private Button btnback;

    @FXML
    private Label lblconfirm;

    @FXML
    private TextField txtemail;

    @FXML
    void back(ActionEvent event) {
    	Front.instance.loadpage("/view/front/frontpane.fxml");	
    }

    @FXML
    void findpassword(ActionEvent event) {
    	// 1. 컨트롤에 입력된 데이터 가져오기
    	String id = txtid.getText();
    	String email = txtemail.getText();
    	// 2. db 메소드 호출 
    	String password = MemberDao.memberDao.findpassword(id, email);
    	// 3. 확인 
    	if( password != null ) {
    		Member.sendmail(email,password);
    		Alert alert = new Alert( AlertType.INFORMATION );
    			alert.setHeaderText("해당 이메일로 비밀번호를 전송했습니다.");
    		alert.showAndWait();
    	}else {
    		lblconfirm.setText("입력한 정보와 동일한 회원이 없습니다.");
    	}
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText("");
	}
	

}
