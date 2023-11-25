package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Testis extends Ruangan4 {
	private String _languageMaster;

	public void mendatakanPemesan() {
		throw new UnsupportedOperationException();
	}
}