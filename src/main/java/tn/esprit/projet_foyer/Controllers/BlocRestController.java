package tn.esprit.projet_foyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet_foyer.Entities.Bloc;
import tn.esprit.projet_foyer.Services.IBlocService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {

    IBlocService blocService;

    // http://localhost:9090/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocService.findAllBlocs();
    }

    // http://localhost:9090/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        return blocService.addBloc(b);
    }

    // http://localhost:9090/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc b) {
        return blocService.updateBloc(b);
    }

    // http://localhost:9090/bloc/remove-bloc/1
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long bId) {
        blocService.deleteBloc(bId);
    }

    @PostMapping("/affecter-chambres/{idBloc}")
    public Bloc affecterChambresABloc(
            @RequestBody List<Long> numChambre,
            @PathVariable long idBloc) {
        return blocService.affecterChambresABloc(numChambre, idBloc);
    }
}