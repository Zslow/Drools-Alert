package com.kloudsense.drools;


/**
 * This class was automatically generated by the data modeler tool.
 */

public class labels implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String severity;
    private java.lang.String instance;
    private java.lang.String alertname;
    private java.lang.String job;

    public labels() {
    }

    public java.lang.String getSeverity() {
        return this.severity;
    }

    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }

    public java.lang.String getInstance() {
        return this.instance;
    }

    public void setInstance(java.lang.String instance) {
        this.instance = instance;
    }

    public java.lang.String getAlertname() {
        return this.alertname;
    }

    public void setAlertname(java.lang.String alertname) {
        this.alertname = alertname;
    }

    public java.lang.String getJob() {
        return this.job;
    }

    public void setJob(java.lang.String job) {
        this.job = job;
    }

    public labels(java.lang.String severity, java.lang.String instance,
                  java.lang.String alertname, java.lang.String job) {
        this.severity = severity;
        this.instance = instance;
        this.alertname = alertname;
        this.job = job;
    }

}
