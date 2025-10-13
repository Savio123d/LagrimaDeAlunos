package com.example.Restaurante.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsersRepository  extends JpaRepository<UserModel,Long> {
        UserDetails findByLogin(String username);
}
