
  
import java.time.LocalDate;

public class Person {

    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean Pensioner;
    private boolean PublicServer;
    private float salary;

    public Person() {

    }

    public Person(String name, String surname, int birthDate, float salary) {
	super();
	this.name = name;
	this.surname = surname;
	this.birthDate = birthDate;
	this.salary = salary;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getSurname() {
	return surname;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

    public int getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(int birthDate) {
	this.birthDate = birthDate;
    }

    public boolean isAnotherCompanyOwner() {
	return anotherCompanyOwner;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
	this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public boolean isPensioner() {
	return Pensioner;
    }

    public void setPensioner(boolean pensioner) {
	Pensioner = pensioner;
    }

    public boolean isPublicServer() {
	return PublicServer;
    }

    public void setPublicServer(boolean publicServer) {
	PublicServer = publicServer;
    }

    public float getSalary() {
	return salary;
    }

    public void setSalary(float salary) {
	this.salary = salary;
    }

    public String fullName() {
	return name + " " + surname;
    }

    public float calculateYearlySalary() {
	return this.salary * 12;
    }

    private int age() {
	return LocalDate.now().getYear() - birthDate;
    }

    public boolean isMEI() {
	if (calculateYearlySalary() < 130000 && age() >= 18) {
	    return anotherCompanyOwner == false && Pensioner == false && PublicServer == false;
	}
	return false;
    }
}
