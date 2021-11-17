package com.example.sample.repository;

import java.util.Optional;

import com.example.sample.entity.MemberEntity;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberMapper {

  @Select("select * from members where id = #{id}")
  Optional<MemberEntity> findById(@Param("id") String id);
}
