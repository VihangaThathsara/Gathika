package modal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import modal.beans.Home;

/**
 *
 * @author isuru Priyamantha
 */
public class HomeInfo {

    public Home getHome() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("homeinfo.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        Home home = (Home) objectInputStream.readObject();
        objectInputStream.close();
        return home;
    }

    public void setHome(Home home) throws FileNotFoundException, IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("homeinfo.ser"));
        objectOutputStream.writeObject(home);
        objectOutputStream.close();
    }

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
