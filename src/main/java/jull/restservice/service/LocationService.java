package jull.restservice.service;

import jull.restservice.entity.Location;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationService {
	Location addLocation(Location location);
	void delete(long id);
	Location getById(long id);
	Location editLocation(Location location);
	List<Location> getAll();
}
