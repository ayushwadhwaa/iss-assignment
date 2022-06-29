class Table {      
    void printTable(int n){    
        synchronized(this){//synchronized block    
            for(int i=1;i<=5;i++){    
                System.out.println(n*i);    
                try{    
                    Thread.sleep(400);    
                }catch(Exception e){
                    System.out.println(e);
                }    
            }    
        }    
    } 
}
class TableOne extends Thread{    
    Table t;    
    TableOne(Table t){    
        this.t=t;    
    }    
    public void run(){    
        t.printTable(5);    
    }     
}
class TableTwo extends Thread{    
    Table t;    
    TableTwo(Table t){    
        this.t=t;    
    }    
    public void run(){    
        t.printTable(100);    
    }    
}             
public class SynchronizedBlockDemo {
    public static void main(String args[]){    
        Table obj = new Table();//only one object    
        TableOne t1=new TableOne(obj);    
        TableTwo t2=new TableTwo(obj);    
        t1.start();    
        t2.start();    
    }   
}
