package sn.esmt.Produit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="produit")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitEntity {
  @Id
  @Column(name="reference",length =15)
  private String ref;
  @Column(name="nom",length = 150,nullable = false)
  private String nom;
  @Column(name="Quantite_stock")
  private  double qtStock;
}
