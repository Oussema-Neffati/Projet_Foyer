package tn.esprit.projet_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.projet_foyer.Entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
}