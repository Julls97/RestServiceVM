package jull.restservice.controller;

import jull.restservice.entity.Player;
import jull.restservice.service.PlayerService;
import jull.restservice.service.impl.PlayerServiceImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class PlayerController {
	@Resource
	PlayerService playerService;
	
	@RequestMapping(value = "/player/{playerId}", method = RequestMethod.GET)
	@ResponseBody
	public Player getPlayer(@PathVariable long playerId) {
		return playerService.getById(playerId);
	}
	
	@RequestMapping(value = "/player/name/{name}", method = RequestMethod.GET)
	@ResponseBody
	public Player getPlayer(@PathVariable String name) {
		return playerService.getByName(name);
	}
	
	@RequestMapping(value = "/players", method = RequestMethod.GET)
	@ResponseBody
	public List<Player> getPlayers() {
		return playerService.getAll();
	}
	
	@RequestMapping(value = "/player", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addPlayer(@RequestBody Player player) {
		playerService.addPlayer(player);
	}
	
	@RequestMapping(value = "/player/{playerId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable long playerId) {
		playerService.delete(playerId);
	}
	
	@RequestMapping(value = "/player/{playerId}", method = RequestMethod.PUT)
	@ResponseBody
	public Player editPlayer(@RequestBody Player player, @PathVariable long playerId) {
		return playerService.editPlayer(player);
	}
}
