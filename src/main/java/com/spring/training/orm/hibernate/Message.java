package com.spring.training.orm.hibernate;

import javax.persistence.*;

@Entity
@Table(name="message_tbl")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MessageSeq")
    @SequenceGenerator(name = "MessageSeq", sequenceName = "message_seq")
    @Column(name="message_id")
    int id;

    @Column(name = "message")
    String msg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                '}';
    }
}
