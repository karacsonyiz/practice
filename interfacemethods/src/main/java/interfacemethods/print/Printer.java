package interfacemethods.print;

public class Printer {

    public String print(Printable printable) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < printable.getLength(); i++){
            if(!printable.getColor(i).equals(Printable.BLACK)){
                sb.append("[").append(printable.getColor(i)).append("]").append(printable.getPage(i)).append("\n");
                continue;
            }
            sb.append(printable.getPage(i)).append("\n");
        }
        return sb.toString();
    }
}
