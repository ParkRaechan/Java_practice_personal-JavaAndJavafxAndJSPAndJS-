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

public class DB�׽�Ʈ��Ʈ�ѷ� implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { //�ʱⰪ�����޼ҵ�
		Day22_2 DB���� = new Day22_2();
		
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
    	System.out.println("DB�� �����͸� ȣ���մϴ�.");
    	
    	Day22_2 db���� = new Day22_2();
    	ArrayList<������> �����͸�� = db����.get();
    	
    	for( ������ temp : �����͸��) {
    		
    		txtcontentlist.appendText(
    				"  ��ȣ: "+temp.get��ȣ()+
    				"  �ۼ���: "+temp.get�ۼ���()+
    				"  ����: "+temp.get����()+"\n"
    				
    				);
    		
    	}
    	
    	
    }

    @FXML
    void write(ActionEvent event) {
    	System.out.println("DB�� �����͸� �����մϴ�.");
    	String �ۼ��� = txtwriter.getText();
    	String ���� = txtcontent.getText();
    	
    	Day22_2 db���� = new Day22_2();
    	
    	boolean result = db����.write(�ۼ���, ����);
    	
    	
    	if(result) {
    		System.out.println("db�� ���������� ����");
    		txtwriter.setText("");
    		txtcontent.setText("");
    		
    	}else {
    		System.out.println("db���� ����");
    	}
    
    }

}
