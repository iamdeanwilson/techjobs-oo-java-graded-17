package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.Test;

import static java.lang.System.lineSeparator;
import static org.junit.jupiter.api.Assertions.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test()
    public void testSettingJobId() {
        Job test_job_1 = new Job("testName", new Employer("testEmployer"), new Location("testLocation"), new PositionType("testPositionType"), new CoreCompetency("testCoreCompetency"));
        Job test_job_2 = new Job("testName", new Employer("testEmployer"), new Location("testLocation"), new PositionType("testPositionType"), new CoreCompetency("testCoreCompetency"));
        assertNotEquals(test_job_1.getId(), test_job_2.getId());
    }

    @Test()
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.getName() instanceof String);
        assertEquals(test_job.getName(), "Product tester");

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals(test_job.getEmployer().toString(), "ACME");

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals(test_job.getLocation().toString(), "Desert");

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals(test_job.getPositionType().toString(), "Quality control");

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(test_job.getCoreCompetency().toString(), "Persistence");

    }

    @Test()
    public void testJobsForEquality() {
        Job test_job_1 = new Job("testName", new Employer("testEmployer"), new Location("testLocation"), new PositionType("testPositionType"), new CoreCompetency("testCoreCompetency"));
        Job test_job_2 = new Job("testName", new Employer("testEmployer"), new Location("testLocation"), new PositionType("testPositionType"), new CoreCompetency("testCoreCompetency"));
        assertNotEquals(test_job_1.getId(), test_job_2.getId());
    }

    @Test()
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job = new Job();
        String firstLine = String.valueOf(test_job.toString().charAt(test_job.toString().length() - 1));
        String lastLine = String.valueOf(test_job.toString().charAt(0));
        assertEquals(firstLine, lineSeparator());
        assertEquals(lastLine, lineSeparator());
    }

    @Test()
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job = new Job("testName", new Employer("testEmployer"), new Location("testLocation"),
                new PositionType("testPositionType"), new CoreCompetency("testCoreCompetency"));
        assertEquals(String.format("%1$sID: %2$d%1$sName: %3$s%1$sEmployer: %4$s%1$s" +
                        "Location: %5$s%1$sPosition Type: %6$s%1$sCore Competency: %7$s%1$s",
                lineSeparator(), test_job.getId(), "testName", "testEmployer", "testLocation",
                "testPositionType", "testCoreCompetency"), test_job.toString());
    }

    @Test()
    public void testToStringHandlesEmptyField() {
        Job test_job = new Job();
        assertEquals(String.format("%1$sID: %2$s%1$sName: %3$s%1$sEmployer: %3$s%1$s" +
                        "Location: %3$s%1$sPosition Type: %3$s%1$sCore Competency: %3$s%1$s",
                lineSeparator(), test_job.getId(), "Data not available"), test_job.toString());
    }

}
