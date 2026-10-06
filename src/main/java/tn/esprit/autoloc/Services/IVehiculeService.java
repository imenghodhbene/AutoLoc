package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule AddVehicule(Vehicule vehicule);
    Vehicule UpdateVehicule(Vehicule vehicule);
    void DeleteVehicule(Vehicule vehicule);
    List<Vehicule> getAllVehicules();
}
