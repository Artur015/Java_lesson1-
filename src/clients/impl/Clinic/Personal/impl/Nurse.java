package clients.impl.Clinic.Personal.impl;

import clients.impl.Clinic.Personal.Staff;

public class Nurse extends Staff {

    public Nurse(String name) {
        super(name);
    }

    public void vaccination() {
        System.out.println("Делает уколы");
    }
    
    
}
