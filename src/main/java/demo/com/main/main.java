package demo.com.main;

import demo.com.configuration.SpringConfig;
import demo.com.entity.CustomerEntity;
import demo.com.repository.BookRepository;
import demo.com.repository.CustomerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Optional;

public class main {
    static ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    static BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
    static CustomerRepository customerRepository = (CustomerRepository) context.getBean("customerRepository");

    public static void main(String[] args){
//        crateNewBook();
//          readBook(1);
//        updateBook();
//        crateCustomer();
//        getAllCustomer();
//        getCustomerID(1);
//        getCustomerName("BBBBB");
//        getCustomerPhoneOrEmail("123456","AAA@gmail.com");
//        getCustomerIsMaleAndInAgeRate("Male",20,30);
    }

//    private static void crateNewBook() {
//        BookEntity bookEntity = new BookEntity();
//        bookEntity.setName("Java A-Z");
//        bookEntity.setAuthor("Roger");
//        bookEntity.setCategory("IT books");
//        bookEntity.setIsbn("ISIBF1219323");
//        bookEntity.setNumberOfPage(234);
//        bookEntity.setPrice(20.5);
//        bookEntity.setPublishDate(LocalDate.parse("2016-08-25"));
//
//        BookEntity result = bookRepository.save(bookEntity);
//
//        if (result != null) {
//            System.out.println("A new book save successfully, book ID = " + bookEntity.getId());
//        }
//    }

//    private static void readBook() {
//        List<BookEntity> booklist = (List<BookEntity>) bookRepository.findAll();
//        System.out.println("they are:");
//        for (BookEntity book: booklist){
//            System.out.println(book.toString());
//        }
//    }
//    private static void readBook(int bookID) {
//        Optional<BookEntity> bookEntity = Optional.ofNullable(bookRepository.findById(bookID));
//        if (bookEntity != null) {
//            System.out.println("Found a book with book ID = " + bookID);
//            System.out.println(bookEntity.toString());
//        }else {
//            System.out.println("Not found any book with book ID =" + bookID);
//        }
//    }

//    private static void updateBook() {
//       BookEntity bookEntity = bookRepository.findById(1);
//            System.out.println("Book data before updating");
//            System.out.println(bookEntity.toString());
//
//            bookEntity.setAuthor("Jame");
//            bookEntity.setNumberOfPage(199);
//            bookEntity.setPrice(201.0);
//            bookRepository.save(bookEntity);
//
//            System.out.println("Book data after updating");
//            System.out.println(bookEntity.toString());
//        }
//
//    private static void deletebook() {
//        bookRepository.delete(1);
//
//        BookEntity bookEntity = bookRepository.findById(2);
//        if (bookEntity != null) {
//            bookRepository.delete(bookEntity);
//        }
//        bookRepository.deleteAll();
//    }

//    private static void crateCustomer() {
//        CustomerEntity customerEntity = new CustomerEntity();
//        customerEntity.setName("AAAAA");
//        customerEntity.setBirthday("22-12-2002");
//        customerEntity.setAddress("Da Nang");
//        customerEntity.setEmail("AAA@gmail.com");
//        customerEntity.setPhone("23123123");
//        customerEntity.setSex("Male");
//
//        CustomerEntity result = customerRepository.save(customerEntity);
//
//        if (result != null) {
//            System.out.println("A new customer save successfully, customer ID = " + customerEntity.getId());
//        }
//    }

    private static void getAllCustomer(){
        List<CustomerEntity> customerEntity = (List<CustomerEntity>) customerRepository.findAll();

            for (CustomerEntity customer : customerEntity) {
                System.out.println(customer.toString());
            }
        }

    private static void getCustomerID(int id){
        Optional<Optional<CustomerEntity>> customerEntity = Optional.ofNullable(customerRepository.findById(id));
        if (customerEntity != null) {
            System.out.println("Found customer with ID = " + customerEntity);
            System.out.println(customerEntity.toString());
        }else {
            System.out.println("Not found customer with ID =" + customerEntity);
        }
    }

    private static void getCustomerName(String name){
        Optional<Optional<CustomerEntity>> customerEntity = Optional.ofNullable(customerRepository.findByName(name));
        if (customerEntity != null) {
            System.out.println("Found customer with Name = " + customerEntity);
            System.out.println(customerEntity.toString());
        }else {
            System.out.println("Not found customer with Name =" + customerEntity);
        }
    }

    private static void getCustomerPhoneOrEmail(String phone, String email){
        Optional<Optional<CustomerEntity>> customerEntity = Optional.ofNullable(customerRepository.findByPhoneOrEmail(phone, email));
        if (customerEntity != null) {
            System.out.println("Found customer with = " + customerEntity.get());
            System.out.println(customerEntity.toString());
        }else {
            System.out.println("Not found customer with =" + customerEntity);
        }
    }

//    private static void getCustomerIsMaleAndInAgeRate(String sex,int starAge, int endAge) {
//        List<CustomerEntity> customerEntity = (List<CustomerEntity>) customerRepository.findBySexAndBirthday(sex, starAge, endAge);
//
//        if (customerEntity != null) {
//            System.out.println("Found customer with = " + customerEntity);
//            System.out.println(customerEntity.toString());
//        }else {
//            System.out.println("Not found customer with =" + customerEntity);
//        }
//    }
}

