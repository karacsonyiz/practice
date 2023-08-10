package stringmethods;

public class FileNameManipulator {

    public String findLastCharacter(String word){
        isNull(word);
        isEmpty(word);

        return word.trim().substring(word.trim().length()-1);
    }

    public String findFileExtension(String fileName){
        isNull(fileName);
        isEmpty(fileName);

        if(fileName.split("\\.").length != 2) {
            throw new IllegalArgumentException("Invalid file name!");
        }

        if(fileName.split("\\.")[0].isEmpty()){
            throw new IllegalArgumentException("Invalid file name!");
        }

        return "." + fileName.split("\\.")[1];
    }
    public boolean identifyFilesByExtension(String ext, String fileName){
        isNull(fileName);
        isNull(ext);
        isEmpty(ext.trim());

        if(fileName.split("\\.").length != 2){
            throw new IllegalArgumentException("Invalid argument!");
        }

        if(fileName.split("\\.")[0].isEmpty()){
            throw new IllegalArgumentException("Invalid argument!");
        }

        return ext.equals(fileName.split("\\.")[1]);
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        isNull(searchedFileName);
        isEmpty(searchedFileName.trim());
        isNull(actualFileName);
        isEmpty(actualFileName.trim());

        return searchedFileName.equalsIgnoreCase(actualFileName);
    }
    public String changeExtensionToLowerCase(String fileName){
        isEmpty(fileName.trim());

        if(fileName.split("\\.").length != 2){
            throw new IllegalArgumentException("Invalid argument!");
        }

        if(fileName.split("\\.")[0].trim().equals("")){
            throw new IllegalArgumentException("Invalid argument!");
        }

        return fileName.split("\\.")[0] + "." + fileName.split("\\.")[1].toLowerCase();
    }
    public String replaceStringPart(String fileName, String present, String target){
        isNull(fileName);
        isEmpty(fileName.trim());

        return fileName.replaceAll(present,target);
    }

    private void isNull(String str){
        if(str == null) {
            throw new IllegalArgumentException("Invalid argument!");
        }
    }

    private void isEmpty(String str){
        if(str.isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }
    }
}
