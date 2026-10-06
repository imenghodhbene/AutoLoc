package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.MaintenanceRepository;
import tn.esprit.autoloc.entites.Maintenance;

import java.util.List;
@AllArgsConstructor
@Service
public class MaintenanceService implements IMaintenanceService{
    MaintenanceRepository maintenanceRepo;
    @Override
    public Maintenance AddMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public Maintenance UpdateMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public void DeleteMaintenance(Maintenance maintenance) {
        maintenanceRepo.delete(maintenance);

    }

    @Override
    public List<Maintenance> GetMaintenances() {
        return maintenanceRepo.findAll();
    }
}
