package com.airbus.hums.surgeon.dao.template;

import org.springframework.data.repository.CrudRepository;

import com.airbus.hums.surgeon.model.database.template.RtTemplate;

/**
 *  RtTemplate Repository defines the CRUD repository methods for the
 *  RtTemplate object.
 */
public interface RtTemplateRepo extends CrudRepository<RtTemplate, Integer> {
	
	/**
	 *  The type must be "RT" or "NRT".
	 *
	 * @param name the name
	 * @return the acm template
	 */
	RtTemplate findByName(String name);
	
}
