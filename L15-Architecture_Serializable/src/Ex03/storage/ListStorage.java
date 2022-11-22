package Ex03.storage;

import Ex03.controller.Storage;
import Ex03.model.Company;
import Ex03.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage, Serializable {
    private final List<Company> companies = new ArrayList<>();
    private final List<Employee> employees = new ArrayList<>();

    // -------------------------------------------------------------------------

    public List<Company> getCompanies() {
        return new ArrayList<>(companies);
    }

    public void storeCompany(Company company) {
        companies.add(company);
    }

    public void deleteCompany(Company company) {
        companies.remove(company);
    }

    // -------------------------------------------------------------------------

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void storeEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    // -------------------------------------------------------------------------

    public static ListStorage loadStorage() {
        String fileName = "L15-Architecture_Serializable/src/Ex03/Storage.ser";
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            Object obj = objIn.readObject();
            ListStorage storage = (ListStorage) obj;
            System.out.println("Storage loaded from file " + fileName);
            return storage;
        } catch (ClassCastException ex) {
            System.out.println("Class of serialized object changed");
            System.out.println(ex);
            return null;
        } catch (ClassNotFoundException ex) {
            System.out.println("Class of serialized object not found");
            System.out.println(ex);
            return null;
        } catch (IOException ex) {
            System.out.println("Error reading file");
            System.out.println(ex);
            return null;
        }
    }

    public static void saveStorage(Storage storage) {
        String fileName = "L15-Architecture_Serializable/src/Ex03/Storage.ser";
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            objOut.writeObject(storage);
            System.out.println("Storage saved in file " + fileName);
        } catch (IOException ex) {
            System.out.println("Error writing file");
            System.out.println(ex);
            throw new RuntimeException();
        }
    }
}
