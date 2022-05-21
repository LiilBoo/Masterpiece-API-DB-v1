package com.nandaparbat.SaasSportClubAPI.DTOs;

import com.nandaparbat.SaasSportClubAPI.Entities.Format;
import com.nandaparbat.SaasSportClubAPI.Entities.PairingStyle;

import javax.persistence.*;
import java.time.LocalDate;

public class TournamentView {


    private Long id;

    private String tournamentName;

    private boolean event;

    private LocalDate dateOfStart;

    private LocalDate dateOfEnd;

    private int numberOfRounds;

    private Format format;

    private PairingStyle pairingStyle;

    private String organisator;

    private String contact; //personalUrl or email

    private int capacity;

    private int firstPrice;

    private int secondPrice;

    private int thirdPrice;

    private int registerFeeSenior;

    private int registerFeeJunior;

    private String description;

};
