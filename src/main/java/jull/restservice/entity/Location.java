package jull.restservice.entity;

import jull.restservice.entity.enums.LocationEnum;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name= "increment", strategy= "increment")
	@Column(name = "location_id", length = 10, nullable = false)
	private long locationId;
	@Column(name = "description")
	private String description;
	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	private LocationEnum type;

	public Location() {}
	public Location(int _id, String _description, LocationEnum _type) {
		locationId = _id;
		description = _description;
		type = _type;
	}
	public long getId() {
		return locationId;
	}
	public LocationEnum getType() {
		return type;
	}
	public String getDescription() {
		return description;
	}
	public void setId(int locationId) {
		this.locationId = locationId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setType(LocationEnum type) {
		this.type = type;
	}
	
//	public enum LocationTypes {Forest, Desert, Dungeon, River, Ocean}
	@Override
	public String toString() {
		return "Location [locationId =" + locationId + ", description =" + description
				+ ", type =" + type + "]";
	}
}