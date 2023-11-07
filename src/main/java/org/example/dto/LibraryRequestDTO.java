package org.example.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.entities.Person;
import org.example.enums.Books;

import java.awt.print.Book;
//import models.Person;
//import models.Book;

@Data
@AllArgsConstructor
public class LibraryRequestDTO {
    private Person person;
    private Books books;
}

