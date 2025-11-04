import java.util.Scanner;

import javax.swing.border.StrokeBorder;

interface Camera{
    void takesnap();
    void recordVideo();
    void document();
    void portrait();
    default void greet(){
        System.out.println("Good morning!");
    }
    default void record4k(){
        greet();
        System.out.println("Recording in 4k");  // defualt Method in interface
    }
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class Smartphone extends MyCellphone implements Camera, Wifi{
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
    public void document(){
        System.out.println("Taking document");
    }
    public void portrait(){
        System.out.println("Taking portrait");
    }
    public String[] getNetwork(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Airtel" , "jio", "VI"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting network " + network);
    }
    public void record4k(){
        System.out.println("Recording 4k snap...");   // can change defualt method statement
    }
    public void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    public void pickCall(){
        System.out.println("connecting...");
    }
}

public class C20_Interface_examples {
    public static void main(String[] args) {
        Smartphone A13p = new Smartphone();

        String[] ar = A13p.getNetwork();
        for(String a : ar){
            System.out.println(a);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the network which one want to connect..");
        String Cn = sc.nextLine();
        A13p.connectToNetwork(Cn);
        A13p.callNumber(9569);
        A13p.takesnap();
        A13p.document();
        A13p.record4k();

        A13p.pickCall();
    }
}
