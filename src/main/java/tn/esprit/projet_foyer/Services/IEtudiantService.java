package tn.esprit.projet_foyer.Services;

import tn.esprit.projet_foyer.Entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deleteEtudiant(Long idEtudiant);
    List<Etudiant> findAllEtudiants();
}