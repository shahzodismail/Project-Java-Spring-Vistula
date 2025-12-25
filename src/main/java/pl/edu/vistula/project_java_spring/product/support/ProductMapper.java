package pl.edu.vistula.project_java_spring.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.project_java_spring.product.api.request.ProductRequest;
import pl.edu.vistula.project_java_spring.product.api.response.ProductResponse;
import pl.edu.vistula.project_java_spring.product.domain.Product;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {
        return new Product(productRequest.getName());
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}