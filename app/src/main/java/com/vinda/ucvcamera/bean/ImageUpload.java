package com.vinda.ucvcamera.bean;

import android.graphics.Bitmap;

public class ImageUpload {

    String localTxnSeq = "";
    String txnAttr = "";
    String posId = "";
    Bitmap imageData = null;
    String txnamt = "";
    String txnDate = "";
    String txnTime = "";

    public String getLocalTxnSeq() {
        return localTxnSeq;
    }

    public void setLocalTxnSeq(String localTxnSeq) {
        this.localTxnSeq = localTxnSeq;
    }

    public String getTxnAttr() {
        return txnAttr;
    }

    public void setTxnAttr(String txnAttr) {
        this.txnAttr = txnAttr;
    }

    public String getPosId() {
        return posId;
    }

    public void setPosId(String posId) {
        this.posId = posId;
    }

    public Bitmap getImageData() {
        return imageData;
    }

    public void setImageData(Bitmap imageData) {
        this.imageData = imageData;
    }

    public String getTxnamt() {
        return txnamt;
    }

    public void setTxnamt(String txnamt) {
        this.txnamt = txnamt;
    }

    public String getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(String txnDate) {
        this.txnDate = txnDate;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public ImageUpload(String localTxnSeq, String txnAttr, String posId, Bitmap imageData, String txnamt, String txnDate, String txnTime) {
        this.localTxnSeq = localTxnSeq;
        this.txnAttr = txnAttr;
        this.posId = posId;
        this.imageData = imageData;
        this.txnamt = txnamt;
        this.txnDate = txnDate;
        this.txnTime = txnTime;
    }

    @Override
    public String toString() {
        return "ImageUpload{" +
                "localTxnSeq='" + localTxnSeq + '\'' +
                ", txnAttr='" + txnAttr + '\'' +
                ", posId='" + posId + '\'' +
                ", imageData=" + imageData +
                ", txnamt='" + txnamt + '\'' +
                ", txnDate='" + txnDate + '\'' +
                ", txnTime='" + txnTime + '\'' +
                '}';
    }
}
