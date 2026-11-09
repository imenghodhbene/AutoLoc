package tn.esprit.autolocation.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolocation.Entities.Contrat;
import tn.esprit.autolocation.Entities.Paiement;
import tn.esprit.autolocation.Repositories.ContratRepository;
import tn.esprit.autolocation.Repositories.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratServiceImpl implements IContratService {

    private ContratRepository contratRepository;
    private PaiementRepository paiementRepository;

    @Override
    public Contrat ajouterContrat(Contrat contart) {
        return contratRepository.save(contart);
    }

    @Override
    public void supprimerContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> afficherContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat AfficherContratByID(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void affecterPaiementAContrat(Long idPaiement, Long idContrat) {
        Paiement paiement = paiementRepository.findById(idPaiement)
                .orElseThrow(() -> new EntityNotFoundException("Paiement introuvable"));
        Contrat contrat = contratRepository.findById(idContrat)
                .orElseThrow(() -> new EntityNotFoundException("Contrat introuvable"));
        paiement.setContrat(contrat);
        paiementRepository.save(paiement);
    }
}