package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.front.Front;
import controller.home.Home;
import dao.BoardDao;
import dto.Board;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Boardwrite implements Initializable {
	
    @FXML
    private Button btnwrite;

    @FXML
    private TextField txttitle;

    @FXML
    private TextArea txtcontent;

    @FXML
    private Button btnback;

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/board/board.fxml");
    }

    @FXML
    void write(ActionEvent event) {
    	
    	String title = txttitle.getText();
    	String content = txtcontent.getText();
    	String write = Front.member.getMid();
    	
    	Board board = new Board(0,title,content,write,null,0);
    	
    	boolean result = BoardDao.boardDao.write(board);
    	if(result) {
    		// �޽���
    		Alert alert = new Alert( AlertType.INFORMATION );
    			alert.setHeaderText("�Խñ��� �ۼ� �Ǿ����ϴ�");
    		alert.showAndWait();
    		// ������ ��ȯ
    		Home.home.loadpage("/view/board/board.fxml");
    	}else {
    		Alert alert = new Alert( AlertType.INFORMATION );
			alert.setHeaderText("�Խñ� �ۼ� ����[�����ڿ��Թ���]");
			alert.showAndWait();
    	}
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    }


}
