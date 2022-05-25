package com.luv2code.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_category")
//@Data --Known bug
//Con Lombok se genera un error cuando es de uno a muchos o de muchos a muchos con el @Data
//Por lo tanto se hace el llamado a estos dos comandos secuencialmente

@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;



    //RELACIÒN CON PRDUCTO
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}
