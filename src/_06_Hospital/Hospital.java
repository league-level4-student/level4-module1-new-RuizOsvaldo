package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    ArrayList<Patient> unassignedPatients = new ArrayList<Patient>();

    public ArrayList<Doctor> getDoctors(){
        return doctors;
    }

    public ArrayList<Patient> getPatients(){
        return unassignedPatients;
    }

    public void addPatient(Patient patient){
        unassignedPatients.add(patient);    
    }

    public void addDoctor(Doctor doctor){
        
        doctors.add(doctor);
    
    }

    public void assignPatientsToDoctors(){
        int doctorNumber = 0;
        for(int i = 0; i < unassignedPatients.size(); i++){
            try {
                doctors.get(doctorNumber).assignPatient(unassignedPatients.get(i));
            } catch (DoctorFullException e) {
                doctorNumber++;
                i--;
            }
        }
        
    }

}
