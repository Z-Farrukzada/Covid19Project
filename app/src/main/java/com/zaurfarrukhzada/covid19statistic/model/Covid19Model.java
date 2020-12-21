package com.zaurfarrukhzada.covid19statistic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Covid19Model {

    @SerializedName("get")
    @Expose
    private String get;
    @SerializedName("parameters")
    @Expose
    private List<Parameters> parameters;
    @SerializedName("errors")
    @Expose
    private List<Errors> errors;
    @SerializedName("results")
    @Expose
    private int results;
    @SerializedName("response")
    @Expose
    private List<Response> response;


    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
    }

    public List<Errors> getErrors() {
        return errors;
    }

    public void setErrors(List<Errors> errors) {
        this.errors = errors;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<Response> getResponse() {

        return response;
    }

    public void setResponse(List<Response> response) {
        this.response = response;
    }

}
