
package com.niit.backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.DAO.SupplierDAO;
import com.niit.backend.model.Supplier;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDAO supplierDAO;
    
    public void save(Supplier supplier) {
        
    	supplierDAO.save(supplier);
    }

    public void update(Supplier supplier) {
    	supplierDAO.update(supplier);

    }

    public void delete(int supplierId) {
    	supplierDAO.delete(supplierId);

    }

    public Supplier getById(int supplierId) {
    	supplierDAO.getbyId(supplierId);
        return null;
    }

    public List<Supplier> list() {
        // TODO Auto-generated method stub
        return null;
    }

}