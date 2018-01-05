package com.griddynamics.user.domain;

import lombok.Data;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Table
public class User {

    @PrimaryKey
    private UUID id;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    private String email;

    public User() {
        this.id = UUID.randomUUID();
    }

}
