package org.hl7.fhir.model;

public interface EnumFactory {

  public Enum<?> fromCode(String codeString) throws Exception;
  public String toCode(Enum<?> code) throws Exception;

}
