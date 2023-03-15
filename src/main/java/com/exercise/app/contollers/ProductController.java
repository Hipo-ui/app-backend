package com.exercise.app.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.app.models.Producto;
import com.exercise.app.service.ProductoService;

@RestController
@CrossOrigin
@RequestMapping("producto")
public class ProductController {

	@Autowired
	ProductoService productoService;
	
	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	List<Producto> getAll() {
		return productoService.getAll();
	}

	@RequestMapping(value = "/{sku}", method = RequestMethod.GET)
	Producto get(@PathVariable long sku) {
		return productoService.get(sku);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	void register(@RequestBody Producto producto) {
		productoService.register(producto);
	}

	@RequestMapping(value = "/{sku}", method = RequestMethod.PUT)
	Producto update(@RequestBody Producto producto) {
		return productoService.update(producto);
	}

	@RequestMapping(value = "/{sku}", method = RequestMethod.DELETE)
	void delete(@PathVariable long sku) {
		productoService.delete(sku);
	}

}
