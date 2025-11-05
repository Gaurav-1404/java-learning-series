import java.util.Scanner;

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
class NewSmartphone extends MyCellphone implements Camera,Wifi{
    public void takesnap() {
        System.out.println("Taking snap from NewSmartphone");
    }

    public void recordVideo() {
        System.out.println("Recording video from NewSmartphone");
    }

    public void document() {
        System.out.println("Taking document from NewSmartphone");
    }

    public void portrait() {
        System.out.println("Taking portrait from NewSmartphone");
    }

    public String[] getNetwork() {
        return new String[]{"Airtel", "Jio"};
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    public void record4k() {
        System.out.println("Taking 4k video from NewSmartphone");
    }
}


public class C22_Polymorphism {
    public static void main(String[] args) {
        Camera NS2 = new NewSmartphone(); // this is a smartphone use it as a camera.
        // NS2.getNetwork(); -----> Not Allowed
        NS2.record4k();
        NS2.greet();
        // NS2.callNumber(); ---->Not allowed
    }
}
