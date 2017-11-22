package ec.com.app.bundle.backend.service;

import java.util.List;

import ec.com.app.bundle.backend.model.ContactSendMail;

public interface ContactSendMailService {
	
	ContactSendMail findByNames(String names);
	void saveContactSendMail (ContactSendMail contactSendMail);
	public List<ContactSendMail> findAll();
}
