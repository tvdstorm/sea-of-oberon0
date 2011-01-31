package com.kootsjur.oberon;

import java.util.ArrayList;
import java.util.List;

public class FormalParameter
{
   private List<FPSection> fPsections;
   
   public FormalParameter()
   {
      fPsections = new ArrayList<FPSection>();
   }
   
   public boolean addFPSection(FPSection fPSection)
   {
      assert(this.fPsections != null):"ERROR fPSections is not initialized";
      return this.fPsections.add(fPSection);
   }
   
   public void setfPsections(List<FPSection> fPsections)
   {
      this.fPsections = fPsections;
   }

   public List<FPSection> getfPsections()
   {
      return fPsections;
   }
   
   

}
