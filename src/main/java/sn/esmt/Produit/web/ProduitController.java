package sn.esmt.Produit.web;

import jakarta.persistence.PostUpdate;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.Produit.entity.ProduitEntity;
import sn.esmt.Produit.service.ProduitService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("produit")
@AllArgsConstructor
public class ProduitController {
  private ProduitService produitService;

  @PostMapping
  public ProduitEntity save(ProduitEntity produitEntity)
  {
    return  produitService.save(produitEntity);
  }


  @GetMapping
  public List<ProduitEntity> all(){
    return  produitService.getAll().get();
  }
  //modification
  @PutMapping
  public ProduitEntity update(String ref, ProduitEntity produitEntity){
    return produitService.update(ref,produitEntity);
  }
  //suppression
  @DeleteMapping
  public void delete(String ref) {
    produitService.delete(ref);
  }



























  //
@GetMapping("/ref")
public Optional<ProduitEntity> get(String ref){
    return produitService.get(ref);
}

}

