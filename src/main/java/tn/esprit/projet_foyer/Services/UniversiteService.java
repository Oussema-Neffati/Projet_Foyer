package tn.esprit.projet_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet_foyer.Entities.Foyer;
import tn.esprit.projet_foyer.Entities.Universite;
import tn.esprit.projet_foyer.Repositories.FoyerRepository;
import tn.esprit.projet_foyer.Repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteService implements IUniversiteService {

    private UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    @Override
    public List<Universite> findAllUniversites() {
        return universiteRepository.findAll();
    }
    private FoyerRepository foyerRepository;

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {
        Foyer foyer = foyerRepository.findAll().stream()
                .filter(f -> f.getIdFoyer() == idFoyer)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Foyer non trouvé"));

        Universite universite = universiteRepository.findAll().stream()
                .filter(u -> u.getNomUniversite().equals(nomUniversite))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Université non trouvée"));

        universite.setFoyer(foyer);
        return universiteRepository.save(universite);
    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {
        Universite universite = universiteRepository.findAll().stream()
                .filter(u -> u.getIdUniversite() == idUniversite)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Université non trouvée"));

        universite.setFoyer(null);
        return universiteRepository.save(universite);
    }
}