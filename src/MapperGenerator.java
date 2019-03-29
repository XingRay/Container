import java.io.File;

public class MapperGenerator {
    public static void main(String[] args){
        generateMapper();
    }

    private static void generateMapper(String packageName) {
        File mapper = new File("mapper");

        for (int i = 0; i < types.length; i++) {
            String fromName = names[i];
            String fromType = types[i];

            for (int j = 0; j < types.length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                String toName = names[j];
                String toType = types[j];
                String generic = (i == 0 || j == 0) ? "<T> " : "";
                String fileName = fromName + toName + "Mapper.java";
                String s = packageName + "public interface " + fromName + toName + "Mapper " + generic + "{\n" +
                        "    " + toType + " map(" + fromType + " value);\n" +
                        "}";
                Util.writeToFile(mapper, fileName, s);
            }
        }
    }
}
