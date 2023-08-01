package stringbuilder;

public class NameBuilder {

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){
        if(familyName == null || givenName == null) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(title == null) {
            return givenName + " " + middleName + " " + familyName;
        }

        return title.getValue() + " " + givenName + " " + middleName + " " + familyName;
    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){
        if(familyName == null || givenName == null) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(title == null) {
            return familyName + " " + middleName + " " +  givenName;
        }
        return title.getValue()+ " " + familyName + " " + middleName + " " +  givenName;
    }

    public String insertTitle(String name, Title title, String where) {
        return null;
    }

    public String deleteNamePart(String name, String delete) {
        return null;
    }


}
