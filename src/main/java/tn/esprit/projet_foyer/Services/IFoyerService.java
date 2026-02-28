package tn.esprit.projet_foyer.Services;

import tn.esprit.projet_foyer.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    Foyer updateFoyer(Foyer foyer);
    void deleteFoyer(Long idFoyer);
    List<Foyer> findAllFoyers();

}
