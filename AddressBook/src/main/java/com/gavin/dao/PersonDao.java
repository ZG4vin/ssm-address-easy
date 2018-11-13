package com.gavin.dao;

import com.gavin.domain.Person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonDao {
    @Insert("insert into person(name,phone,address,invalid) values(#{name},#{phone},#{address},0)")
    void insertPerson(Person person);

    @Delete("update person set invalid=1 where id = #{id}")
    void deletePerson(int id);

    @Update("update person set name=#{name},phone=#{phone},address=#{address} where id=#{id}")
    void updatePerson(Person person);

    @Select("select * from person where id = #{id}")
    Person findPersonById(int id);

    @Select("select * from person where invalid=0")
    List<Person> findAllPerson();
}
