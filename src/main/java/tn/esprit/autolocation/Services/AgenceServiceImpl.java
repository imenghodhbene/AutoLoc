package tn.esprit.autolocation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.Entities.Agence;
import tn.esprit.autolocation.Repositories.AgenceRepository;
import tn.esprit.autolocation.Repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceServiceImpl implements IAgenceSerive {

    private AgenceRepository agenceRepository;
    private VehiculeRepository vehiculeRepository;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> afficherAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence modifierAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence AfficherAgenceByID(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence affecterVehiculesAgence(Agence agence) {
        agenceRepository.save(agence);
        agence.getVehicules().forEach(
                vehicule -> {
                    vehicule.setAgence(agence);
                    vehiculeRepository.save(vehicule);
                }
        );
        return agence;
    }
}