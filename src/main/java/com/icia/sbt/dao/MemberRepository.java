package com.icia.sbt.dao;

import com.icia.sbt.dto.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {

}
