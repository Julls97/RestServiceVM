package jull.restservice.service;

import jull.restservice.entity.Messages;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MessagesService {
	Messages addMessages(Messages messages);
	void delete(long id);
	Messages getById(long id);
	Messages editMessages(Messages messages);
	List<Messages> getAll();
}
