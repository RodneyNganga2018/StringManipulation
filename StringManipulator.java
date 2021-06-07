public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        return String.format("%s%s", (str1.trim()), (str2.trim()));
    }

    public Integer getIndexOrNull(String str, char character) {
        Integer index = str.indexOf(character);
        if (index != -1) {
            return index;
        } else {
            return null;
        }
    }

    public Integer getIndexOrNull(String str, String subString) {
        Integer index = str.indexOf(subString.substring(0,1));
        if (index != -1) {
            return index;
        } else {
            return null;
        }
    }

    public String concatSubstring(String str1, int leftLimit, int rightLimit, String str2) {
        return String.format("%s%s", (str1.substring(leftLimit,rightLimit)), str2);
    }
}