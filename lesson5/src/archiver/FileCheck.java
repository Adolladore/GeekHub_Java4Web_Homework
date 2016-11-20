package archiver;

import java.io.File;

/**
 * Created by danil on 20.11.2016.
 */
public class FileCheck {

    public boolean checkFile(File directory){
        if (directory.isAbsolute() || directory.exists()) {
            return true;
        } else {
            return false;
        }
    }

    public FileType getTypeOfFile(File file){
        if (getFileExtension(file) == "mp3" || getFileExtension(file) == "wav" || getFileExtension(file) == "wma") {
            return FileType.AUDIO;
        } else if (getFileExtension(file) == "avi" || getFileExtension(file) == "mp4" || getFileExtension(file) == "flv") {
            return  FileType.VIDEO;
        } else if (getFileExtension(file) == "jpeg" || getFileExtension(file) == "jpg" || getFileExtension(file) == "gif") {
            return FileType.IMAGE;
        } else {
            return null;
        }
    }


    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
    }

}
