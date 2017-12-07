package ec.com.app.bundle.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.app.bundle.backend.model.ContactSendMail;
import ec.com.app.bundle.backend.repository.ContactSendMailRepository;
import ec.com.app.bundle.backend.service.ContactSendMailService;



/**
 * The Class ContactSendMailServiceImpl.
 */
@Service
public class ContactSendMailServiceImpl implements ContactSendMailService{
	
	/** The Contact send mail repository. */
	@Autowired
	private ContactSendMailRepository ContactSendMailRepository;

	/* (non-Javadoc)
	 * @see ec.com.app.bundle.backend.service.ContactSendMailService#findByNames(java.lang.String)
	 */
	@Override
	public ContactSendMail findByNames(String names) {
		
		return ContactSendMailRepository.findByNames(names);
	}

	/* (non-Javadoc)
	 * @see ec.com.app.bundle.backend.service.ContactSendMailService#saveContactSendMail(ec.com.app.bundle.backend.model.ContactSendMail)
	 */
	@Override
	public ContactSendMail saveContactSendMail(ContactSendMail contactSendMail) {
		return ContactSendMailRepository.save(contactSendMail);
		
	}

	/* (non-Javadoc)
	 * @see ec.com.app.bundle.backend.service.ContactSendMailService#findAll()
	 */
	@Override
	public List<ContactSendMail> findAll() {
		return ContactSendMailRepository.findAll();
	}

	public ContactSendMail findById(int id) {
		return ContactSendMailRepository.findById(id);
	}

}
