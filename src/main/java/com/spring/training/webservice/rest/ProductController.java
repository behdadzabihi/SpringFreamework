package com.spring.training.webservice.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Logger;


@RestController
@RequestMapping(value = "/product", produces = "application/json")
@Scope("session")
@SessionAttributes("basket")
public class ProductController {

    Logger logger = Logger.getLogger(ProductController.class.getName());

    @Autowired
    MessageProvider messageProvider;

    @RequestMapping(method = RequestMethod.POST)
    public Product add(@RequestBody Product product, ArrayList<Product> basket){
        logger.info("Product: "+product);
        basket.add(product);
        return product;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    public Product[] search(@PathVariable("name") String productName, @RequestHeader("Accept") String accept){
        Product product1 = new Product(1L, "Galaxy Note 10", "Samsung", "Mobile");
        Product product2 = new Product(2L, "Mac Book Air", "Apple", "Laptop");
        return new Product[]{product1, product2};
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity delete(){
        return new ResponseEntity<String>("Hello!",
                HttpStatus.OK);
    }

    @ExceptionHandler(IOException.class)
    public ServerError createError(IOException ioException){
         return new ServerError(ServerError.IOEXCEPTION, "An IO Error Occured!");
    }

    @ExceptionHandler(ArithmeticException.class)
    public ServerError createError(ArithmeticException ioException){
         return new ServerError(ServerError.ARITHMATIC_EXCEPTION, "Arithmatic error!, check input values please");
    }
}
