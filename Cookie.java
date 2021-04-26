class Part {
  private int amt;
  private int temp;
  private int min;
  private int ready;


  part() {
    amt = 0;
    temp = 0;
    min = 0;
    ready = 0;

  }

  Part(int aamt, int atemp, int amin, int aready) {
amt = aamt;
atemp = temp;
min = amin;
aready = ready;
  }

  int getAmt() {
    return amt;
  }

  int GetTemp(){
    return temp;

  }

  int getMin(){
    return min;
  }

  int getReady(){
    return ready;
  }

  void setAmt(int aAmt){
    amt = aAmt;
  }

  void setTemp(int aTemp){
    temp = aTemp;
  }

  void setMin(int aMin){
    min = aMin;
  }

  void setReady(int aReady){
    ready = aReady;
  }
  void print() {
    System.out.println("Amt: " + amt);
    System.out.println("Temp: " + temp);
    System.out.println("Min: " + min);
    System.out.println("Ready: " + ready);

  }
}