package clients;

import java.time.LocalDate;

public class Fish extends Animal{

    public Fish(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void FishlifeCycle(){
        toGo();
        fly();
    }

    private void toGo(){
        System.out.println(getType() + " cant walk");
    }
    private void fly(){
        System.out.println(getType() + " cant fly");
    }
}
