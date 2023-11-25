package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Pegawai extends Model {
	private int _id;
	private int _jmlhkasur;
	private int _jmlhtoilet;
	private int _kapasitasOrang;
	
	
	public int getJmlhkasur() {
		return this._jmlhkasur;
	}

	public void setJmlhkasur(int aJmlhkasur) {
		this._jmlhkasur = aJmlhkasur;
	}

	public int getJmlhtoilet() {
		return this._jmlhtoilet;
	}

	public void setJmlhtoilet(int aJmlhtoilet) {
		this._jmlhtoilet = aJmlhtoilet;
	}

	public int getKapasitasOrang() {
		return this._kapasitasOrang;
	}

	public void setKapasitasOrang(int aKapasitasOrang) {
		this._kapasitasOrang = aKapasitasOrang;
	}

	
}