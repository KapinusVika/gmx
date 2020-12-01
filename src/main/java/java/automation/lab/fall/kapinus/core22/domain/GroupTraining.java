package java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.Objects;
import java.io.Serializable;

@XmlRootElement(name = "GroupTraining")
@XmlType(propOrder = { "name", "trainer", "clients", "duration"})
public class GroupTraining implements Serializable {
    private String name;
    private Trainer trainer;
    private List<Client> clients;
    private int duration;

    public GroupTraining(String name, Trainer trainer, List<Client> clients, int duration){
        this.name = name;
        this.trainer = trainer;
        this.clients = clients;
        this.duration = duration;
    }

    public void addClients(Client client){
        clients.add(client);
    }
    public void removeClients(int index) {
        clients.remove(index);
    }

    public double averageAge(){
        return this.clients.stream().mapToInt(client -> client.getAge()).average().getAsDouble();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    @Override
    public String toString() {
        return "GroupTraining{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", clients=" + clients +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupTraining that = (GroupTraining) o;
        return duration == that.duration &&
                Objects.equals(name, that.name) &&
                Objects.equals(trainer, that.trainer) &&
                Objects.equals(clients, that.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, trainer, clients, duration);
    }
}
