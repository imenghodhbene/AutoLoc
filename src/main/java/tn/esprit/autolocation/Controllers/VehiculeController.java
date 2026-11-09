package tn.esprit.autolocation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocation.Entities.Vehicule;
import tn.esprit.autolocation.Services.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicules")
public class VehiculeController {

    private IVehiculeService vehiculeService;

    @PostMapping("/ajouterVehicule")
    public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.ajouterVehicule(vehicule);
    }

    @PutMapping("/modifierVehicule")
    public Vehicule modifierVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeService.modifierVehicule(vehicule);
    }

    @DeleteMapping("/supprimerVehicule/{id}")
    public void supprimerVehicule(@PathVariable Long id) {
        vehiculeService.supprimerVehicule(id);
    }

    @GetMapping("/getVehicule/{id}")
    public Vehicule afficherVehiculeByID(@PathVariable Long id) {
        return vehiculeService.AfficherVehiculeByID(id);
    }

    @GetMapping("/allVehicules")
    public List<Vehicule> afficherVehicules() {
        return vehiculeService.afficherVehicules();
    }

    @PutMapping("/affecterVehiculeAAgence/{idVehicule}/{idAgence}")
    public void affecterVehiculeAAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        vehiculeService.affecterVehiculeAAgence(idVehicule, idAgence);
    }

    @PutMapping("/desaffecterVehiculeDAgence/{idVehicule}")
    public void desaffecterVehiculeDAgence(@PathVariable Long idVehicule) {
        vehiculeService.desaffecterVehiculeDAgence(idVehicule);
    }

    @PutMapping("/affecterEquipementAVehicule/{idEquipement}/{idVehicule}")
    public void affecterEquipementAVehicule(@PathVariable Long idEquipement, @PathVariable Long idVehicule) {
        vehiculeService.affecterEquipementAVehicule(idEquipement, idVehicule);
    }

    @PutMapping("/desaffecterEquipementDeVehicule/{idEquipement}/{idVehicule}")
    public void desaffecterEquipementDeVehicule(@PathVariable Long idEquipement, @PathVariable Long idVehicule) {
        vehiculeService.desaffecterEquipementDeVehicule(idEquipement, idVehicule);
    }
}