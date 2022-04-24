// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.


import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


/**im Stuff*/
public class stuff {
    public static stuff getInstance()
    {
        return InstanceHolder.mInstance;
    }

    private int teamNumber = 6969;

    private String teamString = Integer.toString(teamNumber);
    private String teamNum = teamString.substring(0, teamString.length()/2) + "." + teamString.substring(teamString.length()/2);
    private static final int BUFFER_SIZE = 4096;
    private static File file = new File("README.md");
    private File todaysFile = new File("media//" + getDate() + "//hello.txt");
    private static String ultimatePath = file.getAbsolutePath().substring(0, file.getAbsolutePath().indexOf("\\" + file.getName()));

    public void robotInitPlsWork()
    {
        //goodMorning();
        //writeToSystem();// may not have to do this
        //writeToRio(); // do this once then never again
        ftpShit();
    }

    public static void main(String[] args) {
       /* System.out.println(Filesystem.getOperatingDirectory().getAbsolutePath());
        System.out.println(Filesystem.getDeployDirectory().getAbsolutePath());
        System.out.println(Filesystem.getLaunchDirectory().getAbsolutePath());*/
        stuff stuf = stuff.getInstance();
        stuf.robotInitPlsWork();
    }

    public void writeToSystem()
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ultimatePath + "//hello.txt", true))) {
           // writer.print(new Date().toString());
            //writer.println();
            writer.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
    }

    public String getDate()
    {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    public void writeToRio(String message)
    {
        try (PrintWriter writer = new PrintWriter(new FileWriter("media//" + getDate() + "//hello.txt", true))) {
            writer.println(message);
            writer.print(new Date().toString());
            writer.println();
            writer.close();
            if(todaysFile.length() > 100000)
            {
                todaysFile.delete();
            }
          } catch (IOException e) {
            e.printStackTrace();
          }
    }

    public void goodMorning()
    {
        //for roborio
        boolean test = new File("media//" + getDate() + "//").mkdirs();
    }

    public void ftpShit()
    {
        //"ftp://tom:secret@www.myserver.com/project/2012/Project.zip;type=i";
        String ftpUrl = "ftp://10." + teamNum + ".2//media//" + getDate() + "//hello.txt";
        String host = "ftp://10." + teamNum + ".2";
        //String host = "ftp://roboRIO-1836-frc.local";
        String user = "admin";
        String pass = "";
        String filePath = "//media//" + getDate() + "//hello.txt";
        String savePath = ultimatePath + "//hello.txt";

        ftpUrl = String.format(ftpUrl, user, pass, host, filePath);
        System.out.println("URL: " + ftpUrl);

        try 
        {
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            InputStream inputStream = conn.getInputStream();

            FileOutputStream outputStream = new FileOutputStream(savePath);

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            outputStream.close();
            inputStream.close();

            System.out.println("File downloaded");
        } 
        catch (IOException ex)
         {
            ex.printStackTrace();
        }
    }

    private static class InstanceHolder
    {
        private static final stuff mInstance = new stuff();
    } 
}