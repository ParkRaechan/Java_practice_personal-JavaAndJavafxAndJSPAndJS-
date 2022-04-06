package controller.board;

import java.net.URL;
import java.util.ResourceBundle;

import controller.home.Home;
import dao.BoardDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class Board implements Initializable {

	public static dto.Board board;
	
    @FXML
    private TableView<dto.Board> boardtable;

    @FXML
    private Button btnwrite;

    @FXML
    void accwrite(ActionEvent event) {
    	// * Home클래스내 borderpane center 변경
    	Home.home.loadpage("/view/board/boardwrite.fxml");
    }
    
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// * arraylist 가 아닌 ObservableList 사용하는 이유 [tableview가 ObservableList를 사용 ] 
    	// 1. db에서 모든 게시글 가져오기
    	ObservableList<dto.Board> boardlist = BoardDao.boardDao.list();
    	// 2. tableview 에 추가 
    	TableColumn tc = boardtable.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bnum"));
    	
    	tc = boardtable.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("btitle"));

    	tc = boardtable.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bwrite"));
    	
    	tc = boardtable.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bdate"));
    	
    	tc = boardtable.getColumns().get(4);
    	tc.setCellValueFactory(new PropertyValueFactory<>("bview"));
    	
    	boardtable.setItems(boardlist);
    	
    	boardtable.setOnMouseClicked(e->{
    		board = boardtable.getSelectionModel().getSelectedItem();
    		Home.home.loadpage("/view/board/boardview.fxml");
    	});
    }

}
