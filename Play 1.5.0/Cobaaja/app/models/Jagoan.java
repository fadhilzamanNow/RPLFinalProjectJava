package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Jagoan extends Model {
    public String nama;
    public String nim;
    public String Alamat;
    public Date tgllhr;

    public void setNama(String nama){
        this.nama = nama+ " narsis";
    }
}