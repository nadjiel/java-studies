package dev.java_studies.bootcamping.service;

import java.time.LocalDate;

public class Mentoring extends Activity {

    private LocalDate date;

    public Mentoring(String name, String description, LocalDate date, double xp) {
        super(name, description, xp);
        this.date = date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

}
