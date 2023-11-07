package org.example.libraryy;




//import models.Book;
//import entities.Person;
//import comparators.LibraryRequestComparator;

import org.example.comparator.LibraryRequestComparator;
import org.example.entities.Person;
import org.example.dto.LibraryRequestDTO;
import org.example.enums.Books;
//import org.example.enums.Book;
//import java.awt.print.Book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;


public class Library {
    private final PriorityQueue<Person> requests;
    private final HashMap<Books, Integer> availableBooks;
    private final HashSet<Books> borrowedBooks;

    public Library() {
        requests = new PriorityQueue<>(new LibraryRequestComparator());
        availableBooks = new HashMap<>();
        borrowedBooks = new HashSet<>();
        for (Books books : Books.values()) {
            availableBooks.put(books, 2); // 3 copies of each book initially
        }
    }


    public void addRequest(LibraryRequestDTO requestDTO) {
        requests.offer(requestDTO.getPerson());
        System.out.println(requestDTO.getPerson().getName() + " requested " + requestDTO.getBooks() + " book.");
    }

    public void processRequests() {
        while (!requests.isEmpty()) {
            Person person = requests.poll();
            Books requestedBooks = Books.values()[(int) (Math.random() * Books.values().length)]; // Random book selection
            if (availableBooks.containsKey(requestedBooks) && availableBooks.get(requestedBooks) > 0) {
                System.out.println(person.getName() + " borrowed " + requestedBooks + " book.");
                availableBooks.put(requestedBooks, availableBooks.get(requestedBooks) - 1);
                borrowedBooks.add(requestedBooks);
            } else {
                System.out.println("No more copies of " + requestedBooks + " book available.");
            }
        }
    }
}
