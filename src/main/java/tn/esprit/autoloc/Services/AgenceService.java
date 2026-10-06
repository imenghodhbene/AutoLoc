package tn.esprit.autoloc.Services;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.AgenceRepository;
import tn.esprit.autoloc.entites.Agence;

import java.util.List;
@AllArgsConstructor
@Service

public class AgenceService implements IAgenceService {
    
   AgenceRepository agenceRepo;

    @Override
    public Agence AddAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void DeleteAgence(Agence agence) {
        agenceRepo.delete(agence);
    }

    @Override
    public List<Agence> GetAgences() {
        return agenceRepo.findAll();
    }
}
