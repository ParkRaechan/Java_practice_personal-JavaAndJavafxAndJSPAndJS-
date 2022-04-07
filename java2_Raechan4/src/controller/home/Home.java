package controller.home;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import controller.front.Front;
import dao.MemberDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class Home implements Initializable {
				// fxml 실행시 초기값 설정 인테페이스 
	public static Home home; // 객체 
	
	// * this : 현재 클래스의 메모리 호출
	public Home() { home = this; }
	
	
	@FXML
	private Label lblloginid;
	@FXML
	private Label lblpoint;
	@FXML
	private Label lbllogout;
	@FXML
	private Label lbldelete; // fxid가져오기
	@FXML
	private Label lblinfo; // fxid가져오기
	@FXML
	private BorderPane borderpane;
	@FXML
	private Label lblupdate; // fxid가져오기
	@FXML
	private Label lblboard; // fxid가져오기
	@FXML
	private Label lblproduct1; // fxid가져오기
	@FXML
	private Label lblproduct2; // fxid가져오기
	@FXML
	private Label lblproduct3; // fxid가져오기
	@FXML
	private Label lblproduct4; // fxid가져오기

	public static String category;
	
	
	@FXML// 남성의류 레이블을 클릭했을때 이벤트
	public void accproduct1( MouseEvent e ) { 
		category="게임기";
		loadpage("/view/product/product.fxml"); 
		
	}
	@FXML// 여성의류 레이블을 클릭했을때 이벤트
	public void accproduct2( MouseEvent e ) { 
		category="슈팅게임팩";
		loadpage("/view/product/product.fxml"); 
	}
	@FXML// 게임기기 레이블을 클릭했을때 이벤트
	public void accproduct3( MouseEvent e ) { 
		category="스포츠게임팩";
		loadpage("/view/product/product.fxml"); 
	}
	@FXML// 생활용품 레이블을 클릭했을때 이벤트
	public void accproduct4( MouseEvent e ) { 
		category="액션게임팩";
		loadpage("/view/product/product.fxml"); 
	}
	
	
	//복도 주위 둘러보기
	@FXML
	public void hallinfo( MouseEvent e) {
		controller.Main.l++;
		if(controller.Main.l%7!=0) {
			loadpage("/view/home/hallway.fxml");
		}else {
			loadpage("/view/home/hallway_ghost.fxml");
		}
		
	}
	
	
	
	@FXML// 자유게시 레이블을 클릭했을때 이벤트
	int k=0;
	public void accboard( MouseEvent e ) {
		k++;
		if(k%2!=0) {
			loadpage("/view/board/board.fxml"); 
		}else {
			Main.instance.loadpage("/view/home/home.fxml");
		}
	}
	
	
	@Override // 실행 초기 메소드 
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblloginid.setText( Front.member.getMid()+" 님" );
		lblpoint.setText("포인트 : "+ Front.member.getMpoint()+" 점");
		loadpage("/view/home/homeview.fxml");
	}
	int i = 0 ;
	@FXML// 회원탈퇴 레이블을 클릭했을때 이벤트
	public void accinfo( MouseEvent e ) {
		
		i++;
		if(i%2!=0) {
			loadpage("/view/home/info.fxml"); 
				
		}else {
			Main.instance.loadpage("/view/home/home.fxml");
		}
		
	}
	
	public void loadpage( String page ) {
		try {
			Parent parent = FXMLLoader.load( getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch( Exception e ) {}
	}
	
	@FXML // 로그아웃 레이블를 클릭했을때 이벤트
	public void logout( MouseEvent e  ) {
		
		// 1. 메시지 설정 
				Alert alert = new Alert( AlertType.CONFIRMATION ); // 확인,취소 버튼 타입 
					alert.setHeaderText("정말 로그아웃 하시겠습니까?");
				// 2. 버튼 확인 [ Optional : 클래스 
				Optional<ButtonType> optional = alert.showAndWait(); // 실행
				if( optional.get() == ButtonType.OK ) { // 확인 버튼을 눌렀을때 
					// 회원탈퇴 진행 
					
					
						// 로그아웃 [ Login 클래스내 Member 객체 null 으로 수정 ] 
						Front.member = null;
						// 페이지전환
						Main.instance.loadpage("/view/front/front.fxml");
					 // 탈퇴 실패
						
					
				}
		
		
		
	}
	
	
	@FXML// 회원탈퇴 레이블을 클릭했을때 이벤트
	public void delete( MouseEvent e ) {
		
		// 1. 메시지 설정 
		Alert alert = new Alert( AlertType.CONFIRMATION ); // 확인,취소 버튼 타입 
			alert.setHeaderText("정말 탈퇴 하시겠습니까?");
		// 2. 버튼 확인 [ Optional : 클래스 
		Optional<ButtonType> optional = alert.showAndWait(); // 실행
		if( optional.get() == ButtonType.OK ) { // 확인 버튼을 눌렀을때 
			// 회원탈퇴 진행 
			boolean result= MemberDao.memberDao.delete( Front.member.getMnum() );
								// 현재 로그인중인 회원의 번호 호출
			if( result ) { // 탈퇴 성공 
				// 로그아웃 [ Login 클래스내 Member 객체 null 으로 수정 ] 
				Front.member = null;
				// 페이지전환
				Main.instance.loadpage("/view/front/front.fxml");
			}else { // 탈퇴 실패
				
			}
		}
		// 아니면 
	}
	
	
	
	@FXML// 회원수정 레이블을 클릭했을때 이벤트
	
	int j = 0 ;
	@FXML// 회원탈퇴 레이블을 클릭했을때 이벤트
	public void accupdate( MouseEvent e ) {
		
		j++;
		if(j%2!=0) {
			loadpage("/view/home/update.fxml");	
		}else {
			Main.instance.loadpage("/view/home/home.fxml");
		}
		
	}
	
	
}
