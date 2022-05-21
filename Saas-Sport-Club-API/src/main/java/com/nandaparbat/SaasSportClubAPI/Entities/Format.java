package com.nandaparbat.SaasSportClubAPI.Entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "formats")
public class Format {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "format_name")
    private String formatName;

    public Long getId() {
        return id;
    };

    public String getFormatName() {
        return formatName;
    };

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    };
};
