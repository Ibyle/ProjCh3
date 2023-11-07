package org.example;

import org.example.dto.LibraryRequestDTO;
import org.example.entities.JuniorStudent;
import org.example.entities.SeniorStudent;
import org.example.entities.Teacher;
//import org.example.enums.Books;
import org.example.enums.Books;
import org.example.libraryy.Library;
import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        // Create persons
        Teacher collins = new Teacher("Collins");
        JuniorStudent wendy = new JuniorStudent("Wendy");
        Teacher daro = new Teacher("Daro");
        SeniorStudent johnson = new SeniorStudent("Johnson");
        Teacher olaleye = new Teacher("Olaleye");
        JuniorStudent tolu = new JuniorStudent("Tolu");
        JuniorStudent shade = new JuniorStudent("Shade");

        // Create book requests
        LibraryRequestDTO request1 = new LibraryRequestDTO(collins, Books.CHEMISTRY);
        LibraryRequestDTO request2 = new LibraryRequestDTO(wendy, Books.CHEMISTRY);
        LibraryRequestDTO request3 = new LibraryRequestDTO(johnson, Books.CHEMISTRY);
        LibraryRequestDTO request4 = new LibraryRequestDTO(daro, Books.PHYSICS);
        LibraryRequestDTO request5 = new LibraryRequestDTO(johnson, Books.PHYSICS);
        LibraryRequestDTO request6 = new LibraryRequestDTO(olaleye, Books.ENGLISH);
        LibraryRequestDTO request7 = new LibraryRequestDTO(tolu, Books.ENGLISH);
        LibraryRequestDTO request8 = new LibraryRequestDTO(shade, Books.BUSINESS_STUDIES);

        // Creating library instance
        Library library = new Library();

        // Add book requests to the library
        library.addRequest(request1);
        library.addRequest(request2);
        library.addRequest(request3);
        library.addRequest(request4);
        library.addRequest(request5);
        library.addRequest(request6);
        library.addRequest(request7);
        library.addRequest(request8);

        // Process requests
        library.processRequests();
    }
}
