package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "schedule")
public class Schedule extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public Schedule(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public void update(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
}
