package org.example.tp2adam.service;


import org.example.tp2adam.entities.Medecin;
import org.example.tp2adam.entities.Patient;
import org.example.tp2adam.entities.RendezVous;
import org.example.tp2adam.entities.Consultation;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
