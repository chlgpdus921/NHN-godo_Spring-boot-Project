package com.example.mreview.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = "movie")
public class MovieImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long mno;
    private String uuid; //고유번호 생성

    private String imgName;
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    private Movie movie;



}
