package tr.com.demetbektas.web.controller.personel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tr.com.demetbektas.interfaces.entitiy.IPersonel;
import tr.com.demetbektas.interfaces.service.IPersonelService;

@RestController
@RequestMapping("personel")
public class PersonelResourceController {

    @Autowired
    public IPersonelService personelService;

    @RequestMapping(value = "/getPersonel",method = RequestMethod.GET)
    public IPersonel getPersonel(String param){
        return personelService.getPersonel(param);
    }


}
