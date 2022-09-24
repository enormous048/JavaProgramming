package utilities;

import java.util.*;

public class MapUtility {


    //Тепер я поняв перемагу поліморфізму, тут я можу в параметр поставити Меп і метод буде приймати будьякий із видів Мепу
    //і тому не треба зайвий раз писати повно методів


    //Returns given LinkedHashMap in descending order.
    public static LinkedHashMap descendValue(Map<String, Integer> map1, String nullKeyType){

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            String largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<String, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap descendValue(Map<Integer, Integer> map1, Integer nullKeyType){

        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Integer largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Integer, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap descendValue(Map<Double, Integer> map1, Double nullKeyType){

        LinkedHashMap<Double, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Double largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Double, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap descendValue(Map<Long, Integer> map1, Long nullKeyType){

        LinkedHashMap<Long, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Long largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Long, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap descendValue(Map<Float, Integer> map1, Float nullKeyType){

        LinkedHashMap<Float, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Float largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Float, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap descendValue(Map<Character, Integer> map1, Character nullKeyType){

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Character largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Character, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap descendValue(Map<Byte, Integer> map1, Byte nullKeyType){

        LinkedHashMap<Byte, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Byte largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Byte, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap descendValue(Map<Short, Integer> map1, Short nullKeyType){

        LinkedHashMap<Short, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Short largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Short, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    
    //Returns given LinkedHashMap in descending order. Make your key as Object if your key doesn't match with keys in methods above
    public static LinkedHashMap descendValue(Map<Object, Integer> map1, Object nullKeyType){

        LinkedHashMap<Object, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Object largestKey = null;
            Integer largestValue = Integer.MIN_VALUE;

            for (Map.Entry<Object, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()>largestValue){
                    largestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, largestValue);
            map1.remove(largestKey);
        }

        return result;
    }








    //Returns given LinkedHashMap in ascending order.
    public static LinkedHashMap ascendValue(Map<String, Integer> map1, String nullKeyType){

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            String largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<String, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap ascendValue(Map<Integer, Integer> map1, Integer nullKeyType){

        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Integer largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Integer, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap ascendValue(Map<Double, Integer> map1, Double nullKeyType){

        LinkedHashMap<Double, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Double largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Double, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap ascendValue(Map<Long, Integer> map1, Long nullKeyType){

        LinkedHashMap<Long, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Long largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Long, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap ascendValue(Map<Float, Integer> map1, Float nullKeyType){

        LinkedHashMap<Float, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Float largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Float, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap ascendValue(Map<Character, Integer> map1, Character nullKeyType){

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Character largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Character, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap ascendValue(Map<Byte, Integer> map1, Byte nullKeyType){

        LinkedHashMap<Byte, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Byte largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Byte, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }

    public static LinkedHashMap ascendValue(Map<Short, Integer> map1, Short nullKeyType){

        LinkedHashMap<Short, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Short largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Short, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }


    //Returns given LinkedHashMap in ascending order. Make your key as Object if your key doesn't match with keys in methods above
    public static LinkedHashMap ascendValue(Map<Object, Integer> map1, Object nullKeyType){

        LinkedHashMap<Object, Integer> result = new LinkedHashMap<>();

        int firstSize = map1.size();

        for(int i = 0; i <= firstSize-1; i++){
            //якшо луп це фор іч для з ентрісет або вельюс або кісет, то вибє помилу якшо всередині буде map.remove()

            Object largestKey = null;
            Integer lowestValue = Integer.MAX_VALUE;

            for (Map.Entry<Object, Integer> entry2 : map1.entrySet()){

                if (entry2.getValue()<lowestValue){
                    lowestValue = entry2.getValue();
                    largestKey = entry2.getKey();
                }
            }

            result.put(largestKey, lowestValue);
            map1.remove(largestKey);
        }

        return result;
    }


}
