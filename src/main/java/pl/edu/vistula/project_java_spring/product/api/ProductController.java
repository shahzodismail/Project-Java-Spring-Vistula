package pl.edu.vistula.project_java_spring.product.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.vistula.project_java_spring.product.api.request.ProductRequest;
import pl.edu.vistula.project_java_spring.product.api.response.ProductResponse;
import pl.edu.vistula.project_java_spring.product.service.ProductService;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        ProductResponse productResponse = productService.create(productRequest);
        return new ResponseEntity<>(productResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<java.util.List<ProductResponse>> findAll() {
        java.util.List<ProductResponse> productResponses = productService.findAll();
        return ResponseEntity.status(org.springframework.http.HttpStatus.OK).body(productResponses);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.status(org.springframework.http.HttpStatus.NO_CONTENT).build();
    }
}