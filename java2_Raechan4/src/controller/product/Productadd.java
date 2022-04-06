package controller.product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import controller.front.Front;
import controller.home.Home;
import dao.ProductDao;
import dto.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class Productadd implements Initializable {


    @FXML
    private Button btnadd;

    @FXML
    private TextField txtpname;

    @FXML
    private TextArea txtpcontent;

    @FXML
    private TextField txtpprice;

    @FXML
    private Button btnimg;

    @FXML
    private RadioButton opt1;

    @FXML
    private ToggleGroup category;

    @FXML
    private RadioButton opt2;

    @FXML
    private RadioButton opt3;

    @FXML
    private RadioButton opt4;

    @FXML
    private ImageView img;

    @FXML
    private Button btnback;

    @FXML
    private Label txtpath;

    @FXML
    void add(ActionEvent event) {
    	// 1. 컨트롤에 입력된 데이터 가져오기
    	String pname = txtpname.getText();
    	String pcontent = txtpcontent.getText();
    	int pprice = Integer.parseInt( txtpprice.getText() ) ;	// 문자열 -> 정수열 변환 [ Integer.parseInt ]
    		// * 카테고리
    	String pcategory = null;
    		if( opt1.isSelected() ) { // 만약에 opt1라는 fxid의 컨트롤(라디오버튼)이 선택되었으면
    			pcategory="게임기";
    		}
    		if( opt2.isSelected() ) { pcategory ="슈팅게임팩";}
    		if( opt3.isSelected() ) { pcategory ="스포츠게임팩";}
    		if( opt4.isSelected() ) { pcategory ="액션게임팩";}
    	int mnum = Front.member.getMnum();
    	// 2. 객체화
    	Product product = new Product(0, pname, pimage, pcontent, pcategory, pprice, 1, null, mnum);
    	// 3. DB처리
    	boolean result =  ProductDao.productDao.add(product);
    	// 4. 결과처리
    	if( result ) {
    		Alert alert = new Alert(AlertType.INFORMATION ); // 메시지 
    			alert.setHeaderText("제품 등록 완료");
    		alert.showAndWait();	
    		Home.home.loadpage("/view/product/product.fxml"); // 화면전화
    		
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION );
				alert.setHeaderText("제품 등록 실패 [ 관리자에게 문의]");
			alert.showAndWait();
    	}
    }

    @FXML
    void back(ActionEvent event) {
    	Home.home.loadpage("/view/product/product.fxml");
    }

    private String pimage = null;
    
    @FXML
    void imgadd(ActionEvent event) {
    	
    	FileChooser fileChooser = new FileChooser();
    	
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("이미지파일:image file","*png","*jpg","*gif"));
    	
    	File file = fileChooser.showOpenDialog(new Stage());
    	
    	txtpath.setText("파일경로 : "+file.getPath());
    	
    	pimage = file.toURI().toString();
    	
    	Image iamg = new Image(pimage);
    	img.setImage(iamg);
    	
    	//* 선택된 파일을 현재 프로젝트 폴더로 복사(이동)
    	//1.파일입력
    	try {
    	FileInputStream inputStream = new FileInputStream(file);
    	
    	
    	//2.파일출력
    	File copyfile = new File("C:/Users/504/git/EZAN_2022_02_28/java2_Raechan2/src/img/"+file.getName());
    	FileOutputStream outputStream= new FileOutputStream(copyfile);
    	
    	//3.바이트배열 선언
    	byte[] bytes = new byte[102*102];
    	
    	//4.반복문을 이용한 인풋슽트림의 팡일 모두 파일 스트림 모두 읽어오기
    	int size;
    	while((size=inputStream.read(bytes))>0) {
    		outputStream.write(bytes);
    	}
    	inputStream.close();
    	outputStream.close();
    	
    	pimage = copyfile.toURI().toString();
    	
    	}catch (Exception e) {
		
    	}
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	}
}
