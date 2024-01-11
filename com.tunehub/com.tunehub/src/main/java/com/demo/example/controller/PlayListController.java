package com.demo.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.example.entities.Playlist;
import com.demo.example.entities.Song;
import com.demo.example.services.PlaylistServices;
import com.demo.example.services.SongService;

@Controller
public class PlayListController {
	@Autowired
	SongService songservice;
	@Autowired
	PlaylistServices playlistservice;
 	@GetMapping("/createPlaylist")
	public String createPlaylist(Model model) {
               List<Song>songList=songservice.fetchAllSongs();
		model.addAttribute("songs", songList);
		return "createPlaylist";
	}
 	@GetMapping("/viewPlaylist")
	public String viewSongs(Model model) {
		List<Playlist>allplaylists=playlistservice.fetchAllPlaylist();
		model.addAttribute("allplaylists", allplaylists);
		return "displayPlaylist";
	}
 	@PostMapping("/addPlaylist")
 	public String addPlaylist(@ModelAttribute Playlist playlist) {
 		playlistservice.addPlaylist(playlist);
 		List<Song>songlist=playlist.getSongs();
 		for(Song s:songlist) {
 			s.getPlaylists().add(playlist);
 			//update song object
 			songservice.updateSong(s);
 		}
 		
 		return "adminHome";
 	}
}
