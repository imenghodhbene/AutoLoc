package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entites.employe;

@Repository
public interface employeRepository extends JpaRepository<employe, Long> {
}
