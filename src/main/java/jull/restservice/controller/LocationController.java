package jull.restservice.controller;

import jull.restservice.entity.Location;
import jull.restservice.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class LocationController {
	@Resource
	LocationService locationService;

	@RequestMapping(value = "/location/{locationId}", method = RequestMethod.GET)
	public Location getLocation(@PathVariable long locationId) { return locationService.getById(locationId); }

	@RequestMapping(value = "/locations", method = RequestMethod.GET)
	public List<Location> locations() { return locationService.getAll(); }

	@RequestMapping(value = "/location", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addLocation(Location location) { locationService.addLocation(location); }

	@RequestMapping(value = "/location/{locationId}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void delete(long locationId) { locationService.delete(locationId); }

	@RequestMapping(value = "/location/{locationId}", method = RequestMethod.PUT)
	public Location editLocation(Location location, long locationId) { return locationService.editLocation(location); }
}
