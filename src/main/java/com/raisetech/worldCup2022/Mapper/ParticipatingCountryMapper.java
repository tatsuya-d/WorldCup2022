package com.raisetech.worldCup2022.Mapper;

import com.raisetech.worldCup2022.Entity.ParticipatingCountry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface ParticipatingCountryMapper {

    @Select("SELECT * FROM participating-country")
    Optional<ParticipatingCountry> findAll(String continent);

    @Select("SELECT * FROM participating-country WHERE continent = #{continent}")
    ParticipatingCountry findByContinent(String continent);
}
