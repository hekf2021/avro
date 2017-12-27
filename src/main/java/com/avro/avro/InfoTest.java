package com.avro.avro;


import com.avro.Info;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.File;
import java.io.IOException;

public class InfoTest {
    public static void main(String args[]) {
        Info info = new Info();
        info.setId("123");
        info.setName("abc");
        info.setApk("apk");
        info.setCom("com");
        //Serialize user1, user2 and user3 to disk
        File file = new File("info.avro");
        DatumWriter<Info> userDatumWriter = new SpecificDatumWriter<Info>(Info.class);
        DataFileWriter<Info> dataFileWriter = new DataFileWriter<Info>(userDatumWriter);
        try {
            dataFileWriter.create(info.getSchema(), file);
            dataFileWriter.append(info);
            dataFileWriter.close();
        } catch (IOException e) {
        }
        //Deserialize Users from dist
        DatumReader<Info> userDatumReader =  new SpecificDatumReader<Info>(Info.class);
        DataFileReader<Info> dataFileReader = null;
        try {
            dataFileReader = new DataFileReader<Info>(file, userDatumReader);
        } catch (IOException e) {
        	e.printStackTrace();
        }
        Info in = null;
        try {
            while (dataFileReader.hasNext()) {
                in = dataFileReader.next(in);
                System.out.println(in);
            }
        } catch (IOException e) {
        }
    }
}