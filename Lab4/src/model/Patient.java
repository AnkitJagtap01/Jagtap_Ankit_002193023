/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import data.EncounterHistory;
import java.util.Date;

/**
 *
 * @author ankitjagtap
 */
public class Patient extends Person{
    
    private EncounterHistory encounterHistory;

    public Patient(String fullName, House residence, String gender, Date dob, int id, Encounter en) {
        super(fullName, residence, gender, dob, id);
        
        this.encounterHistory = new EncounterHistory();
        this.encounterHistory.addEncounter(en);
    }

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory eh) {
        this.encounterHistory = eh;
    }
    
}
