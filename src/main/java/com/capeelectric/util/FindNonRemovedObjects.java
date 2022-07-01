package com.capeelectric.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.capeelectric.model.GeneralTestingPAT;
import com.capeelectric.model.PortableAppliance;

@Configuration
public class FindNonRemovedObjects {
	
private static final Logger logger = LoggerFactory.getLogger(FindNonRemovedObjects.class);

	
	//find non removed values for 
	public List<GeneralTestingPAT> findNonRemovedPATData(Optional<PortableAppliance> patRepo) {
		logger.info("Called findNonRemovedPATData function");

		ArrayList<GeneralTestingPAT> generalTestingPAT = new ArrayList<GeneralTestingPAT>();
		List<GeneralTestingPAT> findNonRemoveBuildings = patRepo.get().getGeneralTestingPAT();
		for (GeneralTestingPAT generalTestingPATItr: findNonRemoveBuildings) {
			if (generalTestingPATItr.getFlag()==null || !generalTestingPATItr.getFlag().equalsIgnoreCase("R")) {
				if(generalTestingPATItr.getFlag()==null) {
					generalTestingPATItr.setFlag("N");
				}				
				generalTestingPAT.add(generalTestingPATItr);		 
			}
		}
		logger.info("Ended findNonRemovedPATData function");
		return generalTestingPAT;
	}

}
