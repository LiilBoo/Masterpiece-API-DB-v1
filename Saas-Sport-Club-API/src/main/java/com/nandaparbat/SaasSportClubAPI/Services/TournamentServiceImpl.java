package com.nandaparbat.SaasSportClubAPI.Services;

import com.nandaparbat.SaasSportClubAPI.DTOs.TournamentCreate;
import com.nandaparbat.SaasSportClubAPI.Entities.Tournament;
import com.nandaparbat.SaasSportClubAPI.Repositories.TournamentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TournamentServiceImpl implements TournamentService {

    private final TournamentRepository tournamentRepository;

    public Tournament TournamentSetting(TournamentCreate inputs){
        Tournament tournament = new Tournament();
        //-- tournament : tournament name
        tournament.setName(inputs.getTournamentName());
        //-- tournament : is_event
        tournament.setEvent(inputs.isEvent());
        //-- tournament : date of start
        tournament.setDateOfStart(inputs.getDateOfStart());
        //-- tournament : date of end
        tournament.setDateOfEnd(inputs.getDateOfEnd());
        //-- tournament : number of rounds
        tournament.setNumberOfRounds(inputs.getNumberOfRounds());
        //-- tournament : cadence format
        tournament.setFormat(inputs.getCadenceFormat());
        //-- tournamenet : pairing Style
        tournament.setPairingStyle(inputs.getPairing());
        //-- tournament : organisator
        tournament.setOrganisator(inputs.getOrganisator());
        //-- tournament : contact
        tournament.setContact(inputs.getContact());
        //-- tournament : capacity
        tournament.setCapacity(inputs.getCapacity());
        //-- tournament : first Price
        tournament.setFirstPrice(inputs.getFirstPrice());
        //-- tournament : second Price
        tournament.setSecondPrice(inputs.getSecondPrice());
        //-- tournamenent : thrid Price
        tournament.setThirdPrice(inputs.getThirdPrice());
        //-- tournament : register fee Junior
        tournament.setRegisterFeeJunior(inputs.getRegisterFeeJunior());
        //-- tournament : register fee Senior
        tournament.setRegisterFeeSenior(inputs.getRegisterFeeSenior());
        //- tournament : description
        tournament.setDescription(inputs.getDescription());

        return tournament;
    };

    @Override
    public void tournamentCreate(TournamentCreate inputs) {
        Tournament tournament = this.TournamentSetting(inputs);
        tournamentRepository.save(tournament);
    };


    @Override
    public Tournament findById(Long id) {
        return tournamentRepository.findById(id).get();
    }

    @Override
    public List<Tournament> findAllByEventIsTrue() {
        return tournamentRepository.findAllByEventIsTrue();
    }



    @Override
    public List<Tournament> findAllByFormatIsContaining(String formatName) {
        return tournamentRepository.findAllByFormatContains(formatName);
    };


    @Override
    public List<Tournament> findAllByNameIsContaining(String tournamentName){
        return tournamentRepository.findAllByNameIsContaining(tournamentName);
    };

    @Override
    public List<Tournament> findAllByContactContains(String contactName) {
        return tournamentRepository.findAllByContactContains(contactName);
    };

    @Override
    public List<Tournament> findAllProjectby() {
        return tournamentRepository.findAllProjectBy();
    };

};
