package jull.restservice.service;

import jull.restservice.entity.Player;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlayerService {
	Player addPlayer(Player player);
	void delete(long playerId);
	Player getById(long playerId);
	Player getByName(String name);
	Player editPlayer(Player player);
	List<Player> getAll();
}
