package pl.edu.vistula.project_java_spring.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.project_java_spring.product.api.request.ProductRequest;
import pl.edu.vistula.project_java_spring.product.api.response.ProductResponse;
import pl.edu.vistula.project_java_spring.product.domain.Product;
import pl.edu.vistula.project_java_spring.product.repository.ProductRepository;
import pl.edu.vistula.project_java_spring.product.support.ProductMapper;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
    public java.util.List<ProductResponse> findAll() {
        return productRepository.findAll().stream()
                .map(productMapper::toProductResponse)
                .collect(java.util.stream.Collectors.toList());
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}