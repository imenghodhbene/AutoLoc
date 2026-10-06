package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entites.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}