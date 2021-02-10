package p20210205_2_other_pattern.p1_filter_pattern;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
