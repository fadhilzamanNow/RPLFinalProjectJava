package models;

import java.util.Date;
import java.util.Vector;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
/* public class Jagoan extends Model {
    
}*/
public class Pegawai {
	private int _id;
	private String _nama;
	private int _nmrtelefon;
	private int _totalWorkingHours;
	private boolean _isShiftPagi;
	private boolean _isShiftMalam;
	public Hotel _unnamed_Hotel_;
}