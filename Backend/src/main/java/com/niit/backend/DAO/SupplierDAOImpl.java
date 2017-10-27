package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Supplier supplier) {
		Session session=sessionFactory.getCurrentSession();
		session.save(supplier);
	}

	public void update(Supplier supplier) {
		Session session=sessionFactory.getCurrentSession();
		session.update(supplier);

	}

	public void delete(int supplierId) {
		Supplier supplierToDelete=new Supplier();
		supplierToDelete.setSupId(supplierId);
		sessionFactory.getCurrentSession().delete(supplierToDelete);
	}

	public Supplier getbyId(int supplierId) {
		Session session=sessionFactory.getCurrentSession();
		String hql="from supplier where supplierId='"+supplierId+"'";
		Query query=session.createQuery(hql);
		List<Supplier> suppliers=query.list();
		if(suppliers!= null && !suppliers.isEmpty())
			return suppliers.get(0);
		return null;
	}

	public List<Supplier> list() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Supplier");
		List<Supplier> suppliers=query.list();
		return suppliers;
	}

}
