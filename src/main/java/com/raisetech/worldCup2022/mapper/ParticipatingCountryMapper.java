package com.raisetech.worldCup2022.mapper;

import com.raisetech.worldCup2022.entity.ParticipatingCountry;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ParticipatingCountryMapper {

    @Select("SELECT * FROM participatingCountry WHERE id = #{id}")
    List<ParticipatingCountry> findById(int id);

    @Select("SELECT * FROM participatingCountry WHERE continent = #{continent}")
    List<ParticipatingCountry> findByContinent(String continent);

    @Insert("INSERT INTO participatingCountry (id,name,continent) VALUES (#{id},#{name},#{continent})")
    void createParticipatingCountry(ParticipatingCountry createParticipatingCountry);

    @Update("UPDATE participatingCountry SET name = #{name},continent = #{continent} WHERE id = #{id}")
    void updateParticipatingCountry(int id, String name, String continent);

    @Delete("DELETE FROM participatingCountry WHERE id = #{id}")
    void deleteParticipatingCountry(int id, String name, String continent);
}
