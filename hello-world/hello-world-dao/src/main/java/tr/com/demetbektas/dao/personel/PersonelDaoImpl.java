package tr.com.demetbektas.dao.personel;

import org.springframework.stereotype.Repository;
import tr.com.demetbektas.entities.personel.PersonelImpl;

@Repository
public class PersonelDaoImpl {

    public PersonelImpl getPersonel(String param){

        PersonelImpl personel = new PersonelImpl();
        personel.setId(1234L);
        personel.setAd("demet");
        personel.setSoyad("bektaş");
        personel.setAdres("maliye bakanlığı");
        return personel;
    }


}
