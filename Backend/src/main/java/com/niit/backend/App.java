package com.niit.backend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CategoryDAOImpl;
import com.niit.backend.DAO.ProductDAOImpl;
import com.niit.backend.DAO.UserDAOImpl;
import com.niit.backend.Service.CartService;
import com.niit.backend.Service.CategoryService;
import com.niit.backend.Service.CategoryServiceImpl;
import com.niit.backend.Service.ProductService;
import com.niit.backend.Service.ProductServiceImpl;
import com.niit.backend.Service.SupplierService;
import com.niit.backend.Service.UserService;
import com.niit.backend.Service.UserServiceImpl;
import com.niit.backend.config.ApplicationContextConfig;
import com.niit.backend.model.Cart;
import com.niit.backend.model.Category;
import com.niit.backend.model.Product;
import com.niit.backend.model.Supplier;
import com.niit.backend.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(ApplicationContextConfig.class,CategoryDAOImpl.class,CategoryServiceImpl.class,UserDAOImpl.class,UserServiceImpl.class,ProductDAOImpl.class,ProductServiceImpl.class);
    CategoryService categoryService=(CategoryService)context.getBean("categoryServiceImpl");   
    Category category=new Category();
    category.setCategoryName("abc");
    category.setDescription("vdshgvjas");
    categoryService.save(category);
    System.out.println("Category Inserted");
    
    
    UserService userService=(UserService)context.getBean("userServiceImpl");   
    User user=new User();
    user.setUserName("abc");
    user.setPassword("123");
    user.setAddress("ashdjjasdkjsusasdkasjfjas");
    user.setEmailId("umas7862@gmail.com");
    user.setPhno("976766556");
    user.setZipcode(123141);
    userService.save(user);
    System.out.println("User Inserted");
    
    ProductService productService=(ProductService)context.getBean("productServiceImpl");   
    Product product=new Product();
    product.setProName("xyx");
    product.setDescription("vdfdghjas");
    product.setPrice(23);
    productService.save(product);
    System.out.println("Product Inserted");
    
    CartService cartService=(CartService)context.getBean("cartServiceImpl"); 
    Cart cart=new Cart();
    cart.setCartId(2);
    cart.setCartName("EE");
    cart.setDescription("yaaay");
    cartService.save(cart);
    System.out.println("Cart inserted");
    
    SupplierService supplierService=(SupplierService)context.getBean("supplierServiceImpl"); 
    Supplier supplier=new Supplier();
    supplier.setSupId(100);
    supplier.setSupname("mental");
    supplier.setContactno(1234);
    supplierService.save(supplier);
    System.out.println("Supplier inserted");
    
    
    
    }
}
