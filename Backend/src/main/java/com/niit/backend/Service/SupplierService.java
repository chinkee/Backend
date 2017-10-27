
package com.niit.backend.Service;

import java.util.List;

import com.niit.backend.model.Supplier;

public interface SupplierService {
public void save(Supplier supplier);
    
    public void update(Supplier supplier);
    
    public void delete(int supplierId);
    
    public Supplier getById(int supplierId);
    
    public List<Supplier> list();
    
}