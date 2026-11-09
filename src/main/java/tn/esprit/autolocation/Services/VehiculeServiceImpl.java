package tn.esprit.autolocation.Services;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autolocation.Entities.Agence;
import tn.esprit.autolocation.Entities.Equipement;
import tn.esprit.autolocation.Entities.Vehicule;
import tn.esprit.autolocation.Repositories.AgenceRepository;
import tn.esprit.autolocation.Repositories.EquipementRepository;
import tn.esprit.autolocation.Repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private VehiculeRepository vehiculeRepository;
    private AgenceRepository agenceRepository;
    private EquipementRepository equipementRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void supprimerVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> afficherVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule AfficherVehiculeByID(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable"));
        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new EntityNotFoundException("Agence introuvable"));
        vehicule.setAgence(agence);
        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void desaffecterVehiculeDAgence(Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable"));
        vehicule.setAgence(null);
        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void affecterEquipementAVehicule(Long idEquipement, Long idVehicule) {
        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new EntityNotFoundException("Equipement introuvable"));
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable"));
        vehicule.getEquipements().add(equipement);
        vehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable"));
        vehicule.getEquipements().removeIf(e -> e.getId().equals(idEquipement));
        vehiculeRepository.save(vehicule);
    }
}