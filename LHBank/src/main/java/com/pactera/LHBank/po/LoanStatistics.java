package com.pactera.LHBank.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LoanStatistics implements Serializable {
    private Long loanNo;

    private Short type;

    private BigDecimal amount;

    private Integer limitNum;

    private BigDecimal rate;

    private BigDecimal principle;

    private BigDecimal repaymentInterest;

    private Short status;

    private BigDecimal overdueRate;

    private BigDecimal overdueAmount;

    private String pernaltyRate;

    private BigDecimal pernaltyInterest;

    private Integer userCount;

    private Integer overdueCount;

    private String remark;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private Date statisticsDate;

    private static final long serialVersionUID = 1L;

    public Long getLoanNo() {
        return loanNo;
    }

    public void setLoanNo(Long loanNo) {
        this.loanNo = loanNo;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getLimitNum() {
        return limitNum;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getPrinciple() {
        return principle;
    }

    public void setPrinciple(BigDecimal principle) {
        this.principle = principle;
    }

    public BigDecimal getRepaymentInterest() {
        return repaymentInterest;
    }

    public void setRepaymentInterest(BigDecimal repaymentInterest) {
        this.repaymentInterest = repaymentInterest;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public BigDecimal getOverdueRate() {
        return overdueRate;
    }

    public void setOverdueRate(BigDecimal overdueRate) {
        this.overdueRate = overdueRate;
    }

    public BigDecimal getOverdueAmount() {
        return overdueAmount;
    }

    public void setOverdueAmount(BigDecimal overdueAmount) {
        this.overdueAmount = overdueAmount;
    }

    public String getPernaltyRate() {
        return pernaltyRate;
    }

    public void setPernaltyRate(String pernaltyRate) {
        this.pernaltyRate = pernaltyRate == null ? null : pernaltyRate.trim();
    }

    public BigDecimal getPernaltyInterest() {
        return pernaltyInterest;
    }

    public void setPernaltyInterest(BigDecimal pernaltyInterest) {
        this.pernaltyInterest = pernaltyInterest;
    }

    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    public Integer getOverdueCount() {
        return overdueCount;
    }

    public void setOverdueCount(Integer overdueCount) {
        this.overdueCount = overdueCount;
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

    public Date getStatisticsDate() {
        return statisticsDate;
    }

    public void setStatisticsDate(Date statisticsDate) {
        this.statisticsDate = statisticsDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loanNo=").append(loanNo);
        sb.append(", type=").append(type);
        sb.append(", amount=").append(amount);
        sb.append(", limitNum=").append(limitNum);
        sb.append(", rate=").append(rate);
        sb.append(", principle=").append(principle);
        sb.append(", repaymentInterest=").append(repaymentInterest);
        sb.append(", status=").append(status);
        sb.append(", overdueRate=").append(overdueRate);
        sb.append(", overdueAmount=").append(overdueAmount);
        sb.append(", pernaltyRate=").append(pernaltyRate);
        sb.append(", pernaltyInterest=").append(pernaltyInterest);
        sb.append(", userCount=").append(userCount);
        sb.append(", overdueCount=").append(overdueCount);
        sb.append(", remark=").append(remark);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdDate=").append(createdDate);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", statisticsDate=").append(statisticsDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}