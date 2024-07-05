package com.icia.sbt.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="MJPA")
public class MemberEntity {
    @Id
    private String mId;

    @Column
    private String mPw;

    @Column
    private String mName;

    @Column
    private String mBirth;

    @Column
    private String mGender;

    @Column
    private String mEmail;

    @Column
    private String mPhone;


}
