package tn.esprit.autoloc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.entites.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
