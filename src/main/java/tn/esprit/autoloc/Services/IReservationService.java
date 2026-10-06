package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation AddReservation(Reservation reservation);
    Reservation UpdateReservation(Reservation reservation);
    void DeleteReservation(Reservation reservation);
    List<Reservation> getAllReservations();

}
