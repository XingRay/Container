import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {



    public static void main(String[] args) {
//        generateMapper();
        generateIndexMapper();
//        generateConvert();
//        generateToList();
    }

    private static void generateToList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < types.length; i++) {
            String fromType = types[i];
            String boxName = boxedName[i];
            String s = "" +
                    "public static ArrayList<" + boxName + "> toList(" + fromType + "[] array) {\n" +
                    "    if (isEmpty(array)) {\n" +
                    "        return null;\n" +
                    "    }\n" +
                    "\n" +
                    "    ArrayList<" + boxName + "> result = new ArrayList<>();\n" +
                    "    for (" + fromType + " value : array) {\n" +
                    "        result.add(value);\n" +
                    "    }\n" +
                    "    return result;\n" +
                    "}\n\n";

            stringBuilder.append(s);

        }

        writeToFile(new File("./tolist"), "ToList.java", stringBuilder.toString());
    }

    private static void generateConvert() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < types.length; i++) {
            String fromType = types[i];
            String fromName = names[i];

            for (int j = 0; j < types.length; j++) {
                if (i == 0 || j == 0) {
                    continue;
                }
                String toType = j == 0 ? boxedName[i] : types[j];
                String toName = names[j];
                String generic = j == 0 ? "<" + boxedName[i] + ">" : i == 0 ? "<" + boxedName[j] + ">" : "";
                String s = "" +
                        "    public static " + toType + "[] convert(" + fromType + "[] array, " + fromName + toName + "Mapper" + generic + " mapper) {\n" +
                        "        if (isEmpty(array)) {\n" +
                        "            return null;\n" +
                        "        }\n" +
                        "\n" +
                        "        int length = array.length;\n" +
                        "        " + toType + "[] result = new " + toType + "[length];\n" +
                        "        for (int i = 0; i < length; i++) {\n" +
                        "            result[i] = mapper.map(array[i]);\n" +
                        "        }\n" +
                        "        return result;\n" +
                        "    }\n\n";
                stringBuilder.append(s);
            }
        }

        Util.writeToFile(new File("./convert"), "Convert.java", stringBuilder.toString());
    }

    private static void generateIndexMapper() {
        String packageName = "package com.xingray.container.operators.primary.indexmapper;\n\n";
        File mapper = new File("indexmapper");

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
                String fileName = fromName + toName + "IndexMapper.java";
                String s = packageName + "public interface " + fromName + toName + "IndexMapper " + generic + "{\n" +
                        "    " + toType + " map(int index, " + fromType + " value);\n" +
                        "}";
                Util.writeToFile(mapper, fileName, s);
            }
        }
    }
}
