package com.woowangjwawang.toyProject.member.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberId;
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    @Embedded
    private String address;
    private String role;
}
