package com.demo.demo2.dto;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RequestDTO {
    private String tokenKey;
    @NotBlank
    private String apiID;
    private String mobile;
    private String bankCode = "970445";
    private String accountNo;
    private String payDate;
    private String additionalData;
    private long debitAmount;
    private String respCode;
    private String respDesc;
    private String traceTransfer;
    private String messageType = "1";
    private String checkSum;
    @NotBlank
    private String orderCode;
    private String userName;
    private long realAmount;
    private String promotionCode;
    private final String addValue = "{\"payMethod\":\"01\",\"payMethodMMS\":1}";
    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public String getApiID() {
        return apiID;
    }

    public void setApiID(String apiID) {
        this.apiID = apiID;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(String additionalData) {
        this.additionalData = additionalData;
    }

    public long getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(long debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public String getTraceTransfer() {
        return traceTransfer;
    }

    public void setTraceTransfer(String traceTransfer) {
        this.traceTransfer = traceTransfer;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getCheckSum() {
        return checkSum;
    }

    public void setCheckSum(String checkSum) {
        this.checkSum = checkSum;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(long realAmount) {
        this.realAmount = realAmount;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getAddValue() {
        return addValue;
    }

    @Override
    public String toString() {
        return "RequestDTO{" +
                "tokenKey='" + tokenKey + '\'' +
                ", apiID='" + apiID + '\'' +
                ", mobile='" + mobile + '\'' +
                ", bankCode='" + bankCode + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", payDate='" + payDate + '\'' +
                ", additionalData='" + additionalData + '\'' +
                ", debitAmount=" + debitAmount +
                ", respCode='" + respCode + '\'' +
                ", respDesc='" + respDesc + '\'' +
                ", traceTransfer='" + traceTransfer + '\'' +
                ", messageType='" + messageType + '\'' +
                ", checkSum='" + checkSum + '\'' +
                ", orderCode='" + orderCode + '\'' +
                ", userName='" + userName + '\'' +
                ", realAmount=" + realAmount +
                ", promotionCode='" + promotionCode + '\'' +
                ", addValue='" + addValue + '\'' +
                '}';
    }
}
