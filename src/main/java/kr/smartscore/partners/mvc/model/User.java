package kr.smartscore.partners.mvc.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(catalog = "webflux_db", name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}