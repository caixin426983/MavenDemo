package study.day_26;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by CX on 2018-1-10.
 */
public class InetAddressDemo {

    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getByName("172.16.0.89");

        String hostName = address.getHostName();
        System.out.println(hostName);

        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);


    }

}
