for(int i =0;i<9;i++){
 
   if(i<3){
     System.out.print("0");
     System.out.println(i);
   }
    else if( i<6){
      System.out.print("1");
      System.out.println(i-3);
   }
   else if( i<9){
     System.out.print("2");
     System.out.println(i-6);
   }

  }
  
   for(int i=1;i<10;i++){
     if(i<3){
       System.out.print(i);
       
   }
     else if(i<6){
       if(i>3){
         System.out.print(i);
       }
       else {
       System.out.println(i);
       }
     }
     else{
       if(i>6){
         
       System.out.print(i);
       }
       else{ 
         System.out.println(i);
       }
     }
   }
   System.out.println();
   int a = 1;
for(int i=0;i<101;i++){
  if(i==1){
   System.out.print(i);
  }
  if(i>0 && i>=10*a){
    System.out.println(i);
    a = a+1;
  }
  else if(i>1){
    System.out.print(i);
  }
}
System.out.println();
  String star ="*";
for(int p=1;p<7;p++){
  
  for(int i=0;i<p;i++){
  System.out.print(star);
  }
  System.out.println();
}
System.out.println();

for(int i=0;i<100;i++){
  System.out.println(100-i);
}