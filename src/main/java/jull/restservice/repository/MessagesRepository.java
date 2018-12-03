package jull.restservice.repository;

import jull.restservice.entity.Messages;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends CrudRepository<Messages, Long> {
//	@Query("select p from Messages p where p.name = :name")
//	Messages findByName(@Param("name") String name);
}
