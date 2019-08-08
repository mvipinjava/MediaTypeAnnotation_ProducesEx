package com.app;

public class TxInfo {
private  int txId;
private String code;
private double cost;
public TxInfo(int txId, String code, double cost) {
	super();
	this.txId = txId;
	this.code = code;
	this.cost = cost;
}
public TxInfo() {
	super();
}
public int getTxId() {
	return txId;
}
public void setTxId(int txId) {
	this.txId = txId;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "TxInfo [txId=" + txId + ", code=" + code + ", cost=" + cost + "]";
}

}
