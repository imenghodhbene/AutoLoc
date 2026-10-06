package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance AddMaintenance(Maintenance maintenance);
    Maintenance UpdateMaintenance(Maintenance maintenance);
    void DeleteMaintenance(Maintenance maintenance);
    List<Maintenance> GetMaintenances();
}
