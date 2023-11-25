package models;

import java.util.Date;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Ruangan4 extends Model {
	public int _id;
	protected String _nama;
	protected int _nmrtelefon;
	protected int _totalWorkingHours;
	protected boolean _isShiftPagi;
	protected boolean _isShiftMalam;
	public Hotel _unnamed_Hotel_;

	
	

	
}