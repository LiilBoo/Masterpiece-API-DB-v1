package com.nandaparbat.SaasSportClubAPI.Services;

import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerCreate;
import com.nandaparbat.SaasSportClubAPI.DTOs.PlayerSignIn;
import com.nandaparbat.SaasSportClubAPI.Security.Jwt;

public interface PlayerService {

    void create(PlayerCreate inputs);

    Jwt signIn(PlayerSignIn inputs);



}
