package com.raisetech.worldcup2022;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ParticipatingCountryMapper {

    @Select("SELECT * FROM participatingCountry")
    List<ParticipatingCountry> findAll();

    @Select("SELECT * FROM participatingCountry WHERE id = #{id}")
    Optional<ParticipatingCountry> findById(int id);

}
