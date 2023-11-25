package models;

import java.util.Date;
import java.util.Vector;


import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity


public class Hotel extends Model{
	private int _id;
	private String _nama;
	private String _lokasi;
	private int _ruanganTersedia;
	private boolean _isFull;
	public Vector<Ruangan> _unnamed_Ruangan_ = new Vector<Ruangan>();
	public Vector<Pegawai> _unnamed_Pegawai_ = new Vector<Pegawai>();

	public int getRuanganTersedia() {
		return this._ruanganTersedia;
	}

	public void setRuanganTersedia(int aRuanganTersedia) {
		this._ruanganTersedia = aRuanganTersedia;
	}

	public String getNama() {
		return this._nama;
	}

	public void setNama(String aNama) {
		this._nama = aNama;
	}

	public String getLokasi() {
		return this._lokasi;
	}

	public void setLokasi(String aLokasi) {
		this._lokasi = aLokasi;
	}


	public int gettId() {
		return this._id;
	}

	public void setId(int aId) {
		this._id = aId;
	}

	
}