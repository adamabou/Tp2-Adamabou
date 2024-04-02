package org.example.tp2adam.service;

import jakarta.transaction.Transactional;
import org.example.tp2adam.entities.Consultation;
import org.example.tp2adam.entities.Medecin;
import org.example.tp2adam.entities.Patient;
import org.example.tp2adam.entities.RendezVous;
import org.example.tp2adam.repository.ConsultationRepository;
import org.example.tp2adam.repository.MedecinRepository;
import org.example.tp2adam.repository.PatientRepository;
import org.example.tp2adam.repository.RendezVousRepository;
import org.springframework.stereotype.Service;


@Service
@Transactional
public  class HospitalServiceImpl implements IHospitalService{


    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return null;
    }

    @Override
    public Patient savePatient(Patient patient) {

        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
       
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return null;
    }

    public Consultation HospitalServiceImpl(Consultation consultation) {
        return consultationRepository.save(consultation);

    }
}
