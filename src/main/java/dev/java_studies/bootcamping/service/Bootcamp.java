package dev.java_studies.bootcamping.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Bootcamp {

    private String name;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private final Set<Activity> activities = new LinkedHashSet<>();

    private final Set<Dev> devs = new HashSet<>();

    public Bootcamp(String name, String description, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Bootcamp(String name, String description, LocalDate endDate) {
        this(name, description, LocalDate.now(), endDate);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Set<Activity> getActivities() {
        return activities;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public boolean subscribeDev(Dev dev) {
        boolean added = devs.add(dev);

        if(added) {
            dev.getSubscribedActivities().addAll(activities);
        }

        return added;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, activities);
    }

}
