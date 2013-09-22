package org.hl7.fhir.model;

/*
  Copyright (c) 2011-2013, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Sun, Sep 22, 2013 13:55-0400 for FHIR v0.11

import java.util.*;

import java.math.*;
/**
 * A remittance.
 */
public class Remittance extends Resource {

    public class RemittanceServiceComponent extends Element {
        /**
         * The service instance number for the original transaction.
         */
        protected Integer instance;

        /**
         * The code for the professional service.
         */
        protected CodeableConcept code;

        /**
         * The percent of the service fee which would be elegible for coverage.
         */
        protected Decimal rate;

        /**
         * The amount payable for a submitted service (includes both professional and lab fees.).
         */
        protected Decimal benefit;

        public Integer getInstance() { 
          return this.instance;
        }

        public void setInstance(Integer value) { 
          this.instance = value;
        }

        public int getInstanceSimple() { 
          return this.instance == null ? null : this.instance.getValue();
        }

        public void setInstanceSimple(int value) { 
            if (this.instance == null)
              this.instance = new Integer();
            this.instance.setValue(value);
        }

        public CodeableConcept getCode() { 
          return this.code;
        }

        public void setCode(CodeableConcept value) { 
          this.code = value;
        }

        public Decimal getRate() { 
          return this.rate;
        }

        public void setRate(Decimal value) { 
          this.rate = value;
        }

        public BigDecimal getRateSimple() { 
          return this.rate == null ? null : this.rate.getValue();
        }

        public void setRateSimple(BigDecimal value) { 
          if (value == null)
            this.rate = null;
          else {
            if (this.rate == null)
              this.rate = new Decimal();
            this.rate.setValue(value);
          }
        }

        public Decimal getBenefit() { 
          return this.benefit;
        }

        public void setBenefit(Decimal value) { 
          this.benefit = value;
        }

        public BigDecimal getBenefitSimple() { 
          return this.benefit == null ? null : this.benefit.getValue();
        }

        public void setBenefitSimple(BigDecimal value) { 
          if (value == null)
            this.benefit = null;
          else {
            if (this.benefit == null)
              this.benefit = new Decimal();
            this.benefit.setValue(value);
          }
        }

      public RemittanceServiceComponent copy(Remittance e) {
        RemittanceServiceComponent dst = e.new RemittanceServiceComponent();
        dst.instance = instance == null ? null : instance.copy();
        dst.code = code == null ? null : code.copy();
        dst.rate = rate == null ? null : rate.copy();
        dst.benefit = benefit == null ? null : benefit.copy();
        return dst;
      }

  }

    /**
     * The remittance identifier.
     */
    protected Identifier identifier;

    /**
     * A service paid as part of remittance.
     */
    protected List<RemittanceServiceComponent> service = new ArrayList<RemittanceServiceComponent>();

    public Identifier getIdentifier() { 
      return this.identifier;
    }

    public void setIdentifier(Identifier value) { 
      this.identifier = value;
    }

    public List<RemittanceServiceComponent> getService() { 
      return this.service;
    }

    // syntactic sugar
    public RemittanceServiceComponent addService() { 
      RemittanceServiceComponent t = new RemittanceServiceComponent();
      this.service.add(t);
      return t;
    }

      public Remittance copy() {
        Remittance dst = new Remittance();
        dst.identifier = identifier == null ? null : identifier.copy();
        dst.service = new ArrayList<RemittanceServiceComponent>();
        for (RemittanceServiceComponent i : service)
          dst.service.add(i.copy(dst));
        return dst;
      }

      protected Remittance typedCopy() {
        return copy();
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Remittance;
   }


}

