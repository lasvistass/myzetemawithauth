package com.netgroup.ZetemaTest.data.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

@Data
public class GiftcardDTO {

    private String emailFrom;

    private String emailTo;

    private Date createDate;

    private Date ExpiredDate;

    private Date UsedDate;

}
