package v2.filter;


import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons){
            if("SINGLE".equalsIgnoreCase(person.getMaritalStatus())){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
