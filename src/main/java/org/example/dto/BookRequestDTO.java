package org.example.dto;

        import lombok.AllArgsConstructor;
        import lombok.Data;
        import org.example.entities.Person;
        import org.example.enums.Books;
//import entities.Person;
        //import enums.Book;

@Data
@AllArgsConstructor
public class BookRequestDTO {
    private Person person;
    private Books books;
}

