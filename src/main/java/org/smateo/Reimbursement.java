package org.smateo;

public class Reimbursement {
    private String name;
    private String course;
    private String limit;
    private String active;
    private String currency;

    public Reimbursement(String name, String course, String limit, String active, String currency) {
        this.name = name;
        this.course = course;
        this.limit = limit;
        this.active = active;
        this.currency = currency;
    }

    public void setReimbursement(String name, String course, String limit, String active, String currency){
        this.name = name;
        this.course = course;
        this.limit = limit;
        this.active = active;
        this.currency = currency;
    }
    public String getName() {
        return this.name;
    }

    public String getCourse() {
        return this.course;
    }

    public String getActive() {
        return active;
    }

    public String getCurrency() {
        return currency;
    }

    public String getLimit() {
        return limit;
    }
}
