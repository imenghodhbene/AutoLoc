package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ClientRepository;
import tn.esprit.autoloc.entites.Client;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService implements IClientService {

    ClientRepository clientRepo;

    @Override
    public Client AddClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public Client UpdateClient(Client client) {
        return clientRepo.save(client);
    }

    @Override
    public void DeleteClient(Client client) {
        clientRepo.delete(client);
    }

    @Override
    public List<Client> GetClients() {
        return clientRepo.findAll();
    }
}