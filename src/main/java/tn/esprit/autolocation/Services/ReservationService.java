package tn.esprit.autolocation.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolocation.Entities.Client;
import tn.esprit.autolocation.Entities.Contrat;
import tn.esprit.autolocation.Entities.Reservation;
import tn.esprit.autolocation.Repositories.ClientRepository;
import tn.esprit.autolocation.Repositories.ContratRepository;
import tn.esprit.autolocation.Repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    ReservationRepository reservationRepository;
    ClientRepository clientRepository;
    ContratRepository contratRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void supprimerReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> afficherReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation AfficherReservationByID(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void affecterClientAReservation(Long idClient, Long idReservation) {
        Client client = clientRepository.findById(idClient)
                .orElseThrow(() -> new EntityNotFoundException("Client introuvable"));
        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() -> new EntityNotFoundException("Reservation introuvable"));
        reservation.setClient(client);
        reservationRepository.save(reservation);
    }

    @Override
    @Transactional
    public void affecterContratAReservation(Long idContrat, Long idReservation) {
        Contrat contrat = contratRepository.findById(idContrat)
                .orElseThrow(() -> new EntityNotFoundException("Contrat introuvable"));
        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() -> new EntityNotFoundException("Reservation introuvable"));
        contrat.setReservation(reservation);   // Contrat = côté propriétaire
        contratRepository.save(contrat);
    }

    @Override
    @Transactional
    public void desaffecterContratDeReservation(Long idReservation) {
        Reservation reservation = reservationRepository.findById(idReservation)
                .orElseThrow(() -> new EntityNotFoundException("Reservation introuvable"));
        Contrat contrat = reservation.getContrat();
        if (contrat != null) {
            contrat.setReservation(null);
            reservation.setContrat(null);
            contratRepository.save(contrat);
        }
    }
}