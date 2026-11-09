package tn.esprit.autolocation.Services;

import tn.esprit.autolocation.Entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule (Vehicule vehicule);
    void supprimerVehicule (Long id) ;
    List<Vehicule> afficherVehicules ();
    Vehicule modifierVehicule (Vehicule vehicule);
    Vehicule AfficherVehiculeByID (Long id);

    void affecterVehiculeAAgence(Long idVehicule, Long idAgence);
    void desaffecterVehiculeDAgence(Long idVehicule);
    void affecterEquipementAVehicule(Long idEquipement, Long idVehicule);
    void desaffecterEquipementDeVehicule(Long idEquipement, Long idVehicule);
}