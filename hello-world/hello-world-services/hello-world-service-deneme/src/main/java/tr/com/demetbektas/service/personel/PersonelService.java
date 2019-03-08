package tr.com.demetbektas.service.personel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.demetbektas.dao.personel.PersonelDaoImpl;
import tr.com.demetbektas.entities.personel.PersonelImpl;
import tr.com.demetbektas.interfaces.service.IPersonelService;

import javax.transaction.Transactional;

@Service
@Transactional
@SuppressWarnings(value = "unchecked")
public class PersonelService implements IPersonelService {

    @Autowired
    public PersonelDaoImpl personelDao;

    @Override
    public PersonelImpl getPersonel(String param) {
        return personelDao.getPersonel(param);
    }
}
