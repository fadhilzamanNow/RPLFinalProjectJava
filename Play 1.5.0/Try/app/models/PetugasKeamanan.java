package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorValue;

import play.db.jpa.Model;

@Entity
@DiscriminatorValue("PetugasKeamanan")
public class PetugasKeamanan extends Pegawai {
	public String _patrolArea;
	public String Pekerjaan = "PetugasKeamanan";


	public void menjagaArea() {
		throw new UnsupportedOperationException();
	}
}