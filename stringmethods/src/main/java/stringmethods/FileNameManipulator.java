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
        return null;
    }
    public boolean identifyFilesByExtension(String ext, String fileName){
        return false;
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return false;
    }
    public String changeExtensionToLowerCase(String fileName){
        return null;
    }
    public String replaceStringPart(String fileName, String present, String target){
        return null;
    }
}
