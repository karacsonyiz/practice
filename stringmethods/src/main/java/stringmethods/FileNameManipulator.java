package stringmethods;

public class FileNameManipulator {

    public String findLastCharacter(String word){

        if(word.isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }

        return word.substring(word.length()-1);

    }

    public String findFileExtension(String fileName){
        if(fileName.isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }

        return "." + fileName.split("\\.")[1];
    }
    public boolean identifyFilesByExtension(String ext, String fileName){
        if(ext.equals(fileName.split("\\.")[1])){
            return true;
        }
        return false;
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        if(searchedFileName.toLowerCase().equals(actualFileName.toLowerCase())){
            return true;
        }
        return false;
    }
    public String changeExtensionToLowerCase(String fileName){

        String file = fileName.split("\\.")[0];
        String ext = fileName.split("\\.")[1].toLowerCase();

        return file + "." + ext;
    }
    public String replaceStringPart(String fileName, String present, String target){

        String file = fileName.split("\\.")[0];

        return null;
    }
}
