package tn.esprit.projet_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet_foyer.Entities.Etudiant;
import tn.esprit.projet_foyer.Repositories.EtudiantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantService implements IEtudiantService {

    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public List<Etudiant> findAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public List<Etudiant> chercherParNom(String nomEt) {
        return etudiantRepository.findByNomEt(nomEt);
    }

    @Override
    public List<Etudiant> chercherParNomContient(String nom) {
        return etudiantRepository.findByNomEtContains(nom);
    }

    @Override
    public Etudiant chercherParCin(Long cin) {
        return etudiantRepository.findByCin(cin);
    }

    @Override
    public List<Etudiant> chercherParNomEtPrenom(String nom, String prenom) {
        return etudiantRepository.findByNomEtAndPrenomEt(nom, prenom);
    }

    @Override
    public Etudiant findStudentByCinJPQL(Long cin) {
        return etudiantRepository.findStudentByCinJPQL(cin);
    }


}