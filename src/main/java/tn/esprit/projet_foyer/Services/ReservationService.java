package tn.esprit.projet_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet_foyer.Entities.Reservation;
import tn.esprit.projet_foyer.Repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    private ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }
}