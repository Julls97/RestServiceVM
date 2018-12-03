package jull.restservice.service.impl;

import jull.restservice.entity.Messages;
import jull.restservice.repository.MessagesRepository;
import jull.restservice.service.MessagesService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class MessagesServiceImpl implements MessagesService {
	@Resource
	private MessagesRepository messagesRepository;
	
	@Override
	public Messages addMessages(Messages messages) {
		Messages savedMessages = messagesRepository.save(messages);
		return savedMessages;
	}
	
	@Override
	public void delete(long id) {
		messagesRepository.delete(id);
	}
	
	@Override
	public Messages getById(long id) {
		return messagesRepository.findOne(id);
	}
	
	@Override
	public Messages editMessages(Messages messages) {
		return messagesRepository.save(messages);
	}
	
	@Override
	public List<Messages> getAll() {
		return (List<Messages>) messagesRepository.findAll();
	}
}
