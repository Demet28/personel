package tr.com.demetbektas.entities.personel;

import tr.com.demetbektas.interfaces.entitiy.IPersonel;

import javax.persistence.*;

@Entity
@Table(name = "PERSONEL")
public class PersonelImpl implements IPersonel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
    @Column(name = "AD")
    private String ad;
    @Column(name = "SOYAD")
    private String soyad;
    @Column(name = "ADRES")
    private String adres;


    public PersonelImpl() {
    }

    public PersonelImpl(Long id,String ad, String soyad, String adres) {
        this.id=id;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
