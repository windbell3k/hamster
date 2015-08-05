package org.windbell.lab.hamster.validate.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("request")
public class SingleMessage {
	private static final String IS_NULL = "is null";

	@NotNull(message="bizNo "+IS_NULL)
	@XStreamAlias(value = "bizNo")
	private String bizNo;
	
	@NotNull(message="serviceId "+IS_NULL)
	@Size(min=6,max=6,message="serviceId length must 6")
	@XStreamAlias(value = "serviceId")
	private String serviceId;
	
	@XStreamAlias(value = "txnType")
	private String txnType;
	
	@NotNull(message="bizType "+IS_NULL)
	@XStreamAlias(value = "bizType")
	private String bizType;
	
	@NotNull(message="tradeDate "+IS_NULL)
	@XStreamAlias(value = "tradeDate")
	private String tradeDate;
	
	@XStreamAlias(value = "tradeTiem")
	private String tradeTime;
	
	@NotNull(message="amount "+IS_NULL)
	@Pattern(regexp = "[0-9]{1,13}.[0-9]{2}",message="amount value error")
	@XStreamAlias(value = "amount")
	private String amount;
	
	@NotNull(message="currency "+IS_NULL)
	@XStreamAlias(value = "currency")
	private String currency;
	
	@NotNull(message="chanId "+IS_NULL)
	@XStreamAlias(value = "chanId")
	private String chanId;
	
	@NotNull(message="merchId "+IS_NULL)
	@XStreamAlias(value = "merchId")
	private String merchId;
	
	@NotNull(message="dbtrBankId "+IS_NULL)
	@XStreamAlias(value = "dbtrBankId")
	private String dbtrBankId;
	
	@NotNull(message="dbtrBankName "+IS_NULL)
	@XStreamAlias(value = "dbtrBankName")
	private String dbtrBankName;
	
	@NotNull(message="dbtrBankCode "+IS_NULL)
	@XStreamAlias(value = "dbtrBankCode")
	private String dbtrBankCode;
	
	@NotNull(message="dbtrBankAddr "+IS_NULL)
	@XStreamAlias(value = "dbtrBankAddr")
	private String dbtrBankAddr;
	
	@XStreamAlias(value = "dbtrAcctFlag")
	private String dbtrAcctFlag;
	
	@NotNull(message="dbtrAcctNo "+IS_NULL)
	@XStreamAlias(value = "dbtrAcctNo")
	private String dbtrAcctNo;
	
	@NotNull(message="dbtrAcctName "+IS_NULL)
	@XStreamAlias(value = "dbtrAcctName")
	private String dbtrAcctName;
	
	@XStreamAlias(value = "dbtrCity")
	private String dbtrCity;
	
	@NotNull(message="dbtrAcctType "+IS_NULL)
	@Pattern(regexp = "^[O|P]{1}$",message="dbtrAcctType value is error")
	@XStreamAlias(value = "dbtrAcctType")
	private String dbtrAcctType;
	
	@XStreamAlias(value = "dbtrIDType")
	private String dbtrIDType;
	
	@XStreamAlias(value = "dbtrIDCode")
	private String dbtrIDCode;
	
	@XStreamAlias(value = "dbtrPhone")
	private String dbtrPhone;
	
	@NotNull(message="cdtrBankName "+IS_NULL)
	@XStreamAlias(value = "cdtrBankName")
	private String cdtrBankName;
	
	@NotNull(message="cdtrBankAddr "+IS_NULL)
	@XStreamAlias(value = "cdtrBankAddr")
	private String cdtrBankAddr;
	
	@NotNull(message="cdtrBankId "+IS_NULL)
	@XStreamAlias(value = "cdtrBankId")
	private String cdtrBankId;
	
	@NotNull(message="cdtrBankCode "+IS_NULL)
	@XStreamAlias(value = "cdtrBankCode")
	private String cdtrBankCode;
	
	@NotNull(message="cdtrAcctFlag "+IS_NULL)
	@XStreamAlias(value = "cdtrAcctFlag")
	private String cdtrAcctFlag;
	
	@NotNull(message="cdtrAcctName "+IS_NULL)
	@XStreamAlias(value = "cdtrAcctName")
	private String cdtrAcctName;
	
	@NotNull(message="cdtrAcctType "+IS_NULL)
	@Pattern(regexp = "^[O|P]{1}$",message="cdtrAcctType value is error")
	@XStreamAlias(value = "cdtrAcctType")
	private String cdtrAcctType;
	
	@NotNull(message="cdtrAcctNo "+IS_NULL)
	@XStreamAlias(value = "cdtrAcctNo")
	private String cdtrAcctNo;
	
	@NotNull(message="cdtrIDType "+IS_NULL)
	@XStreamAlias(value = "cdtrIDType")
	private String cdtrIDType;
	
	@XStreamAlias(value = "cdtrIDCode")
	private String cdtrIDCode;
	
	@XStreamAlias(value = "cdtrPhone")
	private String cdtrPhone;
	
	@XStreamAlias(value = "cdtrProv")
	private String cdtrProv;
	
	@XStreamAlias(value = "cdtrCity")
	private String cdtrCity;
	
	@XStreamAlias(value = "remark")
	private String remark;
	
	@NotNull(message="cdtrAcctNo "+IS_NULL)
	@XStreamAlias(value = "purpose")
	private String purpose;
	
	@XStreamAlias(value = "preDateFlag")
	private String preDateFlag;
	
	@XStreamAlias(value = "preDateTime")
	private String preDateTime;
	
	@NotNull(message="localCityFlag "+IS_NULL)
	@XStreamAlias(value = "localCityFlag")
	private String localCityFlag;
	
	@NotNull(message="interBankFlag "+""+IS_NULL)
	@XStreamAlias(value = "interBankFlag")
	private String interBankFlag;
	
	@NotNull(message="priority "+""+IS_NULL)
	@XStreamAlias(value = "priority")
	private String priority;
	
	@XStreamAlias(value = "cdtrValFlag")
	private String cdtrValFlag;
	
	@XStreamAlias(value = "feeAccount")
	private String feeAccount;
	
	@XStreamAlias(value = "payType")
	private String payType;
	
	@XStreamAlias(value = "employeeNo")
	private String employeeNo;
	
	public SingleMessage() {
		super();
	}
	
	public String getBizNo() {
		return bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getBizType() {
		return bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradeTiem() {
		return tradeTime;
	}
	public void setTradeTiem(String tradeTiem) {
		this.tradeTime = tradeTiem;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getChanId() {
		return chanId;
	}
	public void setChanId(String chanId) {
		this.chanId = chanId;
	}
	public String getMerchId() {
		return merchId;
	}
	public void setMerchId(String merchId) {
		this.merchId = merchId;
	}
	public String getDatrBankId() {
		return dbtrBankId;
	}
	public void setDatrBankId(String datrBankId) {
		this.dbtrBankId = datrBankId;
	}
	public String getDbtrBankName() {
		return dbtrBankName;
	}
	public void setDbtrBankName(String dbtrBankName) {
		this.dbtrBankName = dbtrBankName;
	}
	public String getDbtrBankCode() {
		return dbtrBankCode;
	}
	public void setDbtrBankCode(String dbtrBankCode) {
		this.dbtrBankCode = dbtrBankCode;
	}
	public String getDbtrBankAddr() {
		return dbtrBankAddr;
	}
	public void setDbtrBankAddr(String dbtrBankAddr) {
		this.dbtrBankAddr = dbtrBankAddr;
	}
	public String getDbtrAcctFlag() {
		return dbtrAcctFlag;
	}
	public void setDbtrAcctFlag(String dbtrAcctFlag) {
		this.dbtrAcctFlag = dbtrAcctFlag;
	}
	public String getDbtrAcctNo() {
		return dbtrAcctNo;
	}
	public void setDbtrAcctNo(String dbtrAcctNo) {
		this.dbtrAcctNo = dbtrAcctNo;
	}
	public String getDbtrAcctName() {
		return dbtrAcctName;
	}
	public void setDbtrAcctName(String dbtrAcctName) {
		this.dbtrAcctName = dbtrAcctName;
	}
	public String getDbtrCity() {
		return dbtrCity;
	}
	public void setDbtrCity(String dbtrCity) {
		this.dbtrCity = dbtrCity;
	}
	public String getDbtrAcctType() {
		return dbtrAcctType;
	}
	public void setDbtrAcctType(String dbtrAcctType) {
		this.dbtrAcctType = dbtrAcctType;
	}
	public String getDbtrIDType() {
		return dbtrIDType;
	}
	public void setDbtrIDType(String dbtrIDType) {
		this.dbtrIDType = dbtrIDType;
	}
	public String getDbtrIDCode() {
		return dbtrIDCode;
	}
	public void setDbtrIDCode(String dbtrIDCode) {
		this.dbtrIDCode = dbtrIDCode;
	}
	public String getDbtrPhone() {
		return dbtrPhone;
	}
	public void setDbtrPhone(String dbtrPhone) {
		this.dbtrPhone = dbtrPhone;
	}
	public String getCdtrBankName() {
		return cdtrBankName;
	}
	public void setCdtrBankName(String cdtrBankName) {
		this.cdtrBankName = cdtrBankName;
	}
	public String getCdtrBankAddr() {
		return cdtrBankAddr;
	}
	public void setCdtrBankAddr(String cdtrBankAddr) {
		this.cdtrBankAddr = cdtrBankAddr;
	}
	public String getCdtrBankId() {
		return cdtrBankId;
	}
	public void setCdtrBankId(String cdtrBankId) {
		this.cdtrBankId = cdtrBankId;
	}
	public String getCdtrBankCode() {
		return cdtrBankCode;
	}
	public void setCdtrBankCode(String cdtrBankCode) {
		this.cdtrBankCode = cdtrBankCode;
	}
	public String getCdtrAcctFlag() {
		return cdtrAcctFlag;
	}
	public void setCdtrAcctFlag(String cdtrAcctFlag) {
		this.cdtrAcctFlag = cdtrAcctFlag;
	}
	public String getCdtrAcctName() {
		return cdtrAcctName;
	}
	public void setCdtrAcctName(String cdtrAcctName) {
		this.cdtrAcctName = cdtrAcctName;
	}
	public String getCdtrAcctType() {
		return cdtrAcctType;
	}
	public void setCdtrAcctType(String cdtrAcctType) {
		this.cdtrAcctType = cdtrAcctType;
	}
	public String getCdtrIDType() {
		return cdtrIDType;
	}
	public void setCdtrIDType(String cdtrIDType) {
		this.cdtrIDType = cdtrIDType;
	}
	public String getCdtrIDCode() {
		return cdtrIDCode;
	}
	public void setCdtrIDCode(String cdtrIDCode) {
		this.cdtrIDCode = cdtrIDCode;
	}
	public String getCdtrPhone() {
		return cdtrPhone;
	}
	public void setCdtrPhone(String cdtrPhone) {
		this.cdtrPhone = cdtrPhone;
	}
	public String getCdtrProv() {
		return cdtrProv;
	}
	public void setCdtrProv(String cdtrProv) {
		this.cdtrProv = cdtrProv;
	}
	public String getCdtrCity() {
		return cdtrCity;
	}
	public void setCdtrCity(String cdtrCity) {
		this.cdtrCity = cdtrCity;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getPreDateFlag() {
		return preDateFlag;
	}
	public void setPreDateFlag(String preDateFlag) {
		this.preDateFlag = preDateFlag;
	}
	public String getPreDateTime() {
		return preDateTime;
	}
	public void setPreDateTime(String preDateTime) {
		this.preDateTime = preDateTime;
	}
	public String getLocalCityFlag() {
		return localCityFlag;
	}
	public void setLocalCityFlag(String localCityFlag) {
		this.localCityFlag = localCityFlag;
	}
	public String getInterBankFlag() {
		return interBankFlag;
	}
	public void setInterBankFlag(String interBankFlag) {
		this.interBankFlag = interBankFlag;
	}
	public String getPriorty() {
		return priority;
	}
	public void setPriorty(String priorty) {
		this.priority = priorty;
	}
	public String getCdtrValFlag() {
		return cdtrValFlag;
	}
	public void setCdtrValFlag(String cdtrValFlag) {
		this.cdtrValFlag = cdtrValFlag;
	}
	public String getFeeAccount() {
		return feeAccount;
	}
	public void setFeeAccount(String feeAccount) {
		this.feeAccount = feeAccount;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	
}
