import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Answer{
    public static void main(String args[]) throws IOException {
        String headerToSave = "\"LastName\",\"FirstName\",\"middleName\",\"Gender\",\"IsSingle\",\"BirthDate\",\"BirthPlace\",\"MobileNumber\",\"EmailAddress\",\"PresentHouseNo\",\"PresentLotNo\",\"PresentStreet\",\" PresentSubdivision/Barangay\",\"PresentMunicipality\",\"PresentProvince\",\"PresentZipCode\",\"PermanentHouseNo.\",\"PermanentLotNo.\"\"PermanentStreet\",\"PermanentSubdivision/Barangay\",\"PermanentMunicipality\",\"PermanentProvince\",\"PermanentZipCode\"\n" ;
        String dataToSave = "\"Ayapana\",\"Arnold\",\"DeAsis\",\"M\",\"Y\",\"April10\",\"VictoriaNorthernSamar\",\"09669866733\",\"arnoldayapana72@gmail.com\",\"0\",\"0\",\"Purok6\",\" Culasi\",\"Matnog\",\"Sorsogon\",\"4708\",\"0\",\"0\",\"Purok6\",\"Culasi\",\"Matnog \",\"Sorsogon\",\"4708\"\n" ;
        File myFile = new File("personal_data.csv");
        FileWriter myFileWriter = new FileWriter(myFile, true);
        myFileWriter.write(headerToSave);
        myFileWriter.write(dataToSave);
        myFileWriter.close();
    }
}