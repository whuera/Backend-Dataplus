package ec.com.app.bundle.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ec.com.app.bundle.backend.model.ContactSendMail;

public interface ContactSendMailRepository extends CrudRepository<ContactSendMail, Long>{

	public ContactSendMail findByNames(String names);
	public List<ContactSendMail> findAll();
}
