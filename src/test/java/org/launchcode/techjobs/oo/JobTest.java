package org.launchcode.techjobs.oo;

import org.junit.jupiter.api.Test;

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


}
