package ec.com.app.bundle.backend.service;

import java.util.List;

import ec.com.app.bundle.backend.model.ContactSendMail;

// TODO: Auto-generated Javadoc
/**
 * The Interface ContactSendMailService.
 */
public interface ContactSendMailService {
	
	/**
	 * Find by names.
	 *
	 * @param names the names
	 * @return the contact send mail
	 */
	ContactSendMail findByNames(String names);
	
	/**
	 * Save contact send mail.
	 *
	 * @param contactSendMail the contact send mail
	 */
	void saveContactSendMail (ContactSendMail contactSendMail);
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	public List<ContactSendMail> findAll();
}
