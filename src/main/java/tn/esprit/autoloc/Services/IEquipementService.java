package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement AddEquipement(Equipement equipement);
    Equipement UpdateEquipement(Equipement equipement);
    void DeleteEquipement(Equipement equipement);
    List<Equipement> GetEquipements();
}
