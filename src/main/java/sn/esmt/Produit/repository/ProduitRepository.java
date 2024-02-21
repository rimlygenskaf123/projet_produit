package sn.esmt.Produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import sn.esmt.Produit.entity.ProduitEntity;

import java.util.Optional;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity, String> {

  @Query("select p from ProduitEntity p where p.ref=:r and p.qtStock=:q ")
  public Optional<ProduitEntity>  findByReferenceAndQuantite_Stock(@Param("r") String ref, @Param("q") double qtStock);



}
