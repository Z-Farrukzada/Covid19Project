package com.zaurfarrukhzada.covid19statistic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Deaths {

    @SerializedName("new")
    @Expose
    private String _new;
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
