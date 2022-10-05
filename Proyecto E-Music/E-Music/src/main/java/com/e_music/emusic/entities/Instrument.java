package com.e_music.emusic.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table ( name = "INSTRUMENT" )
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class Instrument extends Base {

    String name;
    Double price;
    Integer stock;
    String pathImage;
    String description;

    @ManyToOne
    Cart cart;

    @ManyToOne
    Brand brand;

    @OneToMany
    Category category;

}