package jull.restservice.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "messages")
public class Message {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name= "increment", strategy= "increment")
	@Column(name = "message_id", length = 10, nullable = false)
	private long messageId;
	@Column(name = "player_from_id")
	private long playerFromId;
	@Column(name = "player_to_id")
	private long playerToId;
	@Column(name = "message_text", length = 1000)
	private String messageText;
	
	public Message() {}
	
	public Message(long messageId, long playerFromId, long playerToId, String messageText) {
		this.messageId = messageId;
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