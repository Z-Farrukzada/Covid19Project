package com.zaurfarrukhzada.covid19statistic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cases {

    @SerializedName("new")
    @Expose
    private String _new;
    @SerializedName("active")
    @Expose
    private int active;
    @SerializedName("critical")
    @Expose
    private int critical;
    @SerializedName("recovered")
    @Expose
    private int recovered;
    @SerializedName("1M_pop")
    @Expose
    private String _1MPop;
    @SerializedName("total")
    @Expose
    private int total;


    public String getNew() {
        return _new;
    }

    public void setNew(String _new) {
        this._new = _new;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public String get1MPop() {
        return _1MPop;
    }

    public void set1MPop(String _1MPop) {
        this._1MPop = _1MPop;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
