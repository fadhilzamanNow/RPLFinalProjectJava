package models;

import java.util.Vector;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import play.db.jpa.Model;

@Entity
public class Pemesan extends Model{
	public String _username;
	public String _password;
	public String _name;
	public String _email;
	public int _nmrtelefon;


	public void MembuatAkun() {
		throw new UnsupportedOperationException();
	}

	public void Login() {
		throw new UnsupportedOperationException();
	}

	public void BookingRuangan() {
		throw new UnsupportedOperationException();
	}

	public void MelakukanPembayaran() {
		throw new UnsupportedOperationException();
	}
}