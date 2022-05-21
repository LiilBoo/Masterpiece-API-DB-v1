package com.nandaparbat.SaasSportClubAPI.DTOs;

import com.nandaparbat.SaasSportClubAPI.Entities.Format;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class TournamentViewCard {

    private Long id;

    public Long getId() {
        return id;
    };

    private String tournamentName;

    private Format format;

    private int firstPrice;

    private int registerFeeSenior;

    private int registerFeeJunior;

    public String getTournamentName() {
        return tournamentName;
    };

    public Format getFormat() {
        return format;
    };

    public int getFirstPrice() {
        return firstPrice;
    };

    public int getRegisterFeeSenior() {
        return registerFeeSenior;
    };

    public int getRegisterFeeJunior() {
        return registerFeeJunior;
    };
};
