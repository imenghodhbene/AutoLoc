package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Contrat;

import java.util.List;

public interface IContratService {

    Contrat AddContrat(Contrat contrat);

    Contrat UpdateContrat(Contrat contrat);

    void DeleteContrat(Contrat contrat);

    List<Contrat> GetContrats();
}