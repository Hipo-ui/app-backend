package com.exercise.app.repository.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.app.models.Producto;
import com.exercise.app.repository.ProductoDao;

@Transactional
@Repository
public class ProductoDaoImp implements ProductoDao {

	@PersistenceContext
	protected EntityManager entityManager;

	@Transactional
	@Override
	public List<Producto> getAll() {
		String hql = "FROM Producto as p";
		return (List<Producto>) entityManager.createQuery(hql).getResultList();
	}

	@Transactional
	@Override
	public Producto get(long sku) {
		return entityManager.find(Producto.class, sku);
	}

	@Transactional
	@Override
	public Producto register(Producto producto) {
		entityManager.merge(producto);
		return producto;
	}

	@Transactional
	@Override
	public Producto update(Producto producto) {
		entityManager.merge(producto);
		return producto;
	}

	@Transactional
	@Override
	public void delete(long sku) {
		Producto producto = get(sku);
		entityManager.remove(producto);
	}
}
