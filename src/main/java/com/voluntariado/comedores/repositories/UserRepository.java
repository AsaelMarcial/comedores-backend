package com.voluntariado.comedores.repositories;

import com.voluntariado.comedores.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:3000")
public interface UserRepository extends JpaRepository<User, Long> {


}
