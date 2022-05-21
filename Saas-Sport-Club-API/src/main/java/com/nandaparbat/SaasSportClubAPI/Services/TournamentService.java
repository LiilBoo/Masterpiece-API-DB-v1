package com.nandaparbat.SaasSportClubAPI.Services;

import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCreate;
import com.nandaparbat.SaasSportClubAPI.Entities.Tournament;

import java.util.List;


public interface TournamentService {

    void tournamentCreate(TournamentCreate inputs);

    // - Get requests
    Tournament findById(Long id);


    List<Tournament> findAllByEventIsTrue();

    List<Tournament> findAllByFormatIsContaining(String formatName);

    List<Tournament> findAllByNameIsContaining(String formatName);

    List<Tournament> findAllByContactContains(String contactName);

    List<Tournament> findAllProjectby();

    //-- PATCH Requests



    //-- Delete requests
}
