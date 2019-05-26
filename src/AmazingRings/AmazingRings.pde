int size = 100;
int Xval = 250;
int Xval2 = 750;
int Incrementer = 1;
void setup(){
  size(1000,1000);
  for(int i=1;i<15;i++){
    noFill();
    ellipse(Xval,500,size,size);
    size-=45;
  }
  int size = 100;
  for(int i=1;i<15;i++){
    noFill();
    ellipse(Xval2,500,size,size);
    size-=45;
  }
}

void draw(){
  int size = 100;
  background(56564764,986986,9867896);
  Xval+=Incrementer;
  Xval2-=Incrementer;
  for(int i=1;i<15;i++){
    noFill();
    ellipse(Xval,500,size,size);
    size-=45;
  }
  int size2 = 100;
  for(int i=1;i<15;i++){
    noFill();
    ellipse(Xval2,500,size2,size2);
    size2-=45;
  }

     int size3 = 100;
  background(56564764,986986,9867896);
  for(int j=1;j<15;j++){
    noFill();
    ellipse(Xval,500,size3,size3);
    size3-=45;
  }
  int size4 = 100;
  for(int j=1;j<15;j++){
    noFill();
    ellipse(Xval2,500,size4,size4);
    size4-=45;
  }
  
      if(Xval==1000&&Xval2==0){
      Incrementer=-Incrementer;
      println("flipped");
    }
    if(Xval==0&&Xval2==1000){
      Incrementer=-Incrementer;
    }
}
