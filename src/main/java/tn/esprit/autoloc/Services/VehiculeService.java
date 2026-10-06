package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.VehiculeRepository;
import tn.esprit.autoloc.entites.Vehicule;

import java.util.List;
@AllArgsConstructor
@Service
public class VehiculeService implements IVehiculeService{
    VehiculeRepository vehiculeRepo;
    @Override
    public Vehicule AddVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public void DeleteVehicule(Vehicule vehicule) {
        vehiculeRepo.delete(vehicule);

    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepo.findAll();
    }
}
