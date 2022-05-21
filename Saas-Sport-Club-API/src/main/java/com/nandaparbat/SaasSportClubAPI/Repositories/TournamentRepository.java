package com.nandaparbat.SaasSportClubAPI.Repositories;


import com.nandaparbat.SaasSportClubAPI.Entities.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {


    // OK
    List<Tournament> findAllByEventIsTrue();

    //Method to filter the list by the format name;
    // OK
    List<Tournament> findAllByFormatContains(String formatName);

    // OK
    List<Tournament> findAllByNameIsContaining(String tournamentName);

    // OK
    List<Tournament> findAllProjectBy();

    //Given parameter = ?1 ;
//    @Query("SELECT t FROM tournaments t WHERE t.contact = ?1")
    List<Tournament> findAllByContactContains(String contactName);


//    <Type> List<Type> findAllProjectedBy(Class<Type> type);
}
