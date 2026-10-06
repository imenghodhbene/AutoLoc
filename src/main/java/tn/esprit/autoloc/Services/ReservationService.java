package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ReservationRepository;
import tn.esprit.autoloc.entites.Reservation;

import java.util.List;
@AllArgsConstructor
@Service
public class ReservationService implements IReservationService{
    ReservationRepository reservationRepo;
    @Override
    public Reservation AddReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation) {
        return  reservationRepo.save(reservation);
    }

    @Override
    public void DeleteReservation(Reservation reservation) {
        reservationRepo.delete(reservation);

    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }
}
