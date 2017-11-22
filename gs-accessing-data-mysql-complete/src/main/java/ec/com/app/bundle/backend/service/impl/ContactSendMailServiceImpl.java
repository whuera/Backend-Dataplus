package ec.com.app.bundle.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.app.bundle.backend.model.ContactSendMail;
import ec.com.app.bundle.backend.repository.ContactSendMailRepository;
import ec.com.app.bundle.backend.service.ContactSendMailService;


@Service
public class ContactSendMailServiceImpl implements ContactSendMailService{
	@Autowired
	private ContactSendMailRepository ContactSendMailRepository;

	@Override
	public ContactSendMail findByNames(String names) {
		
		return ContactSendMailRepository.findByNames(names);
	}

	@Override
	public void saveContactSendMail(ContactSendMail contactSendMail) {
		ContactSendMailRepository.save(contactSendMail);
		
	}

	@Override
	public List<ContactSendMail> findAll() {
		return ContactSendMailRepository.findAll();
	}

}
