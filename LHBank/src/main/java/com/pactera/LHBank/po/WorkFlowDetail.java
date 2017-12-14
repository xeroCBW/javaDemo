package com.pactera.LHBank.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WorkFlowDetail implements Serializable {
    private Long flowNo1;

    private String account;

    private Long orderNo;

    private Short transactionType;

    private Date transactionDate;

    private Short detailType;

    private BigDecimal amount;

    private BigDecimal principle;

    private BigDecimal repayRate;

    private BigDecimal pernaltyAmount;

    private BigDecimal pernaltyInterest;

    private String identifyNo;

    private Short gender;

    private String name;

    private Short age;

    private String city;

    private String province;

    private String remark;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private static final long serialVersionUID = 1L;

    public Long getFlowNo1() {
        return flowNo1;
    }

    public void setFlowNo1(Long flowNo1) {
        this.flowNo1 = flowNo1;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Short getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(Short transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Short getDetailType() {
        return detailType;
    }

    public void setDetailType(Short detailType) {
        this.detailType = detailType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrinciple() {
        return principle;
    }

    public void setPrinciple(BigDecimal principle) {
        this.principle = principle;
    }

    public BigDecimal getRepayRate() {
        return repayRate;
    }

    public void setRepayRate(BigDecimal repayRate) {
        this.repayRate = repayRate;
    }

    public BigDecimal getPernaltyAmount() {
        return pernaltyAmount;
    }

    public void setPernaltyAmount(BigDecimal pernaltyAmount) {
        this.pernaltyAmount = pernaltyAmount;
    }

    public BigDecimal getPernaltyInterest() {
        return pernaltyInterest;
    }

    public void setPernaltyInterest(BigDecimal pernaltyInterest) {
        this.pernaltyInterest = pernaltyInterest;
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo == null ? null : identifyNo.trim();
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", flowNo1=").append(flowNo1);
        sb.append(", account=").append(account);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", transactionType=").append(transactionType);
        sb.append(", transactionDate=").append(transactionDate);
        sb.append(", detailType=").append(detailType);
        sb.append(", amount=").append(amount);
        sb.append(", principle=").append(principle);
        sb.append(", repayRate=").append(repayRate);
        sb.append(", pernaltyAmount=").append(pernaltyAmount);
        sb.append(", pernaltyInterest=").append(pernaltyInterest);
        sb.append(", identifyNo=").append(identifyNo);
        sb.append(", gender=").append(gender);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", city=").append(city);
        sb.append(", province=").append(province);
        sb.append(", remark=").append(remark);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}