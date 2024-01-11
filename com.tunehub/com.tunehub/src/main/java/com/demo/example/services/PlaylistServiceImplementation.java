package com.demo.example.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.entities.Playlist;
import com.demo.example.entities.Song;
import com.demo.example.repositories.PlaylistRepository;
import com.demo.example.repositories.SongRepository;

@Service
public class PlaylistServiceImplementation implements PlaylistServices {
Song s;
@Autowired
PlaylistRepository prepo;
@Autowired
SongRepository repo;
@Override
public void addPlaylist(Playlist playlist) {
	prepo.save(playlist);
	
}
@Override
public List<Playlist> fetchAllPlaylist() {
	
	return prepo.findAll();
}
}
