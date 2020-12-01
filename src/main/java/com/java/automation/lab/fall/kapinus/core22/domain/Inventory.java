package com.java.automation.lab.fall.kapinus.core22.domain;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
@XmlRootElement(name = "Inventory")
@XmlType(propOrder = { "listCardioEq", "listPowerEq"})
public class Inventory implements Serializable {
    private int inventoryNum;
    private Map<Integer, CardioEquipment> listCardioEq;
    private Map<Integer, PowerEquipment> listPowerEq;

    public Inventory(int inventoryNum){
        this.inventoryNum = inventoryNum;
        listPowerEq = new HashMap<>();
        listCardioEq = new HashMap<>();
    }

    public Inventory(int inventoryNum, Map<Integer, CardioEquipment> listCardioEq,
                     Map<Integer, PowerEquipment> listPowerEq){
        this.inventoryNum = inventoryNum;
        this.listCardioEq = listCardioEq;
        this.listPowerEq = listPowerEq;
    }
    public Map<Integer, CardioEquipment> getListCardioEq() {
        return listCardioEq;
    }

    public void setListCardioEq(Map<Integer, CardioEquipment> listCardioEq) {
        this.listCardioEq = listCardioEq;
    }

    public Map<Integer, PowerEquipment> getListPowerEq() {
        return listPowerEq;
    }

    public void setListPowerEq(Map<Integer, PowerEquipment> listPowerEq) {
        this.listPowerEq = listPowerEq;
    }

    public void addListCardioEq(int inventoryNum, CardioEquipment cardioEquipment){
        listCardioEq.put(inventoryNum, cardioEquipment);
    }

    public void removeListCardioEq(int inventoryNum, CardioEquipment cardioEquipment){
        listCardioEq.remove(cardioEquipment, inventoryNum);
    }
    public void addListPowerEq(int inventoryNum, PowerEquipment powerEquipment){
        listPowerEq.put(inventoryNum, powerEquipment);
    }

    public void removeListPowerEq(int inventoryNum, PowerEquipment powerEquipment){
        listPowerEq.remove(powerEquipment, inventoryNum);
    }
}
