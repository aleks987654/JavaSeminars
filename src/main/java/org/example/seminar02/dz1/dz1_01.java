package org.example.seminar02.dz1;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        StringBuilder result = new StringBuilder();
        result.append(QUERY);
        String PAR = PARAMS.trim();

        String[] keyValuePairs = PAR.replaceAll("^\\{", "").replaceAll("}$", "").split(",");
        for (String pair : keyValuePairs) {
            String[] keyValue = pair.split(":");
            String key = keyValue[0].trim().replaceAll("^\"|\"$", "");
            String value = keyValue[1].trim().replaceAll("^\"|\"$", "'");
            if (value.indexOf("null") == -1) {
                result.append(key).append("=").append(value).append(" and ");
            }
        }
        return result.delete(result.length() - 5, result.length());
    }
}

public class dz1_01 {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println();
        System.out.println(ans.answer(QUERY, PARAMS)+"!");
        //System.out.println(PARAMS);

    }
}
