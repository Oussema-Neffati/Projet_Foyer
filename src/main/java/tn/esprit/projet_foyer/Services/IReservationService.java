package tn.esprit.projet_foyer.Services;

import tn.esprit.projet_foyer.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(String idReservation);
    List<Reservation> findAllReservations();
}