package models;

import java.util.Date;
import java.util.Vector;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Ruangan extends Model{
	public int _jmlhkasur;
	public int _jmlhtoilet;
	public int _kapasitasOrang;
}