package models;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorValue;


import play.db.jpa.Model;

@Entity
@DiscriminatorValue("Resepsionis")
public class Resepsionis extends Pegawai {
	public String _languageMaster;

	
	public String Pekerjaan = "Resepsionis";

	public void mendatakanPemesan() {
		throw new UnsupportedOperationException();
	}
}