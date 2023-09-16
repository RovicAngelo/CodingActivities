
/*
program 1:Conversion from binary to decimal representation

Programmer: Rovic Angelo Lanuza

Class: IT 121      Instructor: John Mark Gabrentina

Pledge: I have neither given nor received unauthorized aid
on this program.

Description: This program convert a binary to decimal

Input: binary number

Output: decimal number
*/

//imported packages
import javax.swing.*;

public class BinaryToDecimal {

    // main method
    public static void main(String[] args) {
        // Request 6-bit binary number
        String binaryString = JOptionPane.showInputDialog("Enter a 6 bit binary number");

        // convert from String to Integer type
        int binary = Integer.parseInt(binaryString);

        // Declaration of output value
        int decimal = 0;

        // Declaration of variable to hold the current bit
        int bit;

        int i = 0;
        int power2 = 1;
        int len = binaryString.length();
        while (i < len) {
            bit = binary % 10; // get the last bit (6th)
            decimal = decimal + bit * power2; // add it, multiplied by the corresponding power of 2
            binary = binary / 10; // get rid of the 6th, now the 5th bit is last
            power2 *= 2;
            i++;
        }
        // format output String
        String binaryOutput = "Binary: " + binaryString;
        String decimalOutput = "Decimal: " + decimal;

        // Output message
        JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput, "Binary to Decimal Conversion",
                JOptionPane.INFORMATION_MESSAGE);

        // Exit
        System.exit(0);

    }

}