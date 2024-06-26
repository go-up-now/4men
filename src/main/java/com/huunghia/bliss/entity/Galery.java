package com.huunghia.bliss.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Galery")
public class Galery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String thumbnail;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
}
