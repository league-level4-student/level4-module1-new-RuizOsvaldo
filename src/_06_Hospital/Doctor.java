package _06_Hospital;

import java.util.ArrayList;

public class Doctor {
    
    ArrayList<Patient> patients = new ArrayList<Patient>();

    public ArrayList<Patient> getPatients(){
        return patients;
    }

    public void assignPatient(Patient patient){
       patients.add(patient);
            
    }

    public void doMedicine(){
        for(Patient p: patients){
            p.checkPulse();
        }
    }

    public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

}
