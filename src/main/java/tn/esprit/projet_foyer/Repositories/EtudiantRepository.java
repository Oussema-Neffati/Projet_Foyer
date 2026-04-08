package tn.esprit.projet_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.projet_foyer.Entities.Etudiant;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    List<Etudiant> findByNomEt(String nomEt);

    List<Etudiant> findByNomEtContains(String nom);

    Etudiant findByCin(Long cin);

    List<Etudiant> findByNomEtAndPrenomEt(String nomEt, String prenomEt);

    @Query("SELECT e FROM Etudiant e WHERE e.cin = :cin")
    Etudiant findStudentByCinJPQL(@Param("cin") Long cin);
}