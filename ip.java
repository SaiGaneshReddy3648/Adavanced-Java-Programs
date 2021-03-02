import java.net.*;
class IP{
    public static void main(String[] args){
        String str="www.google.com";
        try {
            InetAddress ip=InetAddress.getByName(str);
            System.out.println(ip.getHostName());   
        } catch(Exception e) {
            System.out.println(e);
        }
  }
}
