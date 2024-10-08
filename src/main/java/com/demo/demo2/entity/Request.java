package com.demo.demo2.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "token_key")
    private String tokenKey;
    @Column(name = "api_id")
    private String apiID;
    private String mobile;
    @Column(name = "bank_code")
    private String bankCode;
    @Column(name = "account_no")
    private String accountNo;
    @Column(name = "pay_date")
    private String payDate;
    @Column(name = "additional_date")
    private String additionalData;
    @Column(name = "debit_amount")
    private long debitAmount;
    @Column(name = "resp_code")
    private String respCode;
    @Column(name = "resp_desc")
    private String respDesc;
    @Column(name = "trace_transfer")
    private String traceTransfer;
    @Column(name = "message_type")
    private String messageType;
    @Column(name = "check_sum")
    private String checkSum;
    @Column(name = "order_code")
    private String orderCode;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "real_amount")
    private long realAmount;
    @Column(name = "promotion_code")
    private String promotionCode;
    @Column(name = "add_value")
    private String addValue;

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

    public void setAddValue(String addValue) {
        this.addValue = addValue;
    }

    @Override
    public String toString() {
        return "Request{" +
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

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return id == request.id && debitAmount == request.debitAmount && realAmount == request.realAmount && Objects.equals(tokenKey, request.tokenKey) && Objects.equals(apiID, request.apiID) && Objects.equals(mobile, request.mobile) && Objects.equals(bankCode, request.bankCode) && Objects.equals(accountNo, request.accountNo) && Objects.equals(payDate, request.payDate) && Objects.equals(additionalData, request.additionalData) && Objects.equals(respCode, request.respCode) && Objects.equals(respDesc, request.respDesc) && Objects.equals(traceTransfer, request.traceTransfer) && Objects.equals(messageType, request.messageType) && Objects.equals(checkSum, request.checkSum) && Objects.equals(orderCode, request.orderCode) && Objects.equals(userName, request.userName) && Objects.equals(promotionCode, request.promotionCode) && Objects.equals(addValue, request.addValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tokenKey, apiID, mobile, bankCode, accountNo, payDate, additionalData, debitAmount, respCode, respDesc, traceTransfer, messageType, checkSum, orderCode, userName, realAmount, promotionCode, addValue);
    }

    public Request(String tokenKey, String apiID) {
        this.tokenKey = tokenKey;
        this.apiID = apiID;
    }
    public Request(){

    }
}
