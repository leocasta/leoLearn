public class Frazioni {
  int num = 0;
  int den = 1;
 
  public Frazioni(int num, int den) {
	  
	  this.num = num;
			  if(den !=0)
				  this.den = den;
				  else 
					  den=1;
			 
  }
  
  public String ToString() {
	  return num + "/" + den;
}
 
 
}






