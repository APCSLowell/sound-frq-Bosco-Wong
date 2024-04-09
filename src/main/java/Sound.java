import java.util.*;
public class Sound
{
  /** the array of values in this sound; guaranteed not to be null */
  int[] samples;



  /** Changes those values in this sound that have an amplitude greater than limit.
   *  Values greater than limit are changed to limit.
   *  Values less than -limit are changed to -limit.
   *  @param limit the amplitude limit
   *         Precondition: limit >= 0
   *  @return the number of values in this sound that this method changed
   */
  public int limitAmplitude(int limit)
  {  
    int count = 0;
   for(int x= 0; x < smaples.length();x++){
     if(samples[x]>limit){
       samples[x] = limit; 
       count++;
     }
   }
    return count;
       
  }



  /** Removes all silence from the beginning of this sound.
   *  Silence is represented by a value of 0.
   *  Precondition: samples contains at least one nonzero value
   *  Postcondition: the length of samples reflects the removal of starting silence
   */
  public void trimSilenceFromBeginning()
  {
   int count = 0;
    boolean b = false;
    for(int x= 0; x < samples.length(); x++){
      if(b == false && samples[x] = 0)
        count++;
      else 
        b = true;
  }
    int [] e = new int[samples.length-count];
    for(int x = count-1; x < samples.length();x++){
      e[x] = samples[x];
    }
    samples = e;
  }
    
}
