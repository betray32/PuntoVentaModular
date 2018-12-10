package cl.api.rest.pos.module.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.api.rest.pos.module.login.DtoLoginForgotPasswordOutput;

/**
 * Exponedor para el servicio de inventario
 * @author camilongo
 *
 */
@RestController
@RequestMapping("Inventory")
public class InventoryRest {
	
	@Autowired
	private InventoryService service;


	/**
	 * Recuperar password
	 * 
	 * @return
	 */
	@RequestMapping("ListInventory")
	public String listInventory() {
		return "Listar Inventario";
	}
	
}
