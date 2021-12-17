package com.marinic;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Asterank implements Serializable
{

    @SerializedName("rms")
    @Expose
    private Double rms;
    @SerializedName("epoch")
    @Expose
    private String epoch;
    @SerializedName("readable_des")
    @Expose
    private String readableDes;
    @SerializedName("H")
    @Expose
    private Double h;
    @SerializedName("num_obs")
    @Expose
    private Integer numObs;
    @SerializedName("ref")
    @Expose
    private String ref;
    @SerializedName("G")
    @Expose
    private Double g;
    @SerializedName("last_obs")
    @Expose
    private String lastObs;
    @SerializedName("comp")
    @Expose
    private String comp;
    @SerializedName("M")
    @Expose
    private Double m;
    @SerializedName("U")
    @Expose
    private String u;
    @SerializedName("e")
    @Expose
    private Double e;
    @SerializedName("a")
    @Expose
    private Double a;
    @SerializedName("om")
    @Expose
    private Double om;
    @SerializedName("pert_p")
    @Expose
    private String pertP;
    @SerializedName("d")
    @Expose
    private Double d;
    @SerializedName("i")
    @Expose
    private Double i;
    @SerializedName("des")
    @Expose
    private String des;
    @SerializedName("flags")
    @Expose
    private String flags;
    @SerializedName("num_opp")
    @Expose
    private Integer numOpp;
    @SerializedName("w")
    @Expose
    private Double w;
    @SerializedName("pert_c")
    @Expose
    private String pertC;
    private final static long serialVersionUID = 5154301947279984973L;

    public Double getRms() {
        return rms;
    }

    public void setRms(Double rms) {
        this.rms = rms;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getReadableDes() {
        return readableDes;
    }

    public void setReadableDes(String readableDes) {
        this.readableDes = readableDes;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Integer getNumObs() {
        return numObs;
    }

    public void setNumObs(Integer numObs) {
        this.numObs = numObs;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Double getG() {
        return g;
    }

    public void setG(Double g) {
        this.g = g;
    }

    public String getLastObs() {
        return lastObs;
    }

    public void setLastObs(String lastObs) {
        this.lastObs = lastObs;
    }

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public Double getM() {
        return m;
    }

    public void setM(Double m) {
        this.m = m;
    }

    public String getU() {
        return u;
    }

    public void setU(String u) {
        this.u = u;
    }

    public Double getE() {
        return e;
    }

    public void setE(Double e) {
        this.e = e;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getOm() {
        return om;
    }

    public void setOm(Double om) {
        this.om = om;
    }

    public String getPertP() {
        return pertP;
    }

    public void setPertP(String pertP) {
        this.pertP = pertP;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getI() {
        return i;
    }

    public void setI(Double i) {
        this.i = i;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public Integer getNumOpp() {
        return numOpp;
    }

    public void setNumOpp(Integer numOpp) {
        this.numOpp = numOpp;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    public String getPertC() {
        return pertC;
    }

    public void setPertC(String pertC) {
        this.pertC = pertC;
    }

}