class Practical91{
   public static void main(String args[])
    {
       long time1=0,time2=0, start_time,end_time;
       int size=Integer.parseInt(args[0]);
       long[] array=new long[size];
       for(int i=0;i<size;i++)
	{
	  array[i]=System.nanoTime()%20+1;
	}
       for(int i=0;i<size;i++)
       {
         start_time=System.nanoTime();
         long result=factorial1(array[i]);
         end_time=System.nanoTime();
         time1+=(end_time-start_time);
        }
	System.out.println(time1/size);
	for(int i=0;i<size;i++)
         {	
	   start_time=System.nanoTime();
           factorial2(array[i]);
           end_time=System.nanoTime();
           time2+=(end_time-start_time);
         }
        System.out.println(time2/size);
       }  
  static long factorial1(long n)
  {
    if(n<2)
     {
       return 1;
     }
     else
     {
       long fact=2;
       for(int i=3;i<=n;i++)
       {
         fact*=i;
       }
       return fact;
     }
  }
 static long factorial2(long number)
  {
     if(number<2)
     {
       return 1;
     }
     else
     {
       return number*factorial2(number-1);
     }
	
  }
 }
