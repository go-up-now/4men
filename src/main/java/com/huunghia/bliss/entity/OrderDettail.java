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
@Table(name = "Oder_Detail")
public class OrderDettail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int price;
    int discount;
    int num;

    @Column(name = "total_price")
    int totalPrice;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "oder_id")
    Order order;
}
