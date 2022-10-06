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
public class Instrument extends Base {

    @Column ( name = "name" )
    String name;

    @Column ( name = "price" )
    Double price;

    @Column ( name = "stock" )
    Integer stock;

    @Column ( name = "pathImage" )
    String pathImage;
    
    @Column ( name = "description" )
    String description;

    @ManyToOne ( fetch = FetchType.EAGER )
    @JoinColumn ( name = "fk_cart", nullable = false )
    Cart cart;

    @ManyToOne ( fetch = FetchType.EAGER )
    @JoinColumn ( name = "fk_brand", nullable = false )
    Brand brand;

//    @OneToMany (mappedBy = "instrument")
//    Category category;

}