package tn.esprit.projet_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet_foyer.Entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}