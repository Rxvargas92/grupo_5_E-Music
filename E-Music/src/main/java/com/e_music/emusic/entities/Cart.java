package com.e_music.emusic.entities;

import lombok.*;
import com.e_music.emusic.entities.User;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table ( name = "CART" )
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cart extends Base {

    String paymentMethod;


    Double totalPrice;

    @OneToOne()
    User user;


    List<Instrument> instruments;

}