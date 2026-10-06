package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.PaiementRepository;
import tn.esprit.autoloc.entites.Paiement;

import java.util.List;
@AllArgsConstructor
@Service
public class PaiementService implements IPaiementService{
    PaiementRepository paiementRepo;
    @Override
    public Paiement addPaiement(Paiement paiement) {
        return  paiementRepo.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return  paiementRepo.save(paiement);
    }

    @Override
    public void deletePaiement(Paiement paiement) {
        paiementRepo.delete(paiement);

    }

    @Override
    public List<Paiement> getAllPaiements() {
        return  paiementRepo.findAll();
    }
}
