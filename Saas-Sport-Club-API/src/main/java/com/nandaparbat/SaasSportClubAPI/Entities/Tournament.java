package com.nandaparbat.SaasSportClubAPI.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Table(name = "tournaments")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tournament_name")
    private String name;

    @Column(name = "is_event")
    private boolean event;

    @Column(name = "date_of_start")
    private LocalDate dateOfStart;

    @Column(name = "date_of_end")
    private LocalDate dateOfEnd;

    @Column(name = "number_of_rounds")
    private int numberOfRounds;

    @ManyToOne
    @JoinColumn(name = "format")
    private Format format;

    @ManyToOne
    @JoinColumn(name = "pairing_style")
    private PairingStyle pairingStyle;

    @Column(name = "organisator")
    private String organisator;

    @Column(name = "contact")
    private String contact; //personalUrl or email

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "first_price")
    private int firstPrice;

    @Column(name = "second_price")
    private int secondPrice;

    @Column(name = "third_price")
    private int thirdPrice;

    @Column(name = "register_fee_senior")
    private int registerFeeSenior;

    @Column(name = "register_fee_junior")
    private int registerFeeJunior;

    @Column(name = "description")
    private String description;

    public int getRegisterFeeJunior() {
        return registerFeeJunior;
    }

    public void setRegisterFeeJunior(int registerFeeJunior) {
        this.registerFeeJunior = registerFeeJunior;
    };

    public String getDescription() {
        return description;
    };

    public void setDescription(String description) {
        this.description = description;
    };

    public Long getId() {
        return id;
    };

    public String getName() {
        return name;
    };

    public void setName(String tournamentName) {
        this.name = tournamentName;
    };

    public boolean isEvent() {
        return event;
    };

    public void setEvent(boolean event) {
        this.event = event;
    };

    public LocalDate getDateOfStart() {
        return dateOfStart;
    };

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    };

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    };

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    };

    public int getNumberOfRounds() {
        return numberOfRounds;
    };

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    };

    public Format getFormat() {
        return format;
    };

    public void setFormat(Format format) {
        this.format = format;
    };

    public PairingStyle getPairingStyle() {
        return pairingStyle;
    };

    public void setPairingStyle(PairingStyle pairingStyle) {
        this.pairingStyle = pairingStyle;
    };

    public String getOrganisator() {
        return organisator;
    };

    public void setOrganisator(String organisator) {
        this.organisator = organisator;
    };

    public String getContact() {
        return contact;
    };

    public void setContact(String contact) {
        this.contact = contact;
    };

    public int getCapacity() {
        return capacity;
    };

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    };

    public int getFirstPrice() {
        return firstPrice;
    };

    public void setFirstPrice(int firstPrice) {
        this.firstPrice = firstPrice;
    };

    public int getSecondPrice() {
        return secondPrice;
    };

    public void setSecondPrice(int secondPrice) {
        this.secondPrice = secondPrice;
    };

    public int getThirdPrice() {
        return thirdPrice;
    };

    public void setThirdPrice(int thirdPrice) {
        this.thirdPrice = thirdPrice;
    };

    public int getRegisterFeeSenior() {
        return registerFeeSenior;
    };

    public void setRegisterFeeSenior(int registerFeeSenior) {
        this.registerFeeSenior = registerFeeSenior;
    };
};
