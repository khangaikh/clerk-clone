package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.*;


@Entity
public class Hotel extends Model{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	public long id;
	
	@Required
	public String name;
	public Room[] rooms;
	public Rate[] rates;
	public Season[] seasons;
	public Users[] users;
	
	
	public Hotel(String name) {
        this.name = name;
    }

}
