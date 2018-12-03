package jull.restservice.repository;

import jull.restservice.entity.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
	@Query("select p from Player p where p.name = :name")
	Player findByName(@Param("name") String name);
	
//	@Query("select p from Player p where p.playerId = :playerId")
//	Player findById(@Param("playerId") long playerId);
}
