class Practical9_2{
  public static void main(String[] args)
  {
    long time1=0,time2=0,time3=0,start_time,end_time;
    String s1="Java";
    StringBuilder s2=new StringBuilder("Programming");
    StringBuffer s3=new StringBuffer("Hello");
    int size=Integer.parseInt(args[0]);
    String[] array=new String[size];
    for(int i=0;i<size;i++)
    {
      array[i]= String.valueOf(System.nanoTime()%100);
    }
//String    
    for(int i=0;i<size;i++)
    {
      start_time=System.nanoTime();
      s1=s1.concat(array[i]);
      end_time=System.nanoTime();
      time1+=(end_time-start_time);
    }
    System.out.println(time1/size);
//StringBuilder    
    for(int i=0;i<size;i++)
    {
      start_time=System.nanoTime();
      s2.append(array[i]);
      end_time=System.nanoTime();
      time2+=(end_time-start_time);
    }
    System.out.println(time2/size);
//StringBuffer    
    for(int i=0;i<size;i++)
    {
      start_time=System.nanoTime();
      s3.append(array[i]);
      end_time=System.nanoTime();
      time3+=(end_time-start_time);
    }
    System.out.println(time3/size);
  }
}
