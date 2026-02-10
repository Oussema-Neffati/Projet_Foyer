package tn.esprit.projet_foyer.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant ;
    private String NomEt ;
    private String prenomEt ;
    private Long cin ;
    private String ecole ;
    private Date dateNaissance ;

    @ManyToMany(mappedBy="Etudiant", cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}