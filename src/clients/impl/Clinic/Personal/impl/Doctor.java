package clients.impl.Clinic.Personal.impl;

import java.util.List;

import clients.Animal;
import clients.impl.Clinic.Personal.Staff;

public class Doctor extends Staff {
    private final List<String> diagnosis = List.of("Perelom", "Allergija", "Artrit");
    

    public Doctor(String name) {
        super(name);
    }
   
    public void doDiagnose(Animal patient) {
        int random = (int) (Math.random() * 2);
        System.out.println(patient + "Diagnoz: " + diagnosis.get(random));
    }
}
