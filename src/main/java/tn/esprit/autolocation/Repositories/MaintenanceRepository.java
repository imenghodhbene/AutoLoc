package tn.esprit.autolocation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocation.Entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}