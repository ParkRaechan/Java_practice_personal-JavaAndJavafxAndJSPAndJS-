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
    	// 1. ��Ʈ�ѿ� �Էµ� ������ ��������
    	String pname = txtpname.getText();
    	String pcontent = txtpcontent.getText();
    	int pprice = Integer.parseInt( txtpprice.getText() ) ;	// ���ڿ� -> ������ ��ȯ [ Integer.parseInt ]
    		// * ī�װ�
    	String pcategory = null;
    		if( opt1.isSelected() ) { // ���࿡ opt1��� fxid�� ��Ʈ��(������ư)�� ���õǾ�����
    			pcategory="���ӱ�";
    		}
    		if( opt2.isSelected() ) { pcategory ="���ð�����";}
    		if( opt3.isSelected() ) { pcategory ="������������";}
    		if( opt4.isSelected() ) { pcategory ="�׼ǰ�����";}
    	int mnum = Front.member.getMnum();
    	// 2. ��üȭ
    	Product product = new Product(0, pname, pimage, pcontent, pcategory, pprice, 1, null, mnum);
    	// 3. DBó��
    	boolean result =  ProductDao.productDao.add(product);
    	// 4. ���ó��
    	if( result ) {
    		Alert alert = new Alert(AlertType.INFORMATION ); // �޽��� 
    			alert.setHeaderText("��ǰ ��� �Ϸ�");
    		alert.showAndWait();	
    		Home.home.loadpage("/view/product/product.fxml"); // ȭ����ȭ
    		
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION );
				alert.setHeaderText("��ǰ ��� ���� [ �����ڿ��� ����]");
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
    	
    	fileChooser.getExtensionFilters().add(new ExtensionFilter("�̹�������:image file","*png","*jpg","*gif"));
    	
    	File file = fileChooser.showOpenDialog(new Stage());
    	
    	txtpath.setText("���ϰ�� : "+file.getPath());
    	
    	pimage = file.toURI().toString();
    	
    	Image iamg = new Image(pimage);
    	img.setImage(iamg);
    	
    	//* ���õ� ������ ���� ������Ʈ ������ ����(�̵�)
    	//1.�����Է�
    	try {
    	FileInputStream inputStream = new FileInputStream(file);
    	
    	
    	//2.�������
    	File copyfile = new File("C:/Users/504/git/EZAN_2022_02_28/java2_Raechan2/src/img/"+file.getName());
    	FileOutputStream outputStream= new FileOutputStream(copyfile);
    	
    	//3.����Ʈ�迭 ����
    	byte[] bytes = new byte[102*102];
    	
    	//4.�ݺ����� �̿��� ��ǲ��Ʈ���� ���� ��� ���� ��Ʈ�� ��� �о����
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
