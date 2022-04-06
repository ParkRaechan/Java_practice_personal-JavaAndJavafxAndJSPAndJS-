package controller.home;

import java.net.URL;
import java.util.ResourceBundle;

import controller.front.Front;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Info implements Initializable {
	
	@FXML
	private Label lblid;
	@FXML
	private Label lblemail;
	@FXML
	private Label lbladdress;
	@FXML
	private Label lblpoint;
	@FXML
	private Label lblcince;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblid.setText( Front.member.getMid() );
		lblemail.setText( Front.member.getMemail() );
		lbladdress.setText( Front.member.getMaddress() );
		lblpoint.setText( Front.member.getMpoint()+" Á¡" );
		lblcince.setText( Front.member.getMcince() );
	}
	
}
