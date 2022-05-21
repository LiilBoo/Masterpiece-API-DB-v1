package com.nandaparbat.SaasSportClubAPI.Controllers;


import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCreate;
import com.nandaparbat.SaasSportClubAPI.Entities.Tournament;
import com.nandaparbat.SaasSportClubAPI.Services.TournamentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tournaments")
@RequiredArgsConstructor
public class TournamentController {

    private final TournamentService tournamentService;

    //-- Post requests

    @PostMapping("/create-tour")
    @ResponseStatus(HttpStatus.CREATED)
    public void TournamentCreate(TournamentCreate inputs){
        tournamentService.tournamentCreate(inputs);
    };


    //-- Get requests

    // WORKS !
    @GetMapping("/events")
    @ResponseStatus(HttpStatus.OK)
    public List<Tournament> findAllByEventIsTrue(){
        return tournamentService.findAllByEventIsTrue();
    };

    // Parameter value [\] did not match expected type [com.nandaparbat.SaasSportClubAPI.Entities.Format (n/a)]
    @GetMapping("/by-format")
    @ResponseStatus(HttpStatus.OK)
    public List<Tournament> findAllByFormatIsContaining(@RequestParam("format") String formatName){
        return tournamentService.findAllByFormatIsContaining(formatName);
    };

    // Front-end problem
    @GetMapping("/by-name")
    @ResponseStatus(HttpStatus.OK)
    public List<Tournament> findAllByNameIsContaining(@RequestParam("tourname") String tourName){
        return tournamentService.findAllByNameIsContaining(tourName);
    };

    // Front-end problem
    @GetMapping("/by-contact-name")
    @ResponseStatus(HttpStatus.OK)
    public List<Tournament> findAllByContactContains(@RequestParam("contact") String contactString){
        return tournamentService.findAllByContactContains(contactString);
    };

    // WORKS !
    @GetMapping("/all-tournaments")
    @ResponseStatus(HttpStatus.OK)
    public List<Tournament> findAllProjectby(){
        return tournamentService.findAllProjectby();
    };

    @GetMapping("/by-id")
    @ResponseStatus(HttpStatus.OK)
    public Tournament findByID(@RequestParam("id") Long id){
        return  tournamentService.findById(id);
    };
};
