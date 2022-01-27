import javax.swing.*;

public class DistanceCalculator {
    public void distance() {
        double  lat1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the latitude of coordinate 1:"));

        double lon1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the longitude of coordinate 1:"));

        double lat2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the latitude of coordinate 2:"));

        double lon2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Input the longitude of coordinate 2:"));

        double r = 6371.01;

        double la1 = Math.toRadians(lat1);
        double lo1 = Math.toRadians(lon1);
        double la2 = Math.toRadians(lat2);
        double lo2 = Math.toRadians(lon2);

        double distance = r * Math.acos(Math.sin(la1) * Math.sin(la2) + Math.cos(la1) * Math.cos(la2) * Math.cos(lo1 - lo2));

        JOptionPane.showMessageDialog(null, "The distance between coordinates of " + "[(" + lat1 + " , " + lon1 + ")" + " and " + "(" + lat2 + " , " + lon2 + ")]" + " is " + distance + " km");
    }
}