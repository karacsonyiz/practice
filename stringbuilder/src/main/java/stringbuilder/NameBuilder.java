package stringbuilder;

public class NameBuilder {

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){

        if(familyName == null || givenName == null) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(familyName.isEmpty() || givenName.isEmpty()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder sb = new StringBuilder();

        if(title != null) {
            sb.append(title.getValue()).append(" ");
        }
        sb.append(givenName).append(" ");

        if(middleName != null){
            if(!middleName.isEmpty())
                sb.append(middleName).append(" ");
        }

        sb.append(familyName);

        return sb.toString();

    }

    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){
        if(familyName == null || givenName == null) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        if(familyName.isEmpty() || givenName.isEmpty()) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder sb = new StringBuilder();

        if(title != null) {
            sb.append(title.getValue()).append(" ");
        }
        sb.append(familyName).append(" ");

        if(middleName != null){
            if(!middleName.isEmpty())
                sb.append(middleName).append(" ");
        }
        sb.append(givenName);
        return sb.toString();
    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder sb = new StringBuilder(name);
        int start = sb.indexOf(where);
        sb.insert(start," " + title.getValue());
        return sb.toString();
    }

    public String deleteNamePart(String name, String delete) {
        StringBuilder sb = new StringBuilder(name);
        int start = sb.indexOf(delete);
        sb.delete(start,start + delete.length());
        System.out.println(delete.length());
        return sb.toString();
    }
}
