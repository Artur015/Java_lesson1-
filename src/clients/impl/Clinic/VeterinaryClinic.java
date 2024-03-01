package clients.impl.Clinic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;
import clients.impl.Clinic.Personal.Staff;
import clients.impl.Clinic.Personal.impl.Nurse;

public class VeterinaryClinic {
    
    private final List<Staff> staff;
    private final List<Animal> patients;

    public VeterinaryClinic() {
        this.staff = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void addStaff(Staff employee) {
        staff.add(employee);
    }

    public void fireStaff(Staff employee) {
        staff.remove(employee);
    }

    public List<Staff> getNurse() {
        List<Staff> result = new LinkedList<>();
        for (Staff emp : staff) {
            if(emp instanceof Nurse) {
                result.add(emp);
            }
        }
        return result;
    }

    public List<Animal> getFlyables() {
        List<Animal> result = new ArrayList<>();
        for (Animal patients : patients) {
            if (patients instanceof Flyable) {
                result.add(patients);
            }
        }

        return result;
    }

    public List<Animal> Swimable() {
        List<Animal> result = new ArrayList<>();
        for (Animal patients : patients) {
            if (patients instanceof Swimable) {
                result.add(patients);
            }
        }

        return result;
    }

    public List<Animal> Goable() {
        List<Animal> result = new ArrayList<>();
        for (Animal patients : patients) {
            if (patients instanceof Goable) {
                result.add(patients);
            }
        }

        return result;
    }
}
