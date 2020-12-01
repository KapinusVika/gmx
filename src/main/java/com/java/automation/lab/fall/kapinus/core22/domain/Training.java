package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;
import java.io.Serializable;

@XmlRootElement(name = "Training")
@XmlType(propOrder = { "name", "trainer", "client"})
public class Training implements Serializable {
    private String name;
    private Trainer trainer;
    private Client client;

    public Training(String name, Trainer trainer, Client client){
        this.name = name;
        this.trainer = trainer;
        this.client = client;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Training {\n\tname:" + name +
                "\n\ttrainer:" + trainer +
                "\n\tclient:" + client +
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
        return  name.equals(((Training)that).name) &&
                trainer.equals(((Training)that).trainer) &&
                client.equals(((Training)that).client);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, trainer, client);
    }
}

