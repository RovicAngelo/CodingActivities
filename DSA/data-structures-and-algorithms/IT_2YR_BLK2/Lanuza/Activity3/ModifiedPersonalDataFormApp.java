package IT_2YR_BLK2.Lanuza.Activity3;

/*
 ACTIVITY 3: Modify the personal data form
 Submitted by: Rovic Angelo Lanuza
 Course/Year/Block: BSIT 2-2
 */

//For the User Inputs
import java.util.Scanner;

public class ModifiedPersonalDataFormApp {
        public static void main(String[] args) {
                Scanner userInput = new Scanner(System.in);

                System.out.println();
                System.out.println("Please provide the exact informations.");
                System.out.println("========== Personal Information ==========");

                // prompts user for last name
                System.out.print("Last Name : ");
                String lastName = userInput.nextLine();

                // prompts user for first name
                System.out.print("First Name : ");
                String firstName = userInput.nextLine();

                // prompts user for middle name
                System.out.print("Middle Name : ");
                String middleName = userInput.nextLine();

                // prompts user for gender
                System.out.print("Gender (M for Male, F for Female, X for LGBTQ+) : ");
                char gender = userInput.nextLine().charAt(0);

                // prompts user for marital status
                System.out.print("Are you single? (Y for Yes, N for No) : ");
                boolean isSingle;
                if (isSingle = userInput.nextLine().equals("Y")) {
                        isSingle = true;
                } else {
                        isSingle = false;
                }

                // prompts user for Birth Date
                System.out.print("Birth Date (MM/dd/yyyy): ");
                String birthDate = userInput.nextLine();

                // prompts user for Birth Place
                System.out.print("Birth Place : ");
                String birthPlace = userInput.nextLine();
                System.out.println();
                System.out.println("========== Contact Information ==========");

                // prompts user for mobile number
                System.out.print("Mobile Number (Omit +63 or 0) : ");
                Long mobileNumber = Long.parseLong(userInput.nextLine());

                // prompts user for email address
                System.out.print("Email Address : ");
                String emailAddress = userInput.nextLine();
                System.out.println();
                System.out.println("========== Address Information ==========");
                System.out.println("Present Address");
                System.out.println("=========================================");

                // prompts user for present House Number
                System.out.print("House No. : ");
                int presentHouseNo = Integer.parseInt(userInput.nextLine());

                // prompts user for present Lot Number
                System.out.print("Lot No. : ");
                int presentLotNo = Integer.parseInt(userInput.nextLine());

                // prompts user for present Street Name
                System.out.print("Street Name : ");
                String presentStreetName = userInput.nextLine();

                // prompts user for present Subdivision or Barangay
                System.out.print("Subdivision/Barangay : ");
                String presentSubdivisionBarangay = userInput.nextLine();

                // prompts user for present Municipality
                System.out.print("Municipality : ");
                String presentMunicipality = userInput.nextLine();

                // prompts user for present Province
                System.out.print("Province : ");
                String presentProvince = userInput.nextLine();

                // prompts user for present Zip Code
                System.out.print("Zip Code : ");
                int presentZipCode = Integer.parseInt(userInput.nextLine());

                // ask user if present and permanent address is the same or not
                System.out.print(
                                "Does your present address is the same as your permanent address? (Y for yes, N for no) : ");
                char isPresentPermament = userInput.nextLine().charAt(0);

                if (isPresentPermament == 'N') {
                        /*
                         * if the present and permanent address is not the same,
                         * prompt the user for permanent address informations.
                         */
                        System.out.println();
                        System.out.println("Permanent Address");
                        System.out.println("=========================================");

                        // prompts user for permanent house number
                        System.out.print("House No. : ");
                        int permanentHouseNo = Integer.parseInt(userInput.nextLine());

                        // prompts user for permanent Lot Number
                        System.out.print("Lot No. : ");
                        int permanentLotNo = Integer.parseInt(userInput.nextLine());

                        // prompts user for permanent Street Name
                        System.out.print("Street Name : ");
                        String permanentStreetName = userInput.nextLine();

                        // prompts user for permanent Subvidision or Barangay
                        System.out.print("Subdivision/Barangay : ");
                        String permanentSubdivisionBarangay = userInput.nextLine();

                        // prompts user for permanent Municipality
                        System.out.print("Municipality : ");
                        String permanentMunicipality = userInput.nextLine();

                        // prompts user for permanent Province
                        System.out.print("Province : ");
                        String permanentProvince = userInput.nextLine();

                        // prompts user for permanent Zip Code
                        System.out.print("Zip Code : ");
                        int permanentZipCode = Integer.parseInt(userInput.nextLine());
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

                }

                userInput.close(); // to close the Scanner

        }
}
