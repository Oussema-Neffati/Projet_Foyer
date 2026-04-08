package tn.esprit.projet_foyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet_foyer.Entities.Chambre;
import tn.esprit.projet_foyer.Services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    IChambreService chambreService;

    // http://localhost:9090/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        return chambreService.findAllChambres();
    }

    // http://localhost:9090/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    // http://localhost:9090/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }

    // http://localhost:9090/chambre/remove-chambre/1
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long cId) {
        chambreService.deleteChambre(cId);
    }

}