package com.daMyx.app.model;
import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "playlists")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "playlistName")
    private String playlistName;
    @Column(name = "audioID")
    private long audioName;
}