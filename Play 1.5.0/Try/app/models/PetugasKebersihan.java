package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorValue;

import play.db.jpa.Model;

@Entity
@DiscriminatorValue("PetugasKebersihan")
public class PetugasKebersihan extends Pegawai {
	public String _cleaningSpecialization;
	public String Pekerjaan = "PetugasKebersihan";

	public void membersihkanKamar() {
		throw new UnsupportedOperationException();
	}

	public void membersihkanAreaHotel() {
		throw new UnsupportedOperationException();
	}
}