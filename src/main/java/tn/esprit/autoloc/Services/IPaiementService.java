package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement  paiement);
    Paiement  updatePaiement(Paiement  paiement);
    void deletePaiement(Paiement  paiement);
    List<Paiement> getAllPaiements();
}
