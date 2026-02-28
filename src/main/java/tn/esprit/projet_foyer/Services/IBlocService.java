package tn.esprit.projet_foyer.Services;

import tn.esprit.projet_foyer.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    Bloc addBloc(Bloc bloc);
    Bloc updateBloc(Bloc bloc);
    void deleteBloc(Long idBloc);
    List<Bloc> findAllBlocs();
}