package jull.restservice.service.impl;

import jull.restservice.entity.Location;
import jull.restservice.repository.LocationRepository;
import jull.restservice.service.LocationService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class LocationServiceImpl implements LocationService {
	@Resource
	private LocationRepository locationRepository;
	
	@Override
	public Location addLocation(Location location) {
		Location savedLocation = locationRepository.save(location);
		return savedLocation;
	}
	
	@Override
	public void delete(long id) { locationRepository.delete(id); }
	
	@Override
	public Location getById(long id) { return locationRepository.findOne(id); }
	
	@Override
	public Location editLocation(Location location) { return locationRepository.save(location); }
	
	@Override
	public List<Location> getAll() { return (List<Location>) locationRepository.findAll(); }
}
