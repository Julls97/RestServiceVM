package jull.restservice.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Messages {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name= "increment", strategy= "increment")
	@Column(name = "messageId", length = 10, nullable = false)
	private long messageId;
	@Column(name = "playerFromId")
	private long playerFromId;
	@Column(name = "playerToId")
	private long playerToId;
	@Column(name = "messageText", length = 1000)
	private String messageText;
	
	public Messages () {}
	
	public Messages(long playerFromId, long playerToId, String messageText) {
		this.playerFromId = playerFromId;
		this.playerToId = playerToId;
		this.messageText = messageText;
	}
	
	public long getMessageId() { return messageId; }
	
	public void setMessageId(int messageId) { this.messageId = messageId; }
	
	public long getPlayerFromId() {	return playerFromId; }
	
	public void setPlayerFromId(long playerFromId) { this.playerFromId = playerFromId; }
	
	public long getPlayerToId() { return playerToId; }
	
	public void setPlayerToId(long playerToId) { this.playerToId = playerToId; }
	
	public String getMessageText() { return messageText; }
	
	public void setMessageText(String messageText) { this.messageText = messageText; }
}

/*
messageId – идентификатор сообщения;
playerFromId – игрок, отправивший сообщение;
playerToId – игрок, получивший сообщение;
messageText – текст сообщения (не более 1000 символов).
*/