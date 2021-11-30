package com.netgroup.ZetemaTest.data.dto;

import java.util.Date;

import lombok.Data;

@Data
public class GiftcardDTO {

	
    private String emailFrom;

    private String emailTo;

    private Date createDate;

    private Date ExpiredDate;

    private Date UsedDate;

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getExpiredDate() {
		return ExpiredDate;
	}

	public void setExpiredDate(Date expiredDate) {
		ExpiredDate = expiredDate;
	}

	public Date getUsedDate() {
		return UsedDate;
	}

	public void setUsedDate(Date usedDate) {
		UsedDate = usedDate;
	}
    

}
