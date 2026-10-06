package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.EquipementRepository;
import tn.esprit.autoloc.entites.Equipement;

import java.util.List;
@AllArgsConstructor
@Service
public class EquipementService implements IEquipementService {
    EquipementRepository equipementRepo;
    @Override
    public Equipement AddEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public Equipement UpdateEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public void DeleteEquipement(Equipement equipement) {
        equipementRepo.delete(equipement);

    }

    @Override
    public List<Equipement> GetEquipements() {
        return  equipementRepo.findAll();
    }
}
