package com.raisetech.worldCup2022;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ParticipatingCountryMapper {

    @Select("SELECT * FROM participating-country")
    List<ParticipatingCountry> findAll();

    @Select("SELECT * FROM participatingCountry WHERE continent = #{continent}")
    Optional<ParticipatingCountry> findByContinent(String continent);

}
