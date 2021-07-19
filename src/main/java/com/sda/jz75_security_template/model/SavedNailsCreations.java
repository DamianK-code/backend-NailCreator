package com.sda.jz75_security_template.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SavedNailsCreations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Hand right;

    @OneToOne
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Hand left;

    @ManyToOne()
    @ToString.Exclude
    private Account account;
}
