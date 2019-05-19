int size = 800;
void setup(){
  size(800,800);
  for(int i=1;i<9;i++){
    if(i%2==0){
      fill(#1F0C0B);
    }
    else{
     fill(#FC1205); 
    }
    ellipse(400,400,size,size);
    size-=100;
  }
}

void draw(){
  
} 
