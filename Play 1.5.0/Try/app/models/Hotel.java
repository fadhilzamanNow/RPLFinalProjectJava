package models;
import java.util.Vector;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import play.db.jpa.Model;

@Entity
public class Hotel extends Model{
	public String _nama;
	public String _lokasi;
	public int _ruanganTersedia;
	public boolean _isFull;
	

}