package dev.java_studies.bootcamping.service;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev implements Experiential {

    private String name;

    private final Set<Activity> subscribedActivities = new LinkedHashSet<>();

    private final Set<Activity> completedActivities = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Activity> getSubscribedActivities() {
        return subscribedActivities;
    }

    public Set<Activity> getCompletedActivities() {
        return completedActivities;
    }

    public boolean subscribeTo(Bootcamp bootcamp) {
        return bootcamp.subscribeDev(this);
    }

    public void progress() {
        Optional<Activity> firstSubscribedActivity = subscribedActivities.stream().findFirst();

        if(firstSubscribedActivity.isPresent()) {
            subscribedActivities.remove(firstSubscribedActivity.get());
            completedActivities.add(firstSubscribedActivity.get());
        } else {
            System.err.println("Impossible to progress without activities subscribed!");
        }
    }

    public void printCompletedActivities() {
        System.out.println(completedActivities);
    }

    @Override
    public double calculateXp() {
        return completedActivities.stream()
                .mapToDouble(Activity::calculateXp)
                .sum();
    }

    @Override
    public String toString() {
        return name;
    }

}
