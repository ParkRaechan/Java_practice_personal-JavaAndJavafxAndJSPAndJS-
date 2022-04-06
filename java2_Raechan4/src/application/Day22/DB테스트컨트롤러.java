package application.Day22;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DB테스트컨트롤러 implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { //초기값설정메소드
		Day22_2 DB연동 = new Day22_2();
		
	}

    @FXML
    private TextField txtwriter;

    @FXML
    private TextField txtcontent;

    @FXML
    private Button btnwrite;

    @FXML
    private Button btnget;

    @FXML
    private TextArea  txtcontentlist;

    @FXML
    void get(ActionEvent event) {
    	System.out.println("DB내 데이터를 호출합니다.");
    	
    	Day22_2 db연동 = new Day22_2();
    	ArrayList<데이터> 데이터목록 = db연동.get();
    	
    	for( 데이터 temp : 데이터목록) {
    		
    		txtcontentlist.appendText(
    				"  번호: "+temp.get번호()+
    				"  작성자: "+temp.get작성자()+
    				"  내용: "+temp.get내용()+"\n"
    				
    				);
    		
    	}
    	
    	
    }

    @FXML
    void write(ActionEvent event) {
    	System.out.println("DB내 데이터를 저장합니다.");
    	String 작성자 = txtwriter.getText();
    	String 내용 = txtcontent.getText();
    	
    	Day22_2 db연동 = new Day22_2();
    	
    	boolean result = db연동.write(작성자, 내용);
    	
    	
    	if(result) {
    		System.out.println("db내 데이터저장 성공");
    		txtwriter.setText("");
    		txtcontent.setText("");
    		
    	}else {
    		System.out.println("db저장 실패");
    	}
    
    }

}
