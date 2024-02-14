//package com.codezero.springboot.api.testapp.test;
//
//import com.codezero.springboot.api.testapp.entity.Book;
//import com.codezero.springboot.api.testapp.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.Assert;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class BookServiceUnitTest {
//    @Autowired
//    private BookService bookService;
//
//    @Test
//    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
//        List<Book> books = bookService.list();
//
//        Assert.assertEquals(books.size(), 3);
//    }
//}