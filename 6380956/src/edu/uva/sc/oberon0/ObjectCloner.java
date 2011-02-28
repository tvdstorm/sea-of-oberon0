package edu.uva.sc.oberon0;

import java.io.*;

public class ObjectCloner
{
   private ObjectCloner(){}
   static public Object deepCopy(Object oldObj) throws Exception
   {
      ObjectOutputStream oos = null;
      ObjectInputStream ois = null;
      try
      {
         ByteArrayOutputStream bos = 
               new ByteArrayOutputStream(); 
         oos = new ObjectOutputStream(bos); 

         oos.writeObject(oldObj);   
         oos.flush();               
         ByteArrayInputStream bin = 
               new ByteArrayInputStream(bos.toByteArray()); 
         ois = new ObjectInputStream(bin);                  

         return ois.readObject(); 
      }
      catch(Exception e)
      {
         throw(e);
      }
      finally
      {
         oos.close();
         ois.close();
      }
   }
   
}