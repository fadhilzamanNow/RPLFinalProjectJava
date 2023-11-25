package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorValue;

import play.db.jpa.Model;

@Entity
@DiscriminatorValue("Chef")
public class Chef extends Pegawai {
	public String _signatureDish;
	public String Pekerjaan = "Chef";


	public void memasak() {
		throw new UnsupportedOperationException();
	}
}