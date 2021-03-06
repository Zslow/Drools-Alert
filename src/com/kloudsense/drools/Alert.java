package com.kloudsense.drools;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Alert implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String generatorURL;
    private com.kloudsense.drools.annotations annotations;
    private java.lang.String startsAt;
    private java.lang.String endsAt;
    private com.kloudsense.drools.labels labels;

    public Alert() {
    }

    public java.lang.String getGeneratorURL() {
        return this.generatorURL;
    }

    public void setGeneratorURL(java.lang.String generatorURL) {
        this.generatorURL = generatorURL;
    }

    public com.kloudsense.drools.annotations getAnnotations() {
        return this.annotations;
    }

    public void setAnnotations(com.kloudsense.drools.annotations annotations) {
        this.annotations = annotations;
    }

    public java.lang.String getStartsAt() {
        return this.startsAt;
    }

    public void setStartsAt(java.lang.String startsAt) {
        this.startsAt = startsAt;
    }

    public java.lang.String getEndsAt() {
        return this.endsAt;
    }

    public void setEndsAt(java.lang.String endsAt) {
        this.endsAt = endsAt;
    }

    public com.kloudsense.drools.labels getLabels() {
        return this.labels;
    }

    public void setLabels(com.kloudsense.drools.labels labels) {
        this.labels = labels;
    }

    public Alert(java.lang.String generatorURL,
                 com.kloudsense.drools.annotations annotations,
                 java.lang.String startsAt, java.lang.String endsAt,
                 com.kloudsense.drools.labels labels) {
        this.generatorURL = generatorURL;
        this.annotations = annotations;
        this.startsAt = startsAt;
        this.endsAt = endsAt;
        this.labels = labels;
    }

}