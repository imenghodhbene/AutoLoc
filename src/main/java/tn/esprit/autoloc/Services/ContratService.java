package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ContratRepository;
import tn.esprit.autoloc.entites.Agence;
import tn.esprit.autoloc.entites.Contrat;

import java.util.List;
@AllArgsConstructor
@Service
public class ContratService implements IContratService{

    ContratRepository ContratRepo;
    @Override

    public Contrat AddContrat(Contrat contrat) {
        return ContratRepo.save(contrat);
    }

    @Override
    public Contrat UpdateContrat(Contrat contrat) {
        return ContratRepo.save(contrat);
    }



    @Override
    public void DeleteContrat(Contrat contrat) {
        ContratRepo.delete(contrat);
    }

    @Override
    public List<Contrat> GetContrats() {
        return ContratRepo.findAll();
    }
}
