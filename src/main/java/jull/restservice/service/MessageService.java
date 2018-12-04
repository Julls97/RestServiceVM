package jull.restservice.service;

import jull.restservice.entity.Message;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MessageService {
	Message addMessage (Message message);
	void delete(long id);
	Message getById(long id);
	List<Message> getAll();
}
