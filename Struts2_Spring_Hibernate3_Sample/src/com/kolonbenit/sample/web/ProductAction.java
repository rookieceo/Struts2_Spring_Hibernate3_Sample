/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kolonbenit.sample.web;

import com.kolonbenit.sample.model.Product;
import com.kolonbenit.sample.service.ProductService;
import com.kolonbenit.sample.service.impl.ProductServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author 장인기
 */

public class ProductAction extends ActionSupport{
    private Product product;
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public String productList() throws Exception{
        setProductList(productService.findAll());
        return SUCCESS;
    }

    public String saveProduct() throws Exception{

        Product pdt = new Product();
        pdt.setPid("00000001");
        pdt.setName("새우깡1");
        pdt.setDescription("손이가요손이가새우깡에손이가요아이손어른손");

        System.out.println(productService.save(pdt));

        return SUCCESS;
    }

    public String updateProduct() throws Exception{
         productService.update(getProduct());
        return SUCCESS;
    }
    public String deleteProduct() throws Exception{
        productService.delete(getProduct());
        return SUCCESS;
    }




    /**
     *  Service 가져오기 (by Spring Framework)
     */
    @Autowired
	private ProductService productService;
}