package archiver;

import java.io.*;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import static java.rmi.Naming.list;

/**
 * Created by danil on 20.11.2016.
 */
public class ZipArchiver {
    static FileCheck checker = new FileCheck();
    public static void main(String[] args) throws IOException {
        File dir = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("Enter a path of directory: ");
                String path = reader.readLine();
                dir = new File(path);
                if (dir.isDirectory()) {
                    break;
                }
                else {
                    System.out.println("Invalid path!");
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Error:  " + e);
        }
        archiveFiles(getFilesByExtention(dir,"mp3","wav","wma"),"audio.zip");
        archiveFiles(getFilesByExtention(dir,"avi","mp4","flv"),"video.zip");
        archiveFiles(getFilesByExtention(dir,"jpeg","jpg","gif"),"image.zip");
    }

    static List<File> listOfFiles(File path) throws MalformedURLException, RemoteException {
        List<File> fileList = new ArrayList<>();
        String[] sDirList = path.list();

        for(int i = 0; i < sDirList.length; i++) {
            fileList.add(new File(path + File.separator + sDirList[i]));

            if(fileList.get(i).isFile()) {
                System.out.println(path + File.separator + sDirList[i]);
            } else {
                list(path + File.separator + sDirList[i]);
            }
        }
        return fileList;
    }

    private static List<File> getFilesByExtention(File dir, String...extensions) throws MalformedURLException, RemoteException {
        List<File> files = new ArrayList<File>();
        for (File file : listOfFiles(dir)) {
            for (String extention : extensions) {
                if (file.getName().endsWith("." + extention)) {
                    files.add(file);
                }
            }
        }
        return files;
    }


    private static void archiveFiles (List<File> sourceFiles, String zipFileName) throws IOException {
        try (FileOutputStream outputStream = new FileOutputStream(zipFileName);
             ZipOutputStream zipOut = new ZipOutputStream(outputStream)) {
            for (File sourceFile : sourceFiles) {
                FileInputStream inputStream = new FileInputStream(sourceFile);
                ZipEntry zipEntry = new ZipEntry(sourceFile.getName());
                zipOut.putNextEntry(zipEntry);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = inputStream.read(bytes)) >= 0) {
                    zipOut.write(bytes, 0, length);
                }
                inputStream.close();
            }
        }
    }
}
