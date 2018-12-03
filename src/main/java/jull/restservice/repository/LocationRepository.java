package jull.restservice.repository;

import jull.restservice.entity.Location;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
//	@Query("select l from Location l where l.name = :name")
//	Location findByName(@Param("name") String name);
}
