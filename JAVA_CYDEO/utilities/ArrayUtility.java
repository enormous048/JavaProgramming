package utilities;

public class ArrayUtility {

    //prints each element from given array
    public static void printEachElement(String[] arr){
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void printEachElement(int[] arr){
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void printEachElement(double[] arr){
        for (double s : arr) {
            System.out.println(s);
        }
    }

    public static void printEachElement(char[] arr){
        for (char s : arr) {
            System.out.println(s);
        }
    }


    //returns true if given string is contained at given String array
    public static boolean isContained(String[] arr, String str){

        boolean result = false;
        for (String s : arr) {
            if (str.equals(s)){
                result =  true;
                break;
            }
        }
        return result;


    }

    //returns true if given int is contained at given int array
    public static boolean isContained(int[] arr, int num){

        boolean result = false;
        for (int s : arr) {
            if (num==s){
                result =  true;
                break;
            }
        }
        return result;


    }

    //returns true if given double is contained at given double array
    public static boolean isContained(double[] arr, double num){

        boolean result = false;
        for (double s : arr) {
            if (num==s){
                result =  true;
                break;
            }
        }
        return result;


    }

    //returns true if given char is contained at given char array
    public static boolean isContained(char[] arr, char ch){

        boolean result = false;
        for (char s : arr) {
            if (ch==s){
                result =  true;
                break;
            }
        }
        return result;


    }
    
    
    

    //add new element at the end of given array
    public static String[] addAfterLast(String[] arr, String str){
        String[] result = new String[arr.length + 1]; // 0,0,0,0,0,0

        for (int i = 0; i <=arr.length-1 ; i++) {
            result[i] = arr[i];
        }
        result[result.length-1] = str;

        return result;
    }

    public static double[] addAfterLast(double[] arr, double num){
        double[] result = new double[arr.length + 1];

        for (int i = 0; i <=arr.length-1 ; i++) {
            result[i] = arr[i];

        }
        result[result.length-1] = num;

        return result;
    }

    public static int[] addAfterLast(int[] arr, int num){
        int[] result = new int[arr.length + 1];

        for (int i = 0; i <=arr.length-1 ; i++) {
            result[i] = arr[i];
        }
        result[result.length-1] = num;

        return result;
    }

    public static char[] addAfterLast(char[] arr, char ch){
        char[] result = new char[arr.length + 1];

        for (int i = 0; i <=arr.length-1 ; i++) {
            result[i] = arr[i];
        }
        result[result.length-1] = ch;

        return result;
    }


    
    //returns the frequency of given element at given array
    public static int frequencyOfElement(int[] arr, int num ){

        int count = 0;
        for (int i : arr) {
            if (i == num){
                count++;
            }
        }
        return count;

    }

    public static int frequencyOfElement(char[] arr, char ch ){

        char count = 0;
        for (char i : arr) {
            if (i == ch){
                count++;
            }
        }
        return count;

    }

    public static int frequencyOfElement(double[] arr, double num ){

        int count = 0;
        for (double i : arr) {
            if (i == num){
                count++;
            }
        }
        return count;

    }

    public static int frequencyOfElement(String[] arr, String str ){

        int count = 0;
        for (String i : arr) {
            if (i.equals(str)){
                count++;
            }
        }
        return count;

    }

    
    

    //removes element from given index
    public static String[] removeElement(String[] arr, int index ){
        if (index < 0 || index >= arr.length){ //бо не ма такого індекса як еррей ленз. максимльний який ми можем забрати це еррейленз -1
            System.out.println("Invalid index");
            System.exit(0);
        }

        String[] result = new String[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //це апроач щоб скіпнути певний індекс 
            }
            result[i] = arr[j];
        }
        return result;
    }

    public static int[] removeElement(int[] arr, int index ){
        if (index < 0 || index >= arr.length){ //бо не ма такого індекса як еррей ленз. максимльний який ми можем забрати це еррейленз -1
            System.out.println("Invalid index");
            System.exit(0);
        }
        int[] result = new int[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //j зміщує індекс елемента який не потрібен
            }
            result[i] = arr[j]; // і лишається на місці
        }
        return result;
    }

    public static char[] removeElement(char[] arr, int index ){
        if (index < 0 || index >= arr.length){ //бо не ма такого індекса як еррей ленз. максимльний який ми можем забрати це еррейленз -1
            System.out.println("Invalid index");
            System.exit(0);
        }
        char[] result = new char[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //це апроач щоб скіпнути певний індекс 
            }
            result[i] = arr[j];
        }
        return result;
    }

    public static double[] removeElement(double[] arr, int index ){
        if (index < 0 || index >= arr.length){ //бо не ма такого індекса як еррей ленз. максимльний який ми можем забрати це еррейленз -1
            System.out.println("Invalid index");
            System.exit(0);
        }
        double[] result = new double[arr.length-1];

        for (int i = 0, j = 0; i <= result.length-1; i++, j++) {
            if (j == index){
                j++; //це апроач щоб скіпнути певний індекс 
            }
            result[i] = arr[j];
        }
        return result;
    }




    //merges to given arrays, returns array
    public static double[] merge(double[] arr, double[] arr2){

        double[] result =new double[arr.length+ arr2.length];

        int index = 0;
        for (double v : arr) {
            result[index] = v;
            index++;
        }
        for (double v : arr2) {
            result[index] = v;
            index++;
        }
        return result;

    }

    public static int[] merge(int[] arr, int[] arr2){

        int[] result =new int[arr.length+ arr2.length];

        int index = 0;
        for (int v : arr) {
            result[index] = v;
            index++;
        }
        for (int v : arr2) {
            result[index] = v;
            index++;
        }
        return result;

    }

    public static char[] merge(char[] arr, char[] arr2){

        char[] result =new char[arr.length+ arr2.length];

        int index = 0;
        for (char v : arr) {
            result[index] = v;
            index++;
        }
        for (char v : arr2) {
            result[index] = v;
            index++;
        }
        return result;

    }

    public static String[] merge(String[] arr, String[] arr2){

        String[] result =new String[arr.length+ arr2.length];

        int index = 0;
        for (String v : arr) {
            result[index] = v;
            index++;
        }
        for (String v : arr2) {
            result[index] = v;
            index++;
        }
        return result;

    }
    
    
    
    
    //reverses given array, returns array
    public static String[] reverse(String[] arr){
        String[] result = new String[arr.length];
        
        for (int i = arr.length-1, j=0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];

        for (int i = arr.length-1, j=0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static double[] reverse(double[] arr){
        double[] result = new double[arr.length];

        for (int i = arr.length-1, j=0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }

    public static char[] reverse(char[] arr){
        char[] result = new char[arr.length];

        for (int i = arr.length-1, j=0; i >= 0; i--, j++) {
            result[j] = arr[i];
        }
        return result;
    }



    //returns new array with unique elements from given array
    public static String[] uniqueElements(String[] arr){

        String[] result = {};//якшо не знаєш довжини ні елеметів то пустий еррей декларуєш



        for (int i = 0; i <= arr.length-1; i++) {//зафіксовуєм кожен елемент

            //arr[i] авдяки лупу просуває всі елементи ерррею в метод - і якшо каунт в методі == 1 то він юнік
            if ( ArrayUtility.frequencyOfElement(arr, arr[i]) == 1) { //якшо він лише один такий в ерреї то запихається в резулт
                result = ArrayUtility.addAfterLast(result, arr[i]);
            }
        }
        return result;
    }

    public static char[] uniqueElements(char[] arr){

        char[] result = {};//якшо не знаєш довжини ні елеметів то пустий еррей декларуєш



        for (int i = 0; i <= arr.length-1; i++) {//зафіксовуєм кожен елемент

            if ( ArrayUtility.frequencyOfElement(arr, arr[i]) == 1) { //якшо він лише один такий в ерреї то запихається в резулт
                result = ArrayUtility.addAfterLast(result, arr[i]);
            }
        }
        return result;
    }

    public static int[] uniqueElements(int[] arr){

        int[] result = {};//якшо не знаєш довжини ні елеметів то пустий еррей декларуєш



        for (int i = 0; i <= arr.length-1; i++) {//зафіксовуєм кожен елемент

            if ( ArrayUtility.frequencyOfElement(arr, arr[i]) == 1) { //якшо він лише один такий в ерреї то запихається в резулт
                result = ArrayUtility.addAfterLast(result, arr[i]);
            }
        }
        return result;
    }

    public static double[] uniqueElements(double[] arr){

        double[] result = {};//якшо не знаєш довжини ні елеметів то пустий еррей декларуєш



        for (int i = 0; i <= arr.length-1; i++) {//зафіксовуєм кожен елемент

            if ( ArrayUtility.frequencyOfElement(arr, arr[i]) == 1) { //якшо він лише один такий в ерреї то запихається в резулт
                result = ArrayUtility.addAfterLast(result, arr[i]);
            }
        }
        return result;
    }
    
    

    //returns new array without duplicate elements from given array
    public static String[] removeDuplicate(String[] arr){
        String[] result = {};

        for (String s : arr) {
            if (!isContained(result, s)){ //якшо елемент ще не контейниться в резулт то добавляєм його в резулт
                result = addAfterLast(result, s); //заново ініціалізуєм резулт бо він іммютабл
            }
        }
        return result;
    }

    public static double[] removeDuplicate(double[] arr){
        double[] result = {};

        for (double s : arr) {
            if (!isContained(result, s)){ //якшо елемент ще не контейниться в резулт то добавляєм його в резулт
                result = addAfterLast(result, s); //заново ініціалізуєм резулт бо він іммютабл
            }
        }
        return result;
    }

    public static int[] removeDuplicate(int[] arr){
        int[] result = {};

        for (int s : arr) {
            if (!isContained(result, s)){ //якшо елемент ще не контейниться в резулт то добавляєм його в резулт
                result = addAfterLast(result, s); //заново ініціалізуєм резулт бо він іммютабл
            }
        }
        return result;
    }

    public static char[] removeDuplicate(char[] arr){
        char[] result = {};

        for (char s : arr) {
            if (!isContained(result, s)){ //якшо елемент ще не контейниться в резулт то добавляєм його в резулт
                result = addAfterLast(result, s); //заново ініціалізуєм резулт бо він іммютабл
            }
        }
        return result;
    }




    //replaces element from given index with given newValue
    public static int[] replaceElement(int[] arr, int index, int newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }

        arr[index] = newValue;
        return arr;

    }

    public static char[] replaceElement(char[] arr, int index, char newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }
        arr[index] = newValue;
        return arr;

    }

    public static String[] replaceElement(String[] arr, int index, String newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }
        arr[index] = newValue;
        return arr;

    }

    public static double[] replaceElement(double[] arr, int index, double newValue){

        if (index < 0 || index >= arr.length){
            System.out.println("Invalid index = " + index);
            System.exit(0);
        }
        arr[index] = newValue;
        return arr;

    }



    //replaces all matching given oldValue from given array with newValue
    public static int[] replaceAll(int[] arr, int oldValue, int newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }

    public static double[] replaceAll(double[] arr, double oldValue, double newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }

    public static String[] replaceAll(String[] arr, String oldValue, String newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i].equals(oldValue)){
                arr[i] = newValue;
            }
        }
        return arr;

    }

    public static char[] replaceAll(char[] arr, char oldValue, char newValue){

        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
        return arr;

    }
    
    


    /*
    isContained *
    addAfterLast *
    printEachElement
    uniqueElement*
    frequencyOfElement *
    removeElement *
    removeDuplicate*
    reverse*
    merger *

     */
}
