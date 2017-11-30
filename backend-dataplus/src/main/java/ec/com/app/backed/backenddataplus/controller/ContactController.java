package ec.com.app.backed.backenddataplus.controller;

import ec.com.app.backed.backenddataplus.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;
}
