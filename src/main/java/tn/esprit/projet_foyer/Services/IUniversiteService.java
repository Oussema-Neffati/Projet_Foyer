package tn.esprit.projet_foyer.Services;

import tn.esprit.projet_foyer.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long idUniversite);
    List<Universite> findAllUniversites();
}