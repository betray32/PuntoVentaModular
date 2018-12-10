package cl.api.rest.pos.module.inventory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import cl.api.rest.pos.util.JsonHeaderOutput;

/**
 * Servicio para el inventario
 * 
 * @author camilongo
 *
 */
@Service
public class InventoryService {
	

	/**
	 * Log
	 */
	private static final Log log = LogFactory.getLog(InventoryService.class);

	/**
	 * List inventory
	 * 
	 * @return
	 */
	public DtoInventoryOutput listInventory() {
		
		DtoInventoryOutput res = new DtoInventoryOutput();
		log.info("Se ha iniciado una llamada al servicio [INVENTARIO - LISTAR]");
		
		
		
		log.info("Se ha finalizado una llamada al servicio [INVENTARIO - LISTAR]");
		res.setHeaderOutput(JsonHeaderOutput.ok());
		
		return res;
	}
	
}
