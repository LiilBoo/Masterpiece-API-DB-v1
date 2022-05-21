package com.nandaparbat.SaasSportClubAPI.DTOs;

import com.nandaparbat.SaasSportClubAPI.Entities.Format;
import com.nandaparbat.SaasSportClubAPI.Entities.PairingStyle;
import lombok.NoArgsConstructor;


import javax.validation.constraints.*;
import java.time.LocalDate;

@NoArgsConstructor
public class TournamentCreate {

    @NotBlank
    private String tournamentName;

    private boolean isEvent;

    @NotBlank
    private LocalDate dateOfStart;

    private LocalDate dateOfEnd;

    // TODO : works ?
    @Min(1)
    private int numberOfRounds;

    //TODO : Fix return type ?
    private Format format;

    // TODO : Fix return type ?
    private PairingStyle pairingStyle;

    private String organisator;

    private String contact; //personalUrl or email

    private Integer capacity;

    private Integer firstPrice;
    //TODO : postgreSQL does not autocomplete to BIGINT;

    private Integer secondPrice;

    private Integer thirdPrice;

    private Integer registerFeeSenior;

    private Integer registerFeeJunior;

    @NotBlank
    @Size(min=30, max=255)
    private String description;

    public String getTournamentName() {
        return tournamentName;
    };

    public boolean isEvent() {
        return isEvent;
    };

    public LocalDate getDateOfStart() {
        return dateOfStart;
    };

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    };

    public int getNumberOfRounds() {
        return numberOfRounds;
    };

    public Format getCadenceFormat() {
        return format;
    };

    public PairingStyle getPairing() {
        return pairingStyle;
    };

    public String getOrganisator() {
        return organisator;
    };

    public String getContact() {
        return contact;
    };

    public Integer getCapacity() {
        return capacity;
    };

    public Integer getFirstPrice() {
        return firstPrice;
    };

    public Integer getSecondPrice() {
        return secondPrice;
    };

    public Integer getThirdPrice() {
        return thirdPrice;
    };

    public Integer getRegisterFeeSenior() {
        return registerFeeSenior;
    };

    public Integer getRegisterFeeJunior() {
        return registerFeeJunior;
    };

    public String getDescription() {
        return description;
    };

};
