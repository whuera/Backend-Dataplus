package ec.com.app.bundle.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ec.com.app.bundle.backend.model.ContactSendMail;


/**
 * The Interface ContactSendMailRepository.
 */
public interface ContactSendMailRepository extends JpaRepository<ContactSendMail, Long> {
	
	/**
	 * Find by names.
	 *
	 * @param names the names
	 * @return the contact send mail
	 */
	public ContactSendMail findByNames(String names);
	/**
	 * 
	 * @param id
	 * @return
	 */
	public ContactSendMail findById(int id);

	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findAll()
	 */
	public List<ContactSendMail> findAll();
	
}
