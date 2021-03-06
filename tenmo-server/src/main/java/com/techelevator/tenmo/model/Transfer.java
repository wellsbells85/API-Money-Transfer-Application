package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfer {

	private Long transferId;
	private String type;
	private String status;
	private String accountFromName;
	private String accountToName;
	private BigDecimal amount;
	
	public Long getTransferId() {
		return transferId;
	}

	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAccountFromName() {
		return accountFromName;
	}

	public void setAccountFromName(String accountFromName) {
		this.accountFromName = accountFromName;
	}

	public String getAccountToName() {
		return accountToName;
	}

	public void setAccountToName(String accountToName) {
		this.accountToName = accountToName;
	}
}
