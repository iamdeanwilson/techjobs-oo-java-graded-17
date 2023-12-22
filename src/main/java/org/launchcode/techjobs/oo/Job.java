package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;

public class Job{

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Employer getEmployer() { return employer; }

    public void setEmployer(Employer employer) { this.employer = employer; }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }

    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }

    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }

    @Override
    public String toString() {
        if(name == null || name.isEmpty()){
            name = "Data not available";
        }
        if(employer == null || employer.toString().isEmpty()){
            employer = new Employer("Data not available");
        }
        if(location == null || location.toString().isEmpty()){
            location = new Location("Data not available");
        }
        if(positionType == null || positionType.toString().isEmpty()){
            positionType = new PositionType("Data not available");
        }
        if(coreCompetency == null || coreCompetency.toString().isEmpty()){
            coreCompetency = new CoreCompetency("Data not available");
        }
        return String.format("%1$sID: %2$d%1$sName: %3$s%1$sEmployer: %4$s%1$s" +
                        "Location: %5$s%1$sPosition Type: %6$s%1$sCore Competency: %7$s%1$s",
                lineSeparator(), id, name, employer, location, positionType, coreCompetency);
    }


}
