package java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "Subscription")
@XmlType(propOrder = { "name", "adress", "contact", "schedule", "openingHours", "price", "training"})
public class Subscription implements Serializable {
    private String name;
    private Adress adress;
    private Contact contact;
    private Schedule schedule;
    private OpeningHours openingHours;
    private PricePlan price;
    private Training training;

    public Subscription(String name, Adress adress, Contact contact, Schedule schedule, OpeningHours openingHours,
                        PricePlan price, Training training){
        this.name = name;
        this.adress = adress;
        this.contact = contact;
        this.schedule = schedule;
        this.openingHours = openingHours;
        this.price = price;
        this.training = training;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Adress getAdress(){
        return adress;
    }

    public void setAdress(Adress adress){
        this.adress = adress;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Schedule getSchedule(){
        return schedule;
    }

    public void setSchedule(Schedule schedule){
        this.schedule = schedule;
    }

    public OpeningHours getOpeningHours(){
        return openingHours;
    }

    public void setOpeningHours(OpeningHours openingHours){
        this.openingHours = openingHours;
    }

    public PricePlan getPricePlan(){

        return price;
    }

    public void setPricePlan(PricePlan price){
        this.price = price;
    }

    public Training getTraining(){
        return training;
    }

    public void setTraining(Training training){
        this.training = training;
    }

    @Override
    public String toString() {
        return "Subscription {\n\tname:" + name +
                "\n\tadress:" + adress +
                "\n\tcontact:" + contact +
                "\n\tschedule:" + schedule +
                "\n\topeningHours:" + openingHours +
                "\n\tprice:" + price +
                "\n\ttraining:" + training +
                "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return  name.equals(((Subscription)that).name) &&
                adress.equals(((Subscription)that).adress) &&
                contact.equals(((Subscription)that).contact) &&
                schedule.equals(((Subscription)that).schedule) &&
                openingHours.equals(((Subscription)that).openingHours) &&
                price.equals(((Subscription)that).price) &&
                training.equals(((Subscription)that).training);
    }

    @Override
    public int hashCode() {
        return (name.hashCode() + contact.hashCode() + training.hashCode()) * 3;
    }
}
