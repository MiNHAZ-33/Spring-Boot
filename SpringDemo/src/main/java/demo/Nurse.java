package demo;

import org.springframework.stereotype.Component;


public class Nurse implements Staff {
    public void assist(){
        System.out.println("Nurse is working on duty");
    }
}
