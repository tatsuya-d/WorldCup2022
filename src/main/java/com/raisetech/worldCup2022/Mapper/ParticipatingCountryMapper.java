package com.raisetech.worldCup2022.Mapper;

import com.raisetech.worldCup2022.Entity.ParticipatingCountry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ParticipatingCountryMapper {

    @Select("SELECT * FROM participatingCountry WHERE id = #{id}")
    List<ParticipatingCountry> findById(int id);

    @Select("SELECT * FROM participatingCountry WHERE continent = #{continent}")
    List<ParticipatingCountry> findByContinent(String continent);
}


