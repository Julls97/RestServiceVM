package jull.restservice.service.impl;

import jull.restservice.entity.Player;
import jull.restservice.repository.PlayerRepository;
import jull.restservice.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class PlayerServiceImpl implements PlayerService {
	@Resource
	private PlayerRepository playerRepository;
	
	@Autowired
	public void setPlayerRepository(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}
	
	@Override
	public Player addPlayer(Player player) {
		Player savedPlayer = playerRepository.save(player);
		return savedPlayer;
	}
	
	@Override
	public void delete(long playerId) { playerRepository.delete(playerId); }
	
	@Override
	public Player getById(long playerId) { return playerRepository.findOne(playerId); }
	
	@Override
	public Player getByName(String name) { return playerRepository.findByName(name); }
	
	@Override
	public Player editPlayer(Player player) { return playerRepository.save(player); }
	
	@Override
	public List<Player> getAll() { return (List<Player>) playerRepository.findAll(); }
}
