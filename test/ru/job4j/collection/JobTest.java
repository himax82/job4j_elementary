package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> cmpNamePriority = new JobDescByName();
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 0),
                new Job("Wix bug", 1)
        );
        assertThat(rsl, lessThan(100));
    }

    @Test
    public void whenCompatorAscenByName() {
        Comparator<Job> cmpNamePriority = new JobAscenByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 0),
                new Job("Wix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscenByPrior() {
        Comparator<Job> cmpNamePriority = new JobAscenByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 1),
                new Job("Wix bug", 0)
        );
        assertThat(rsl, lessThan(2));
    }

    @Test
    public void whenCompatorDescByPrior() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority();
        int rsl = cmpNamePriority.compare(
                new Job("Ampl task", 1),
                new Job("Wix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByAscenNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobAscenByName().thenComparing(new JobAscenByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Wix bug", 0),
                new Job("Wix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByAscenNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new JobAscenByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Wix bug", 0),
                new Job("Wix bug", 1)
        );
        assertThat(rsl, lessThan(2));
    }

}