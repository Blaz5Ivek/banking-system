package com.example.demo.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name="USER")
public class user implements Serializable {
    @Id
    @Column(name="Email", nullable = false)
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
