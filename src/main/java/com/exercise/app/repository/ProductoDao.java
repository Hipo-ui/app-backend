package com.exercise.app.repository;

import com.exercise.app.models.Producto;

import java.util.List;

public interface ProductoDao {

	List<Producto> getAll();

	Producto get(long sku);

	Producto register(Producto producto);

	Producto update(Producto producto);

	void delete(long sku);

}
