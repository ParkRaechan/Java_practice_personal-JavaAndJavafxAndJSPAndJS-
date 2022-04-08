package controller;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.front.Front;
import dao.RoomDao;
import dto.Room;
import dto.Roomlive;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Chatting implements Initializable {


	    @FXML
	    private Button btnconnect;

	    @FXML
	    private TextArea txtcontent;

	    @FXML
	    private Button btnsend;

	    @FXML
	    private TextField txtmsg;

	    @FXML
	    private TableView<Room> roomtable;

	    @FXML
	    private TextField txtroomname;

	    @FXML
	    private Button btnadd;

	    @FXML
	    private Label lblselect;

	    @FXML
	    private TextArea txtmidlist;

	    Socket socket;   // 1. Ŭ���̾�Ʈ ���� ���� 
	    
	   

    // 2. Ŭ���̾�Ʈ ���� �޼ҵ�
    public void clientstart(String ip, int port) {
    	Thread thread = new Thread() { // ��Ƽ������ 
    		@Override
    		public void run() {
    			try {
    				socket = new Socket(ip,port); // ������ ip�� ��Ʈ��ȣ �־��ֱ� [ ������ ���� ]
    				send( Front.member.getMid()+"�� �����߽��ϴ�\n"); // ���Ӱ� ���ÿ� ����޽��� ������ 
    				receive(); // ���Ӱ� ���ÿ� �ޱ� �޼ҵ�� ���ѷ���
    			}catch(Exception e ) {}
    		};
    	};// ��Ƽ������ ���� ��
    	thread.start(); // ��Ƽ������ ����
    }
    // 3. Ŭ���̾�Ʈ ���� �޼ҵ� 
    public void clientstop() {  try{ socket.close(); }catch(Exception e ) {} }
    
    // 4. �������� �޽��� ������ �޼ҵ� 
    public void send( String msg ) {
    	Thread thread = new Thread() { 
    		@Override
    		public void run() {
    			try {
    				OutputStream outputStream = socket.getOutputStream(); // 1. ��� ��Ʈ��
    				outputStream.write( msg.getBytes() ); // 2. ��������
    				outputStream.flush(); // 3. ��Ʈ�� �ʱ�ȭ [ ��Ʈ�� �� ����Ʈ ����� ]
    			}catch( Exception e ) {} 
    		}
    	};// ��Ƽ������ ���� �� 
    	thread.start();
    }
    // 5. �������� �޽��� �ޱ� �޼ҵ� 
    public void receive() {
    	try {
	    	while(true) {
	    		InputStream inputStream = socket.getInputStream(); // 1. �Է� ��Ʈ��
	    		byte[] bytes = new byte[1000]; 	// 2. ����Ʈ�迭 ���� 
	    		inputStream.read(bytes);		// 3. �о���� 
	    		String msg = new String(bytes);	// 4. ����Ʈ�� -> ���ڿ� ��ȯ
	    		txtcontent.appendText(msg); 	// 4. ���� ���ڿ��� �޽���â�� ���� 
	    	}
    	}catch( Exception e ) {}
    }
    
    public Server server;
    public Room selectroom;
    
    public void show() {
    	ObservableList<Room> roomlist = RoomDao.roomDao.roomlist();
    	
    	TableColumn tc = roomtable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("ronum"));
    	
    	tc = roomtable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("roname"));
    	
    	tc = roomtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("mcount"));
    	
    	roomtable.setItems(roomlist);
    	
    	roomtable.setOnMouseClicked(e -> {
    		
    		selectroom = roomtable.getSelectionModel().getSelectedItem();
    		
    		lblselect.setText("���� ���õ� �� : "+selectroom.getRoname());
    		
    		btnconnect.setDisable(false);
    	});
    	
    }
    
    
    
    @FXML
    void connect(ActionEvent event) {
    	if( btnconnect.getText().equals("ä�ù� ����") ) {// ���࿡ ��ư�� �ؽ�Ʈ�� "ä�ù� ����" �̸� 
    		
    		clientstart(selectroom.getRoip() ,selectroom.getRonum()); // Ŭ���̾�Ʈ ���� �޼ҵ� 
    		
    		
    		Roomlive roomlive = new Roomlive(0,selectroom.getRonum(),Front.member.getMid());
    		
    		RoomDao.roomDao.addroomnum(roomlive);
    		
    		
    		txtcontent.appendText("---[ä�ù� ����]---\n");
    		btnconnect.setText("ä�ù� ������");
    		
    		txtmsg.setText("");				// ä���Է�â ��ĭ���� ����
    		txtmsg.setDisable(false); 		// ä���Է�â ��밡�� 
        	txtcontent.setDisable(false); 	// ä��â ��� ��밡��
        	btnsend.setDisable(false); 		// ���۹�ư ��밡��
        	txtmsg.requestFocus();  		// ä���Է�â���� ��Ŀ��[Ŀ��] �̵�
    		
    	}else {
    		clientstop(); // Ŭ���̾�Ʈ ���� �޼ҵ� 
    		
    		txtcontent.appendText("---[ä�ù� ����]---\n");
    		btnconnect.setText("ä�ù� ����");
    		
    		txtmsg.setText("ä�ù� ������ ��밡��");
        	txtmsg.setDisable(true); 		// ä���Է�â ������ 
        	txtcontent.setDisable(true); 	// ä��â ��� ������
        	btnsend.setDisable(true); 		// ���۹�ư ������
    	}
    }
    @FXML
    void send(ActionEvent event) { // ���� ��ư�� ��������
    	String msg = Front.member.getMid()+" : "+ txtmsg.getText()+"\n"; // ���� �޽���
    	send( msg ); // �޽��� ������ 
    	txtmsg.setText(""); 	// ������ �� �޽����Է�â �����
    	txtmsg.requestFocus();	// ������ �� �޽����Է�â���� ��Ŀ��(Ŀ��) �̵�
    	midshow();
    }
    

    @FXML
    void add(ActionEvent event) {
    	//1.��Ʈ�ѿ� �Էµ� ���̸� ��������
    	String roomname = txtroomname.getText();
    	if(roomname.length()<4) {
    		txtroomname.setText("");
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setContentText("�� ��ȣ�� 4�ڸ��̻����� �Է¹ٶ��ϴ�");
        	alert.showAndWait();
        	return;
    	}
    	//2.�� ��ü
    	Room room = new Room(0,roomname,"192.168.17.20",0);
    	//3.dbó��
    	RoomDao.roomDao.roomadd(room);
    	//4.�ش� �� ���� ����
    	server = new Server();
    	server.serverstart(room.getRoip(), 
    			RoomDao.roomDao.getroomnum()
    			);
    	
    	txtroomname.setText("");
    	show();
    	Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setHeaderText("�� ������ �Ǿ����ϴ� ���ȣ : "
				+ RoomDao.roomDao.getroomnum());
    	alert.showAndWait();

    }
    public void midshow() {
    	ArrayList<Roomlive> roomlivelist 
			= RoomDao.roomDao.getRoomlivelist( selectroom.getRonum() );
		txtmidlist.setText("");
		int i = 1; 
		for( Roomlive temp : roomlivelist ) {
			txtmidlist.appendText( i +"�� "+ temp.getMid() +"\n");
			i++;
		}
    }
    @FXML
    void msg(ActionEvent event) {
    	String msg = Front.member.getMid()+" : "+txtmsg.getText()+"\n";
    	send(msg);
    	txtmsg.setText("");
    	txtmsg.requestFocus();
    	midshow();
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// ä��fxml �������� �ʱⰪ �޼ҵ� 
    		// * ä�ù� �������� �Ʒ� fxid�� �����ϰ� ���� 
    	txtmsg.setText("ä�ù� ������ ��밡��");
    	txtmsg.setDisable(true); 		// ä���Է�â ������ 
    	txtcontent.setDisable(true); 	// ä��â ��� ������
    	btnsend.setDisable(true); 		// ���۹�ư ������
		btnconnect.setDisable(true);
		txtmidlist.setDisable(true);
		show();
    }
	
}





