class PrintNumbers{
  synchronized public void printNumbers(){
    for(int i=0; i<3; i++){
      System.out.println(i);
      try{
          Thread.sleep(400);
      }
      catch (Exception e){
          System.out.println(e);
      }
    }
  }
}
class CreateThread extends Thread{
  PrintNumbers print;
  CreateThread(PrintNumbers print){
    this.print = print;
  }
  public void run(){
    print.printNumbers();
  }
}
class SynchronizedMethodDemo{
  public static void main(String[] args) {
    PrintNumbers print = new PrintNumbers();
    Thread t1 = new CreateThread(print);
    Thread t2 = new CreateThread(print);
    t1.start();
    t2.start();
  }
}