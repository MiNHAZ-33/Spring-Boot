package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

@Scope(scopeName = "prototype")

public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public void assist(){

        System.out.println("Doctor is assisting");
    }


    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set bean name method is called");
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("Post construct method is called");
    }
}
