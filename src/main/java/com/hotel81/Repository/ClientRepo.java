package com.hotel81.Repository;

import com.hotel81.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface ClientRepo extends JpaRepository<Client,Integer>
{
    Optional<Client> findOneByEmailAndPassword(String email, String password);
    Client findByEmail(String email);
}