package modal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;


public class HomeInfo {


    public Vector getlog() throws IOException, ClassNotFoundException {
        File file = new File("loginfo.ser");
        if (!file.exists()) {
            return new Vector();
        }

        FileInputStream inputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Vector logData = (Vector) objectInputStream.readObject();
        objectInputStream.close();
        return logData;
    }

    public void setlog(Vector log) throws FileNotFoundException, IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("loginfo.ser"));
        objectOutputStream.writeObject(log);
        objectOutputStream.close();
    }

}
