package jull.restservice.service.impl;

import jull.restservice.entity.Message;
import jull.restservice.repository.MessageRepository;
import jull.restservice.service.MessageService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class MessageServiceImpl implements MessageService {
	@Resource
	private MessageRepository messageRepository;
	
	@Override
	public Message addMessage(Message message) {
		Message savedMessage = messageRepository.save(message);
		return savedMessage;
	}
	
	@Override
	public void delete(long id) {
		messageRepository.delete(id);
	}
	
	@Override
	public Message getById(long id) {
		return messageRepository.findOne(id);
	}
	
	@Override
	public List<Message> getAll() {
		return (List<Message>) messageRepository.findAll();
	}
}
