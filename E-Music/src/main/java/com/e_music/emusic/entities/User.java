package com.e_music.emusic.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table ( name = "USER" )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends Base {

    @Column ( name = "name")
    private String name;

    @Column ( name = "lastName")
    private String lastName;

    @Column ( name = "dni")
    private Integer dni;

    @Column ( name = "admin" )
    private boolean admin;

    @Column ( name = "active" )
    private boolean active = true;

    @ManyToOne ( fetch = FetchType.EAGER )
    @JoinColumn ( name = "fk_address", nullable = false )
    private Address address;

    @OneToOne ( mappedBy = "user" )
    private Cart cart;

}