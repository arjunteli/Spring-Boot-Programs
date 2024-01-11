package com.demo.example.services;

import java.util.List;

import com.demo.example.entities.Playlist;

public interface PlaylistServices {

	void addPlaylist(Playlist playlist);

	List<Playlist> fetchAllPlaylist();

}
