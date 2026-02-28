package tn.esprit.projet_foyer.Services;

import tn.esprit.projet_foyer.Entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long idChambre);
    List<Chambre> findAllChambres();
}