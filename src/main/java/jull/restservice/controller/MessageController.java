package jull.restservice.controller;

import jull.restservice.entity.Message;
import jull.restservice.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class MessageController {
	
	@Resource
	public MessageService messageService;
	
	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Message getMessage(@PathVariable long id) {return messageService.getById(id);}
	
	@RequestMapping(value = "/messages", method = RequestMethod.GET)
	@ResponseBody
	public List<Message> getMessages() {return messageService.getAll();}
	
	@RequestMapping(value = "/message/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable long id) {messageService.delete(id);}
	
	@RequestMapping(value = "/message", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addMessage(@RequestBody Message message) { messageService.addMessage(message);}
}
