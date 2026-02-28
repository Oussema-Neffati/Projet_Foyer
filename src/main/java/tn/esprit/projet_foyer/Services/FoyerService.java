package tn.esprit.projet_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet_foyer.Entities.Foyer;
import tn.esprit.projet_foyer.Repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FoyerService implements IFoyerService {

    private FoyerRepository foyerRepository;

    @Override
    public Foyer addFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updateFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Long idFoyer) {
        foyerRepository.deleteById(idFoyer);
    }

    @Override
    public List<Foyer> findAllFoyers() {
        return foyerRepository.findAll();
    }
}
