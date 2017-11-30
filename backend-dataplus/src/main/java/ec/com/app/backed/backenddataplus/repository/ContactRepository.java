package ec.com.app.backed.backenddataplus.repository;

import ec.com.app.backed.backenddataplus.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact,Long> {
}
