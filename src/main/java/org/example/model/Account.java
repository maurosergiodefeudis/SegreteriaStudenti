package org.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
@SequenceGenerator(name = "ACCOUNTS_SEQUENCE",
        sequenceName = "ACCOUNTS_SEQUENCE_ID", allocationSize = 1)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOUNTS_SEQUENCE")
    @Getter
    @Setter
    private Integer Id;
    @Getter
    @Setter
    private String Nome;
    @Getter
    @Setter
    private String Cognome;
    @Getter
    @Setter
    private String DataDiNascita;
    @Getter
    @Setter
    private String CF;
    @Getter
    @Setter
    private String Matricola;
}
