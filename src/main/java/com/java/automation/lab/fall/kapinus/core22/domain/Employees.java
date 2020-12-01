package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

@XmlRootElement(name = "Employees")
@XmlType(propOrder = { "allTrainers", "administrators", "cleaners"})
public class Employees implements Serializable {
    private List<Trainer> allTrainers;
    private List<String> administrators;
    private List<String> cleaners;

    public void addAllTrainers(Trainer trainer){
        allTrainers.add(trainer);
    }
    public void removeAllTrainers(int index){
        allTrainers.remove(index);
    }

    public void addAdministrators(String name){
        administrators.add(name);
    }
    public void removeAdministrator(int index){
        administrators.remove(index);
    }
    public void addCleaners(String name){
        cleaners.add(name);
    }
    public void removeCleaners(int index){
        cleaners.remove(index);
    }

}
