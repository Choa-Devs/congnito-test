package org.example.spring_security_cognito.repositories;

import org.example.spring_security_cognito.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {


}
