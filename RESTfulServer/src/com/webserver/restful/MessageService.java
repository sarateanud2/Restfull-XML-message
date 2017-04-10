package com.webserver.restful;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageService {
	
	
	
	public List<Message> getMessageList(){
		List<Message> messageList = new ArrayList<>();
		messageList.addAll(Arrays.asList(new Message[] {new Message(1L, "Hello RESTful", "User1"), new Message(2L, "Hello Jersy", "User2"), new Message(3L, "Hello Java", "User1")}));
		
		return messageList;
	}
}
