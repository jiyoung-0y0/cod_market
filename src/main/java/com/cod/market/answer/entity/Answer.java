package com.cod.market.answer.entity;

import com.cod.market.base.BaseEntity;
import com.cod.market.member.entity.Member;
import com.cod.market.question.entity.Question;
import jakarta.persistence.Entity;

@Entity
public class Answer extends BaseEntity {

    private String comment;
    private Member member;
    private Question question;
}
