package com.nandaparbat.SaasSportClubAPI.Controllers;

import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerCreate;
import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerSignIn;
import com.nandaparbat.SaasSportClubAPI.Services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.nandaparbat.SaasSportClubAPI.Security.Jwt;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/players")
@RequiredArgsConstructor
public class PlayerLogController {

    private final PlayerService playerService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody PlayerCreate inputs){
        playerService.create(inputs);
    };

    @PostMapping("/sign-in")
    @ResponseStatus(HttpStatus.OK)
    public Jwt signIn(@RequestBody PlayerSignIn inputs){
        System.out.println("We were here; CONTROLLER ENDPOINT REACHED");
        return playerService.signIn(inputs);
    };
};
