package com.acme.UserRepository;

import org.springframework.data.repository.CrudRepository;
import com.acme.modelo.User;
public interface UserRepository extends CrudRepository<User, Long> {

		User findByUsername(String name);
}
