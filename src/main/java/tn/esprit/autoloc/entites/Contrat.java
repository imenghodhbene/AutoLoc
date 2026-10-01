package tn.esprit.autoloc.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    @Column(precision = 10, scale = 2)
    private BigDecimal montantTotal;

    private boolean valide;

    @OneToOne
    @JoinColumn(name = "id_reservation", unique = true)
    private Reservation reservation;
}