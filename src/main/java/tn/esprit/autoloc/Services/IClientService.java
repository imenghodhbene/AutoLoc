package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.Client;
import java.util.List;

public interface IClientService {

    Client AddClient(Client client);

    Client UpdateClient(Client client);

    void DeleteClient(Client client);

    List<Client> GetClients();
}