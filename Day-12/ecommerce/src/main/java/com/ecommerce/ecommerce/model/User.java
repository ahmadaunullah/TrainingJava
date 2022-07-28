package com.ecommerce.ecommerce.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity (name = "User")
@Table (name = "tbl_user")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, unique = true)
    private Long id;

    @NotBlank
    @Column(name = "username", nullable = false, length = 255)
    private String username;

    @NotBlank
    @Column(name="phone", nullable = false, length = 12)
    private String phone;

    @NotBlank
    @Column(name="address", nullable = false, columnDefinition = "TEXT")
    private String address;

}
