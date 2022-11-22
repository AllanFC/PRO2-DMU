package Ex03.controller;

import Ex03.model.Company;
import Ex03.model.Employee;

import java.util.List;

public interface Storage {
    List<Company> getCompanies();
    List<Company> getEmployees();

    void storeCompany(Company company);
    void deleteCompany(Company company);

    void storeEmployee(Employee employee);
    void deleteEmployee(Employee employee);
}
