package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Agence;
import java.util.List;

public interface IAgenceService {

    Agence AddAgence(Agence agence);

    Agence updateAgence(Agence agence);

    void DeleteAgence(Agence agence);

    List<Agence> GetAgences();
}