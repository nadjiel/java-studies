package dev.java_studies.bootcamping.service;

import java.util.Objects;

public abstract class Activity implements Experiential {

    private String name;

    private String description;

    private double xp;

    public Activity(String name, String description, double xp) {
        this.name = name;
        this.description = description;
        this.xp = xp;
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

    public void setXp(double xp) {
        this.xp = xp;
    }

    public double getXp() {
        return xp;
    }

    @Override
    public double calculateXp() {
        return getXp();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Activity activity = (Activity) o;
        return Double.compare(xp, activity.xp) == 0 && Objects.equals(name, activity.name) && Objects.equals(description, activity.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, xp);
    }

    @Override
    public String toString() {
        return String.format("%s(%.0f)", name, xp);
    }

}
