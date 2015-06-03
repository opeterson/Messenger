package ca.owenpeterson.messenger.service;

import java.util.ArrayList;
import java.util.List;

import ca.owenpeterson.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello World", "Owen");
		Message m2 = new Message(2L, "Hello Jersey", "Owen");
		Message m3 = new Message(3L, "Hello World", "Koushik");
		
		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		return list;
		
		
	}

}
