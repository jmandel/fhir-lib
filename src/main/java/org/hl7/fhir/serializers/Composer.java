package org.hl7.fhir.serializers;

import java.io.OutputStream;

import org.hl7.fhir.model.AtomFeed;
import org.hl7.fhir.model.Resource;

public interface Composer {

	public void compose(OutputStream stream, Resource resource, boolean pretty) throws Exception;

	public void compose(OutputStream stream, AtomFeed feed, boolean pretty) throws Exception;
	
}
