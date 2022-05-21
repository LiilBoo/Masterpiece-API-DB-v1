package com.nandaparbat.SaasSportClubAPI.DTOs;

import com.nandaparbat.SaasSportClubAPI.Entities.Format;
import com.nandaparbat.SaasSportClubAPI.Entities.PairingStyle;

import java.time.LocalDate;

public interface TournamentViewDetails {

    public int getRegisterFeeJunior();

    public String getDescription();

    public Long getId();

    public String getTournamentName();

    public boolean isEvent();

    public LocalDate getDateOfStart();

    public LocalDate getDateOfEnd();

    public int getNumberOfRounds();

    public Format getFormat();

    public PairingStyle getPairingStyle();

    public String getOrganisator();

    public String getContact();

    public int getCapacity();

    public int getFirstPrice();

    public int getSecondPrice();

    public int getThirdPrice();

    public int getRegisterFeeSenior();
};
