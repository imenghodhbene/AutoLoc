package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.employeRepository;
import tn.esprit.autoloc.entites.employe;

import java.util.List;
@AllArgsConstructor
@Service
public class EmployeService implements IEmployeService{
    employeRepository eRepo;
    @Override
    public employe AddEmployee(employe e) {
        return eRepo.save(e);
    }

    @Override
    public employe UpdateEmployee(employe e) {
        return eRepo.save(e);
    }

    @Override
    public void DeleteEmployee(employe e) {
        eRepo.delete(e);

    }

    @Override
    public List<employe> GetAllEmployees() {
        return eRepo.findAll();
    }
}
