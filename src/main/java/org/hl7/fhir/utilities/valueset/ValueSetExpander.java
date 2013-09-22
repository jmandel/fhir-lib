package org.hl7.fhir.utilities.valueset;

import org.hl7.fhir.model.ValueSet;

public interface ValueSetExpander {
	 public ValueSet expand(ValueSet source) throws Exception;
}
