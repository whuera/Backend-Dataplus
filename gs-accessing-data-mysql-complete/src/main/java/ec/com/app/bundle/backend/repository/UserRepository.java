package ec.com.app.bundle.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import ec.com.app.bundle.backend.model.User;

// TODO: Auto-generated Javadoc
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

/**
 * The Interface UserRepository.
 */
public interface UserRepository extends JpaRepository<User, Long> {

/**
 * Find by name.
 *
 * @param name the name
 * @return the user
 */
User findByName(String name);

/* (non-Javadoc)
 * @see org.springframework.data.repository.CrudRepository#findAll()
 */
public List<User> findAll();

/* (non-Javadoc)
 * @see org.springframework.data.repository.CrudRepository#save(S)
 */
public User save(User user);
}
