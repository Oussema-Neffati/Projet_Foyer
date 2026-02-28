package tn.esprit.projet_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet_foyer.Entities.Bloc;
import tn.esprit.projet_foyer.Repositories.BlocRepository;

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
}