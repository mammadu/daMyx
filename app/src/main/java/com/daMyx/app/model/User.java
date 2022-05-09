package com.daMyx.app.model;
import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "playlistID")
    private long playlistID;
}