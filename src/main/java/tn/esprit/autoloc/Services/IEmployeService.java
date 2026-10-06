package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entites.employe;

import java.util.List;

public interface IEmployeService {
    employe AddEmployee(employe e);
    employe UpdateEmployee(employe e);
    void DeleteEmployee(employe e);
    List<employe> GetAllEmployees();
}
