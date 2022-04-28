package com.postgres.crypt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ColumnTransformer(
            read =  "convert_from(encode(decrypt(password, current_setting('private.key')::bytea, 'aes'::text),'escape')::bytea, 'UTF-8')",
            write = "encrypt(?::bytea, current_setting('private.key')::bytea, 'aes'::text)"
    )
    @Column(columnDefinition = "bytea")
    private String password;
}
