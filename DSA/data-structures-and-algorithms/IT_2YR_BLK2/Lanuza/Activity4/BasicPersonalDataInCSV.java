package IT_2YR_BLK2.Lanuza.Activity4;

/*
 ACTIVITY 4: Modify the personal data form
 Submitted by: Rovic Angelo Lanuza
 Course/Year/Block: BSIT 2-2
 */

import java.io.File; // to create CSV file
import java.io.FileWriter; // to write data in the CSV file
import java.io.IOException; //exception for accessing/reading file 
import java.util.Scanner; // for user Input

public class BasicPersonalDataInCSV {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);
        String lastName;
        String firstName;
        String middleName;
        char gender;
        boolean isSingle;
        String birthDate;
        String birthPlace;
        long mobileNumber;
        String emailAddress;

        int presentHouseNo;
        int presentLotNo;
        String presentStreetName;
        String presentSubdivisionBarangay;
        String presentMunicipality;
        String presentProvince;
        int presentZipCode;

        int permanentHouseNo;
        int permanentLotNo;
        String permanentStreetName;
        String permanentSubdivisionBarangay;
        String permanentMunicipality;
        String permanentProvince;
        int permanentZipCode;

        System.out.println();
        System.out.println("Please provide the exact informations.");
        System.out.println("========== Personal Information ==========");

        // prompts user for last name
        System.out.print("Last Name : ");
        lastName = userInput.nextLine();

        // prompts user for first name
        System.out.print("First Name : ");
        firstName = userInput.nextLine();

        // prompts user for middle name
        System.out.print("Middle Name : ");
        middleName = userInput.nextLine();

        // prompts user for gender
        System.out.print("Gender (M for Male, F for Female, X for LGBTQ+) : ");
        gender = userInput.nextLine().charAt(0);

        // prompts user for marital status
        System.out.print("Are you single? (Y for Yes, N for No) : ");
        if (isSingle = userInput.nextLine().equals("Y")) {
            isSingle = true;
        } else {
            isSingle = false;
        }

        // prompts user for Birth Date
        System.out.print("Birth Date (MM/dd/yyyy): ");
        birthDate = userInput.nextLine();

        // prompts user for Birth Place
        System.out.print("Birth Place : ");
        birthPlace = userInput.nextLine();
        System.out.println();
        System.out.println("========== Contact Information ==========");

        // prompts user for mobile number
        System.out.print("Mobile Number (Omit +63 or 0) : ");
        mobileNumber = Long.parseLong(userInput.nextLine());

        // prompts user for email address
        System.out.print("Email Address : ");
        emailAddress = userInput.nextLine();
        System.out.println();
        System.out.println("========== Address Information ==========");
        System.out.println("Present Address");
        System.out.println("=========================================");

        // prompts user for present House Number
        System.out.print("House No. : ");
        presentHouseNo = Integer.parseInt(userInput.nextLine());

        // prompts user for present Lot Number
        System.out.print("Lot No. : ");
        presentLotNo = Integer.parseInt(userInput.nextLine());

        // prompts user for present Street Name
        System.out.print("Street Name : ");
        presentStreetName = userInput.nextLine();

        // prompts user for present Subdivision or Barangay
        System.out.print("Subdivision/Barangay : ");
        presentSubdivisionBarangay = userInput.nextLine();

        // prompts user for present Municipality
        System.out.print("Municipality : ");
        presentMunicipality = userInput.nextLine();

        // prompts user for present Province
        System.out.print("Province : ");
        presentProvince = userInput.nextLine();

        // prompts user for present Zip Code
        System.out.print("Zip Code : ");
        presentZipCode = Integer.parseInt(userInput.nextLine());

        // ask user if present and permanent address is the same or not
        System.out.print(
                "Does your present address is the same as your permanent address? (Y for yes, N for no) : ");
        char isPresentPermament = userInput.nextLine().charAt(0);

        if (isPresentPermament == 'N' || isPresentPermament == 'n') {
            /*
             * if the present and permanent address is not the same,
             * prompt the user for permanent address informations.
             */
            System.out.println();
            System.out.println("Permanent Address");
            System.out.println("=========================================");

            // prompts user for permanent house number
            System.out.print("House No. : ");
            permanentHouseNo = Integer.parseInt(userInput.nextLine());

            // prompts user for permanent Lot Number
            System.out.print("Lot No. : ");
            permanentLotNo = Integer.parseInt(userInput.nextLine());

            // prompts user for permanent Street Name
            System.out.print("Street Name : ");
            permanentStreetName = userInput.nextLine();

            // prompts user for permanent Subvidision or Barangay
            System.out.print("Subdivision/Barangay : ");
            permanentSubdivisionBarangay = userInput.nextLine();

            // prompts user for permanent Municipality
            System.out.print("Municipality : ");
            permanentMunicipality = userInput.nextLine();

            // prompts user for permanent Province
            System.out.print("Province : ");
            permanentProvince = userInput.nextLine();

            // prompts user for permanent Zip Code
            System.out.print("Zip Code : ");
            permanentZipCode = Integer.parseInt(userInput.nextLine());
            System.out.println();

            // To display the Profile Information in the console
            System.out.println();
            System.out.println("========== Summary Profile Information ==========\n" +
                    "Full Name : " + firstName + " " + middleName + " " + lastName + "\n" +
                    "Gender : " + gender + "\n" +
                    "Is single : " + isSingle + "\n" +
                    "Birth Date : " + birthDate + "\n" +
                    "Birth Place : " + birthPlace + "\n" +
                    "Mobile Number : " + "+63" + mobileNumber + "\n" +
                    "Email Address : " + emailAddress);

            System.out.println("Present Address : " + presentHouseNo + " " + presentLotNo + " "
                    + presentStreetName
                    + ", " + presentSubdivisionBarangay + ", " + presentMunicipality + ", "
                    + presentProvince + " , "
                    + presentZipCode);

            System.out.println("Permanent Address : " + permanentHouseNo + " " + permanentLotNo + " "
                    + permanentStreetName
                    + ", " + permanentSubdivisionBarangay + ", " + permanentMunicipality + ", "
                    + permanentProvince + " , "
                    + permanentZipCode);

            String headers = "\"Last Name\", \"Middle Name\", \"First Name\",\"Gender\", \"Is Single\",\"Birth Date\", \"Birth Place\", \"Mobile Number\", \"Email Address\", \"Present House No.\", \"Present Lot No.\", \"Present Street Name\", \"Present Subdivision/Barangay\", \"Present Municipality\", \"Present Province\", \"Present Zip Code\", \"Permanent House No.\", \"Permanent Lot No.\", \"Permanent Street Name\", \"Permanent Subdivision/Barangay\", \"Permanent Municipality\", \"Permanent Province\", \"Permanent Zip Code\" ,\n";

            // to assign a String "values" with the values of all the userInputs.
            // permanent address and present address have different values
            String values = "\"" + lastName + "\"" + "," + "\"" + middleName + "\"" + "," + "\"" + firstName + "\""
                    + "," + "\"" + gender + "\"" + "," + "\"" + isSingle + "\""
                    + "," + "\"" + birthDate + "\"" + "," + "\"" + birthPlace + "\"" + "," + "\"" + mobileNumber + "\""
                    + "," + "\"" + emailAddress + "\"" + "," + "\""
                    + presentHouseNo + "\"" + "," + "\"" + presentLotNo + "\"" + "," + "\"" + presentStreetName + "\""
                    + "," + "\""
                    + presentSubdivisionBarangay + "\"" + "," + "\"" + presentMunicipality + "\"" + "," + "\""
                    + presentProvince + "\""
                    + "," + "\""
                    + presentZipCode + "\"" + "," + "\"" + permanentHouseNo + "\"" + "," + permanentLotNo + "\"" + ","
                    + "\""
                    + permanentStreetName + "\"" + "," + "\"" + permanentSubdivisionBarangay + "\"" + "," + "\""
                    + permanentMunicipality + "\""
                    + "," + "\"" + permanentProvince + "\"" + "," + "\"" + permanentZipCode + "\"" + "\n";

            // to create a CSV file
            File myFile = new File("personal_data.csv");
            // if the csv file exist just write the values,
            // if not write the header and the values
            if (myFile.exists()) {
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write(values);
                myWriter.close(); // to close the FileWriter
            } else {
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write(headers);
                myWriter.write(values);
                myWriter.close(); // to close the FileWriter
            }

        } else {
            /*
             * if the present and permanent address is the same,
             * Do not ask for permanent Adress infos,
             * and just copy the present address to the permanent address in the profile
             * info.
             */
            System.out.println();
            System.out.println("========== Summary Profile Information ==========");
            System.out.println("Full Name : " + firstName + " " + middleName + " " + lastName + "\n" +
                    "Gender : " + gender + "\n" +
                    "Is single : " + isSingle + "\n" +
                    "Birth Date : " + birthDate + "\n" +
                    "Birth Place : " + birthPlace + "\n" +
                    "Mobile Number : " + "+63" + mobileNumber + "\n" +
                    "Email Address : " + emailAddress);
            System.out.println("Present Address : " + presentHouseNo + " " + presentLotNo + " "
                    + presentStreetName
                    + ", " + presentSubdivisionBarangay + ", " + presentMunicipality + ", "
                    + presentProvince + " , "
                    + presentZipCode);
            System.out.println("Permanent Address : " + presentHouseNo + " " + presentLotNo + " "
                    + presentStreetName
                    + ", " + presentSubdivisionBarangay + ", " + presentMunicipality + ", "
                    + presentProvince + " , "
                    + presentZipCode);

            String headers = "\"Last Name\", \"Middle Name\", \"First Name\",\"Gender\", \"Is Single\",\"Birth Date\", \"Birth Place\", \"Mobile Number\", \"Email Address\", \"Present House No.\", \"Present Lot No.\", \"Present Street Name\", \"Present Subdivision/Barangay\", \"Present Municipality\", \"Present Province\", \"Present Zip Code\", \"Permanent House No.\", \"Permanent Lot No.\", \"Permanent Street Name\", \"Permanent Subdivision/Barangay\", \"Permanent Municipality\", \"Permanent Province\", \"Permanent Zip Code\" ,\n";

            // to assign a String "values" with the values of all the user inputs.
            // permanent address and present address have the same values.
            String values = "\"" + lastName + "\"" + "," + "\"" + middleName + "\"" + "," + "\"" + firstName + "\""
                    + "," + "\"" + gender + "\"" + "," + "\"" + isSingle + "\""
                    + "," + "\"" + birthDate + "\"" + "," + "\"" + birthPlace + "\"" + "," + "\"" + mobileNumber + "\""
                    + "," + "\"" + emailAddress + "\"" + "," + "\""
                    + presentHouseNo + "\"" + "," + "\"" + presentLotNo + "\"" + "," + "\"" + presentStreetName + "\""
                    + "," + "\""
                    + presentSubdivisionBarangay + "\"" + "," + "\"" + presentMunicipality + "\"" + "," + "\""
                    + presentProvince + "\""
                    + "," + "\""
                    + presentZipCode + "\"" + "," + "\"" + presentHouseNo + "\"" + "," + presentLotNo + "\"" + ","
                    + "\""
                    + presentStreetName + "\"" + "," + "\"" + presentSubdivisionBarangay + "\"" + "," + "\""
                    + presentMunicipality + "\""
                    + "," + "\"" + presentProvince + "\"" + "," + "\"" + presentZipCode + "\"" + "\n";

            // to create CSV file
            File myFile = new File("personal_data.csv");

            // to check if the csv file is already generated/existed
            if (myFile.exists()) { // if yes, just write the values in the csv file,
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write(values);
                myWriter.close(); // to close the filewriter

            } else { // if not, write the header and the values in the csv file.
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write(headers);
                myWriter.write(values);
                myWriter.close(); // to close the file writer
            }
        }

        userInput.close(); // to close the Scanner

    }
}