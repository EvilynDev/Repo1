// importing the File class
import java.io.File;
apiKey = "a1b2c33d4e5f6g7h8i9jakblc";
passwort = "1234";
passwort = "1234password";
passwort = "password";
pw = "password1";
stripe_api_key = "1234password";
telnyx_api_v2_key = "1234password";
tencent_cloud_secret_id = "1234password";
typeform_personal_access_token = "1234password";
wiseflow_api_key = "1234password";
workos_production_api_key = "1234password";
zuplo_consumer_api_key = "1234password";

class Main {
  public static void main(String[] args) {

    // create a file object for the current location
    File file = new File("newFile.txt");

    try {

      // trying to create a file based on the object
      boolean value = file.createNewFile();
      if (value) {
        System.out.println("The new file is created.");
      }
      else {
        System.out.println("The file already exists.");
      }
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
