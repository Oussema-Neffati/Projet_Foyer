package tn.esprit.projet_foyer.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet_foyer.Entities.Etudiant;
import tn.esprit.projet_foyer.Services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantRestController {

    IEtudiantService etudiantService;

    // http://localhost:9090/etudiant/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        return etudiantService.findAllEtudiants();
    }

    // http://localhost:9090/etudiant/add-etudiant
    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudiantService.addEtudiant(e);
    }

    // http://localhost:9090/etudiant/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        return etudiantService.updateEtudiant(e);
    }

    // http://localhost:9090/etudiant/remove-etudiant/1
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long eId) {
        etudiantService.deleteEtudiant(eId);
    }

    // http://localhost:9090/etudiant/search-by-name/Ahmed
    @GetMapping("/search-by-name/{nom}")
    public List<Etudiant> searchByName(@PathVariable String nom) {
        return etudiantService.chercherParNom(nom);
    }

    // http://localhost:9090/etudiant/search-by-name-contains/ah
    @GetMapping("/search-by-name-contains/{nom}")
    public List<Etudiant> searchByNameContains(@PathVariable String nom) {
        return etudiantService.chercherParNomContient(nom);
    }

    // http://localhost:9090/etudiant/search-by-cin/12345678
    @GetMapping("/search-by-cin/{cin}")
    public Etudiant searchByCin(@PathVariable Long cin) {
        return etudiantService.chercherParCin(cin);
    }

    // http://localhost:9090/etudiant/search-by-name-prenom/Ahmed/Mohamed
    @GetMapping("/search-by-name-prenom/{nom}/{prenom}")
    public List<Etudiant> searchByNameAndPrenom(@PathVariable String nom, @PathVariable String prenom) {
        return etudiantService.chercherParNomEtPrenom(nom, prenom);
    }
}