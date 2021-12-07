package polymorfisme;
import polymorfisme.ID;


public class Harga extends ID{
    int h_project, t, t1, t2, t3;
    
    public void h_project(int hp){
        this.h_project = hp;
    }
    
    public int hGP(){
        return h_project;
    }
    
    public void t (int tj){
        this.t = tj;
    }
    
    public int hT(){
        return t;
    }
    
    public void t1(int tj1){
        this.t1 = tj1;
    }
    
    public int hT1(){
        return t1;
    }
    
    public void t2(int tj2){
        this.t2 = tj2;
    }
    
    public int gT2(){
        return t2;
    }
    
    public void t3(int tj3){
        this.t3 = tj3;
    }
    
    public int gT3(){
        return t3;
    }
    
    
}