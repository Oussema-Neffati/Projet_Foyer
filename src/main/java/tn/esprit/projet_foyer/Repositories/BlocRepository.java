package tn.esprit.projet_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet_foyer.Entities.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}