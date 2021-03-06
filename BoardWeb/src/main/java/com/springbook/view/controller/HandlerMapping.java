package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.board.DeleteBoardController;
import com.springbook.view.board.GetBoardController;
import com.springbook.view.board.GetBoardListController;
import com.springbook.view.board.InsertBoardController;
import com.springbook.view.board.UpdateBoardController;
import com.springbook.view.user.LoginController;
import com.springbook.view.user.LogoutController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String,Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do",new UpdateBoardController());
		mappings.put("/deleteBoard.do",new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
		
		//ex) {login.do : LoginController} ...
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
		
		//ex) login.do가 path로 들어오게 되면 handlerMapping의 path에 맞는 controller를 가져와서 리턴해준다.
	}

}
