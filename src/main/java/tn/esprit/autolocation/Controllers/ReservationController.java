package tn.esprit.autolocation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocation.Entities.Reservation;
import tn.esprit.autolocation.Services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservations")
public class ReservationController {

    private IReservationService reservationService;

    @PostMapping("/ajouterReservation")
    public Reservation ajouterReservation(@RequestBody Reservation reservation) {
        return reservationService.ajouterReservation(reservation);
    }

    @PutMapping("/modifierReservation")
    public Reservation modifierReservation(@RequestBody Reservation reservation) {
        return reservationService.modifierReservation(reservation);
    }

    @DeleteMapping("/supprimerReservation/{id}")
    public void supprimerReservation(@PathVariable Long id) {
        reservationService.supprimerReservation(id);
    }

    @GetMapping("/getReservation/{id}")
    public Reservation afficherReservationByID(@PathVariable Long id) {
        return reservationService.AfficherReservationByID(id);
    }

    @GetMapping("/allReservations")
    public List<Reservation> afficherReservations() {
        return reservationService.afficherReservations();
    }

    @PutMapping("/affecterClientAReservation/{idClient}/{idReservation}")
    public void affecterClientAReservation(@PathVariable Long idClient, @PathVariable Long idReservation) {
        reservationService.affecterClientAReservation(idClient, idReservation);
    }

    @PutMapping("/affecterContratAReservation/{idContrat}/{idReservation}")
    public void affecterContratAReservation(@PathVariable Long idContrat, @PathVariable Long idReservation) {
        reservationService.affecterContratAReservation(idContrat, idReservation);
    }

    @PutMapping("/desaffecterContratDeReservation/{idReservation}")
    public void desaffecterContratDeReservation(@PathVariable Long idReservation) {
        reservationService.desaffecterContratDeReservation(idReservation);
    }
}