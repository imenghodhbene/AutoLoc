package tn.esprit.autolocation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocation.Entities.Maintenance;
import tn.esprit.autolocation.Entities.Vehicule;
import tn.esprit.autolocation.Repositories.MaintenanceRepository;
import tn.esprit.autolocation.Repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private MaintenanceRepository maintenanceRepository;
    private VehiculeRepository vehiculeRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        if (maintenance.getVehicule() != null && maintenance.getVehicule().getId() != null) {
            Vehicule v = vehiculeRepository.findById(maintenance.getVehicule().getId())
                    .orElseThrow(() -> new RuntimeException("Véhicule introuvable"));
            maintenance.setVehicule(v);
        }
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void supprimerMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> afficherMaintenances() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance AfficherMaintenanceByID(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }
}