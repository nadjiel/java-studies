package dev.java_studies.bootcamping.service;

public class Course extends Activity {

    private int workload;

    public Course(String name, String description, int workload, double xp) {
        super(name, description, xp);
        this.workload = workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public int getWorkload() {
        return workload;
    }

}
