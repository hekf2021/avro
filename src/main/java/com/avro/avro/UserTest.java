package com.avro.avro;
import java.io.*;
import java.lang.*;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.file.DataFileReader;
import com.avro.User;
 
public class UserTest {
    public static void main(String args[]) {
        User user1 = new User();
        user1.setName("Alyssa");
        user1.setFavoriteNumber(256);
        // Leave favorite color null
 
        // Alternate constructor
        User user2 = new User("Ben", 7, "red");
 
        // Construct via builder
        User user3 = User.newBuilder()
             .setName("Charlie")
             .setFavoriteColor("blue")
             .setFavoriteNumber(null)
             .build();
        User user4 = new User("Ben2", 8, "red2");
        //Serialize user1, user2 and user3 to disk
        File file = new File("users.avro");
        DatumWriter<User> userDatumWriter = new SpecificDatumWriter<User>(User.class);
        DataFileWriter<User> dataFileWriter = new DataFileWriter<User>(userDatumWriter);
        try {
            dataFileWriter.create(user1.getSchema(), file);
            dataFileWriter.append(user1);
            dataFileWriter.append(user2);
            dataFileWriter.append(user3);
            dataFileWriter.append(user4);
            dataFileWriter.close();
        } catch (IOException e) {
        }
        //Deserialize Users from dist
        DatumReader<User> userDatumReader =  new SpecificDatumReader<User>(User.class);
        DataFileReader<User> dataFileReader = null;
        try {
            dataFileReader = new DataFileReader<User>(file, userDatumReader);
        } catch (IOException e) {
        	e.printStackTrace();
        }
        User user = null;
        try {
            while (dataFileReader.hasNext()) {
                user = dataFileReader.next(user);
                System.out.println(user);
            }
        } catch (IOException e) {
        }
    }
}