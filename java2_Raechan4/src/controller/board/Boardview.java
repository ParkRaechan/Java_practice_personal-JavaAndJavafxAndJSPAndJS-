package controller.board;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.front.Front;
import controller.home.Home;
import dao.BoardDao;
import dto.Board;
import dto.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Boardview implements Initializable{

    @FXML
    private TextArea txtcontent;

    @FXML
    private TextField txttitle;

    @FXML
    private Button btnupdate;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnback;

    @FXML
    private Label lblwrite;

    @FXML
    private Label lbldate;

    @FXML
    private Label lblview;

    @FXML
    private TextField txtrecontent;

    @FXML
    private Button btnrewrite;

    @FXML
    private TableView<Reply> replytable;

    public void replytableshow() {
    	
    	int bnum = controller.board.Board.board.getBnum();
    	
    	ObservableList<Reply> replylist = BoardDao.boardDao.replylist(bnum);
    	// 2. tableview �� �߰� 
    	TableColumn tc = replytable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rnum"));
    	
    	tc = replytable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rwrite"));

    	tc = replytable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rdate"));
    	
    	tc = replytable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("rcontent"));
    	
    	replytable.setItems(replylist);
    	
    }
    
    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/board/board.fxml");
    }

    @FXML
    void delete(ActionEvent event) {
    	// 1. ��� �޽��� �˸�
    	Alert alert = new Alert(AlertType.CONFIRMATION); // Ȯ�� / ��Ұ� �ִ� ��ư
    		alert.setHeaderText("�ش� �Խù��� �����ұ��?");
    	Optional<ButtonType> optional = alert.showAndWait(); // showAndWait() �޼ҵ��� ��ȯŸ�� => ������ ��ư
    		// Optional Ŭ���� : null�� ��ü�� �����ϴ� Ŭ����
    	if( optional.get() == ButtonType.OK ) {  // 2. Ȯ�� ��ư ��������
    		// 3. ���� ó�� ����
    		BoardDao.boardDao.delete( 
    				controller.board.Board.board.getBnum()   );
    		// 4. ������ ��ȯ
    		Home.home.loadpage("/view/board/board.fxml");
    	}
    }

    @FXML
    void rewrite(ActionEvent event) {
    	
    	String rcontent = txtrecontent.getText();
    	String rwrite = Front.member.getMid();
    	int bnum = controller.board.Board.board.getBnum();
    	
    	Reply relpy = new Reply(0, rcontent, rwrite, null, bnum);
    	
    	boolean result = BoardDao.boardDao.rwrite(relpy);
    	
    			
    	if(result) {
    		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("��� ��� ����");
    		alert.showAndWait();
    		txtrecontent.setText("");
    		replytableshow();

    	}
    }
    	

    boolean upcheck = true;
    @FXML
    void update(ActionEvent event) {

    	Alert alert = new Alert(AlertType.INFORMATION);
    	
    	if(upcheck) {

        	alert.setHeaderText("�Խñ� ������ ���� �Ϸ� ��ư�� �����ּ���");
        	alert.showAndWait();
        	txttitle.setEditable(true);
        	txtcontent.setEditable(true);
        	btnupdate.setText("�����Ϸ�!");	
        	upcheck = false;
    	}else {
    		//
    		BoardDao.boardDao.update(controller.board.Board.board.getBnum(),
    				txttitle.getText(),
    				txtcontent.getText()
    				);
    		
    		
    		//
    		alert.setHeaderText("�Խñ� ������ �Ϸ�Ǿ����ϴ�....");
        	alert.showAndWait();
        	txttitle.setEditable(false);
        	txtcontent.setEditable(false);
        	btnupdate.setText("����");
        	upcheck = true;
    	}
    	
    }
    
    /////////�ϴ���////////
   // public static void ��ȸ������ó��() {
	//      try {
		//	FileOutputStream out = new FileOutputStream("D:/java/��ȸ��.txt");
		 //   String storage = "";
		  //  Board board = controller.board.Board.board;
		   // storage = Front.member.getMid()+","+board.getBnum()+","+date.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm")+"\n";
		    //
			//out.write(storage.getBytes());
			
			
		//} catch (FileNotFoundException e) {
		//	e.printStackTrace();
		//}
	  //    
    //}
    ///////////////////
    
    @Override
    public void initialize(URL arg0,ResourceBundle arg1) {
    	
    	
    	replytableshow();
    	
    	
    	
    	Board board = controller.board.Board.board;
    	
    	// �� ��Ʈ�ѿ� ���õ� board�� ������ �����ϱ� 
    		lblwrite.setText( "�ۼ��� : " + board.getBwrite() );
    		lbldate.setText( "�ۼ��� : " + board.getBdate() );
    		lblview.setText( "��ȸ�� : " + board.getBview() );
    		txttitle.setText( board.getBtitle() );
    		txtcontent.setText( board.getBcontent() );
    		// ���࿡ �Խù� �ۼ��� �� ����α��ε� id�� �������� ������
    		if( ! board.getBwrite().equals( Front.member.getMid() ) ) { // !:����
    			btndelete.setVisible(false); // ��ư �����
    			btnupdate.setVisible(false); // false = ��ư ����� true = ��ư ���̱�
    		}
    		// ���� �� ������ ���� ���ϰ� ���� ����
    		txttitle.setEditable(false);
    		txtcontent.setEditable(false);
    }
    
    

}
