package pl.tomozak.warsztaty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.tomozak.warsztaty.models.Product;
import pl.tomozak.warsztaty.services.ProductService;


@RestController
class ProductController {


    private ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello IO!";
    }


    @GetMapping("/getProducts")
    public Iterable<Product> getProducts(){
        return productService.showListOfProduct();
    }




}
