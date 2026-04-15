package tn.esprit.projet_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet_foyer.Entities.Bloc;
import tn.esprit.projet_foyer.Entities.Chambre;
import tn.esprit.projet_foyer.Repositories.BlocRepository;
import tn.esprit.projet_foyer.Repositories.ChambreRepository;

import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class BlocService implements IBlocService {

    private BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
        blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> findAllBlocs() {
        return blocRepository.findAll();
    }
    private ChambreRepository chambreRepository;

    @Override
    public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {
        Bloc bloc = blocRepository.findAll().stream()
                .filter(b -> b.getIdBloc() == idBloc)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Bloc non trouvé"));

        List<Chambre> chambres = chambreRepository.findAll().stream()
                .filter(c -> numChambre.contains(c.getNumeroChambre()))
                .toList();

        if (chambres.isEmpty()) {
            throw new RuntimeException("Aucune chambre trouvée");
        }

        chambres.forEach(c -> c.setBloc(bloc));
        chambreRepository.saveAll(chambres);
        bloc.setChambres(new HashSet<>(chambres));
        return blocRepository.save(bloc);
    }
}