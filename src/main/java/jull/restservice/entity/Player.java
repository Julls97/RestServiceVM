package jull.restservice.entity;

import jull.restservice.entity.enums.PlayerEnum;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name= "increment", strategy= "increment")
	@Column(name = "player_id", length = 10, nullable = false)
	private long playerId;
	@Column(name = "name", unique = true)
	private String name;
	@Column(name = "player_class")
	@Enumerated(EnumType.STRING)
	private PlayerEnum playerClass;
	@Column(name = "email", unique = true)
	private String email;
	@Column(name = "level")
	private int level;
	@Column(name = "position_id")
	private long positionId;
	
	public Player() {}
	
	public Player(long playerId, String name, PlayerEnum playerClass, String email, int level, long positionId/*Location position*/) {
		this.playerId = playerId;
		this.name = name;
		this.playerClass = playerClass;
		this.email = email;
		this.level = level;
		this.positionId = positionId;
	}
	
	public long getPlayerId() {
		return playerId;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PlayerEnum getPlayerClass() {
		return playerClass;
	}
	
	public void setPlayerClass(PlayerEnum playerClass) {
		this.playerClass = playerClass;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public long getPositionId() { return positionId; }
	
	public void setPositionId(long positionId) { this.positionId = positionId; }
	
	@Override
	public String toString() {
		return "Player [playerId =" + playerId + ", name =" + name + ", playerClass =" + playerClass +
				", email =" + email + ", level = " + level + ", position" + positionId + "]";
	}
}
