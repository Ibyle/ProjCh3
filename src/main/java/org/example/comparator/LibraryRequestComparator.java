package org.example.comparator;



import lombok.NoArgsConstructor;
import org.example.entities.Person;
//import models.Person;

import java.util.Comparator;

@NoArgsConstructor
public class LibraryRequestComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        // Implementation logic for priority queue (similar to previous implementation)
        return 0;
    }
}

