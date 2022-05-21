package com.nandaparbat.SaasSportClubAPI.DTOs;

import com.nandaparbat.SaasSportClubAPI.Entities.Format;

public interface TournamentCardView {

    public Long getId();

    public String getTournamentName();

    public Format getFormat();

    public int getFirstPrice();

    public int getRegisterFeeSenior();

    public int getRegisterFeeJunior();
};
