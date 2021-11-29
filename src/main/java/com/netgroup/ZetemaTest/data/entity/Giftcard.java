package com.netgroup.ZetemaTest.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Giftcard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private String emailFrom;

    @Column
    private String emailTo;

    @Column
    private Date createDate;

    @Column
    private Date ExpiredDate;

    @Column
    private Date UsedDate;

}
