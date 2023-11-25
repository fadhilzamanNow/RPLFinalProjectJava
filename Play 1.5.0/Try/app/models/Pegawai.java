package models;

import java.util.Vector;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import play.db.jpa.Model;

@Entity
public class Pegawai extends Model {
    public int nomor;
    public String nama;
    public int nmrtelefon;
    public int totalWorkingHours;	
    public boolean _isShiftPagi;
	public boolean _isShiftMalam;
    public Hotel _hotel;
    


    
}