package com.exercise.app.service;

import org.springframework.stereotype.Service;

import com.exercise.app.models.Producto;
import com.exercise.app.repository.ProductoDao;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProductoService {

	@Autowired
	ProductoDao productoDao;

	public List<Producto> getAll() {
		return productoDao.getAll();
	}

	public Producto get(long sku) {
		return productoDao.get(sku);
	}

	public void register(Producto producto) {
		productoDao.register(producto);
	}

	public Producto update(@RequestBody Producto producto) {
		return productoDao.update(producto);
	}

	public void delete(@PathVariable long sku) {
		productoDao.delete(sku);
	}
}
