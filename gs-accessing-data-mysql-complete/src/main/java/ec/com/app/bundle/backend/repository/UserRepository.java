package ec.com.app.bundle.backend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ec.com.app.bundle.backend.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
User findByName(String name);
public List<User> findAll();
public User save(User user);
}
