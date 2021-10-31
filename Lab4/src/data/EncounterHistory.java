/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import Model.Encounter;
import Model.Person;

import java.util.ArrayList;

/**
 *
 * @author ankitjagtap
 */
public class EncounterHistory {
    
        private ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        encounterHistory = new ArrayList<>();
    }

    public void addEncounter(Encounter encounter) {
        encounterHistory.add(encounter);
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
}
